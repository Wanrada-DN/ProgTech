import java.util.Scanner;

/**
 *
 * @Wanrada 6434482623
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Press 1 to sum three integers.");
        System.out.println("Press 2 to find roots of quadratic equation.");
        System.out.println("Press 3 find the area of a rectangle.");
        System.out.println("Press 4 to print A's.");
        
        int choose = input.nextInt();
        
        if (choose == 1){
            System.out.println("Enter 3 integers:");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println("Sum: "+(a+b+c));
        } else if (choose == 2){
            System.out.println("Enter a, b,c for ax^2+bx+c=0 :");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            if (Math.pow(b, 2)-(4*a*c)>=0){
                double x1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
                double x2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
                System.out.println("Two roots: "+x1+", "+x2);
            } else {
                System.out.println("No solotion");
            }
        } else if (choose == 3){
            System.out.println("Enter the length of 2 sides of the rectangle:");
            double a = input.nextDouble();
            double b = input.nextDouble();
            System.out.println("Area: "+(a*b));
        } else if (choose == 4){
            System.out.println("How many A's?");
            int totalA =input.nextInt();
            System.out.println("A".repeat(totalA));
        } else {
            System.out.println("Invalid choice");
        }
    }
}
