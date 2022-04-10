import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
         Scanner inputname = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = inputname.nextLine();
        
        Scanner inputage = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = inputage.nextInt();
        
        System.out.println(name+" is "+age+" years old.");
    }
}
