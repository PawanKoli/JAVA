package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        Stream<Integer> s1 = nums.stream();
        
        nums.forEach(n -> System.out.println(n));
        System.out.println("Now with stream");

        s1.forEach(n -> System.out.println(n));

    }
}
