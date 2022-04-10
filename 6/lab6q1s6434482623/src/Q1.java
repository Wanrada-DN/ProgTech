import java.util.Scanner;

/**
 *
 * @Wanrada 6434482623
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double sumGrade = 0;
        double sumCredit = 0;
        
        System.out.println("Enter course ID, credit and grade; or X to terminate");
        String id = input.next();
        
        while (!id.equals("X"))    {
            int credit = input.nextInt();
            String grade = input.next();
            double numGrade;
            
            numGrade = switch (grade) {
                case "A" -> 4.0;
                case "B+" -> 3.5;
                case "B" -> 3.0;
                case "C+" -> 2.5;
                case "C" -> 2.0;
                case "D+" -> 1.5;
                case "D" -> 1.0;
                default -> 0;
            };
            
            sumCredit += credit;
            sumGrade += numGrade*credit;
            
            id =input.next();
        }    
        
        if (sumGrade != 0 && sumCredit != 0)    {
            System.out.println("GPA = "+(sumGrade/sumCredit));
        }
    }
}
