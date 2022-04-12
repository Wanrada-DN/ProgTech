import java.util.Scanner;

/**
 *
 * @Wanrada 6434482623
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        int[] prime = new int[n];
        
        if (n != 0) {
            prime[0] = 2;
            int num = 3;
            int i = 1;
            while (i < n) {
                boolean isPrime = true;
                for (int round = 0; round < prime.length; round++) {
                    if (prime[round] != 0) {
                        if (num % prime[round] == 0) {
                        isPrime = false;
                        break;
                        }
                    }
                }
                if (isPrime) {
                    prime[i] = num;
                    i++;
                }
                num++;
            }
        }
        System.out.println();
            for (int j = 0; j<prime.length; j++) {
            System.out.println(prime[j]);   
        }
    }        
}



