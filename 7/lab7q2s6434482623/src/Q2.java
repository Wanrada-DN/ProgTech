import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @Wanrada 6434482623
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        ArrayList<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        
        for (int i = 3; i < n; i++) {
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            } else {
                for (int round = 0; round < prime.size(); round++) {
                    if (i % prime.get(round) == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                prime.add(i);
            }
        }
        if (n >= 2) {
            System.out.println();
            for (int j = 0; j < prime.size(); j++) {
                System.out.println(prime.get(j));
            }
        }
    }
}
