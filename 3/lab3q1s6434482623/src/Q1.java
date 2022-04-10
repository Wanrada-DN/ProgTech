import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String Name,ID;
        int bDay,bMonth,bYear;
        Calendar BD = new GregorianCalendar();
        
        System.out.println("Student 1: Enter ID, birthday, name");
        ID = input.next();
        bDay = input.nextInt();
        bMonth = input.nextInt();
        bYear = input.nextInt();
        Name = input.nextLine();
        BD.set(bYear,bMonth-1,bDay);
        
        Student first = new Student(ID,BD,Name);
        
        System.out.println("Student 2: Enter ID, name");
        ID = input.next();
        Name = input.nextLine();
        
        Student second = new Student(ID,Name);
        
        System.out.println("Student 1: "+first.getID()+" "+first.getName()+" "+first.getAge());
        System.out.println("Student 2: "+second.getID()+" "+second.getName()+" "+second.getAge()); 
        if (first.equals(second) == true) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
        
        System.out.println("Enter birthday for student 2: ");
        bDay = input.nextInt();
        bMonth = input.nextInt();
        bYear = input.nextInt();
        second.setBD(bDay,bMonth,bYear);
        
        System.out.println("Student 1: "+first.getID()+" "+first.getName()+" "+first.getAge());
        System.out.println("Student 2: "+second.getID()+" "+second.getName()+" "+second.getAge()); 
        if (first.equals(second) == true) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
