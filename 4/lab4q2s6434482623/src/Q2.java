import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter firstname lastname age: ");
        
        String info = input.nextLine();
        info = info.trim();
        
        String firstname = info.substring(0, info.indexOf(" ")).trim();
        String lastname = info.substring(info.indexOf(" "),info.indexOf(" "+1)).trim();
        String age = info.substring(info.indexOf(" "+1)).trim();
        System.out.println(lastname+", "+firstname+" is "+age+" years old.");
    }
}
