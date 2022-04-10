import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner inputname = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = inputname.nextLine();
        
        Scanner inputage = new Scanner(System.in);
        System.out.println("Enter birth year: ");
        int year = inputage.nextInt();
        
        System.out.println(name+" is "+(2565-year)+" years old.");
    }
}
