import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Navin", "Harshad", "Laxmi");

        // List<String> uName = name.stream()
        //                         .map(str -> str.toUpperCase())
        //                         .toList();
        // System.out.println(uName);
        
        List<String> uName = name.stream()
                                .map(String::toUpperCase) // just add the class name or the obect name to use that function
                                .toList();
        
        uName.forEach(System.out::println);
    }    
}
