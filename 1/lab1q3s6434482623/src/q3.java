import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner stnum = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float firstnum = stnum.nextFloat();
        
        Scanner ndnum = new Scanner(System.in);
        System.out.println("Enter another number: ");
        float secondnum = ndnum.nextFloat();
        
        float result = (firstnum*secondnum)/(firstnum+secondnum);
        
        System.out.println("The ratio between their product and their sum is "+result);
    }
}
