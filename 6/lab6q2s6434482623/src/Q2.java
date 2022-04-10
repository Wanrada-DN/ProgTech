import java.util.Scanner;
/**
 *
 * @Wanrada 6434482623
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a, b ,c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int sum = 0;
        
        for (int i = a; i<=b; i++)  {
            for (int j = i; j<= c*i; j++)
                sum += i*i+j;        
        }
        System.out.println("Answer = "+sum);
    }
}
