// Generate Binary numbers from 1 to n
import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        System.out.print("Enter Last No. : ");
        int n = sc.nextInt();
        String result[] = new String[n];
        q.add("1");

        for(int i=0; i<n; i++){
            result[i] = q.remove();

            String n1 = result[i] + "0";
            String n2 = result[i] + "1";

            q.add(n1);
            q.add(n2);
            System.out.println( i+1 + " -> " + result[i]);
        }

    }
}
