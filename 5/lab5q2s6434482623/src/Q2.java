import java.util.Scanner;

/**
 *
 * @author Wanrada 6434482623
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
        int ID,Credit;
        String Subject;
        
        System.out.print("Enter course ID, course name, credit: ");
        ID = input.nextInt();
        Subject = input.next();
        Credit = input.nextInt();
        Course Subject1 = new Course(Subject,ID,Credit);
        
        System.out.print("Enter course ID, course name: ");
//        ID = input.nextInt();
//        Subject = input.next();
//        Course Subject2 = new Course(Subject,ID);
        
        if (Subject1.equals(Subject2)==false) {
            System.out.println("Different course name, coure ID and credit.");
            System.out.println(Subject1.toString());
            System.out.println(Subject2.toString());
            System.out.println("Total credit: "+(Subject1.getCredit()+Subject2.getCredit()));
        } else {
            System.out.println("Same course");
            System.out.println("Enter course ID, course name: ");
            ID = input.nextInt();
            Subject2.SetCid(ID);
            Subject = input.next();
            Subject2.SetCname(Subject);
            System.out.println(Subject1.toString());
            System.out.println(Subject2.toString());
            System.out.println("Total credit: "+(Subject1.getCredit()+Subject2.getCredit()));
        }
    }
}
