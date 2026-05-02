import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students {
    private String name;
    private int age;
    
    
    public Students() {
    }


    public Students(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }

}

public class ConstrucotrReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Prakash", "Lakshmi");

        List<Students> student = new ArrayList<>();

        // for(String name : names) {
        //     student.add(new Students(name));
        // }

        //Now with Stream
        // student = names.stream()
        //                 .map(name -> new Students(name))
        //                 .toList();

        //Now with constructor reference
        student = names.stream()
                        .map(Students::new)
                        .toList();

        System.out.println(student);
    }
}
