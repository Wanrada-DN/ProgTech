import java.util.Scanner;
        
public class Q1 {
    public static void main(String[] args) {
        Scanner inName = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = inName.nextLine();
        
        Scanner inAge = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = inAge.nextInt();
        
        System.out.println(name+" was born in "+(2022-age)+".");
    }
}
