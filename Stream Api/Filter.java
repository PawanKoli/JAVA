import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0).map(n -> n*2);

        int result = s2.reduce(0, (c,e) -> c+e);
        System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                                            .filter(n -> n%2==0)
                                            .sorted();
        sortedValues.forEach(n -> System.out.println(n));
        // s2.forEach(n -> System.out.println(n));
    }
}
