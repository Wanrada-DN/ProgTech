import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @Wanrada 6434482623
 */
public class Q1 {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String[] line;
        String id;
        String subject;
        int credit;
        ArrayList<Course> listCourse = new ArrayList<Course>();
        
        System.out.println("Enter course ID, name, credit: or X to stop");
        id = input.next();
        while (!id.equals("X")) {
            line = input.nextLine().trim().split(" ");
            subject = String.join(" ", Arrays.copyOfRange(line, 1, line.length-1));
            credit = Integer.parseInt(line[line.length-1]);
            listCourse.add(new Course(subject,id,credit));
            
            id = input.next();
        }
         System.out.println(Course.numberOfCourse() + " courses");
         for(int facID : Course.onlyFacID()) {
             System.out.println(Course.numberOfFacCourse(facID)+" courses for "+ facID);
         }
    }
}



