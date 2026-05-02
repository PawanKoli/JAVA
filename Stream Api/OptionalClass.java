import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Prakash", "Vikash", "Rashmi");
        
        Optional<String> name = names.stream()
                            .filter(str -> str.contains("i"))
                            .findFirst();
    
        // System.out.println(name.get());
        System.out.println(name.orElse("Not found")); // This will not show the error

        // Or if u dont wanna use the Optional then use orElse
        String name2 = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not Found");

        System.out.println(name2);
    }
}
