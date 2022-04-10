import java.util.Scanner;
import java.util.GregorianCalendar;     
import java.util.Calendar;
import java.util.Date;
        
public class Q2 {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();
        int cday = gcal.get(Calendar.DATE);
        int cmonth = gcal.get(Calendar.MONTH);
        int cyear = gcal.get(Calendar.YEAR);       
        System.out.println("Current Date: "+cday+" "+cmonth+", "+cyear);
        Date cDate = new Date(2022,0,4);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day: ");
        int fday = input.nextInt();
        System.out.println("Enter month: ");
        int fmonth = input.nextInt();      
        System.out.println("Enter year: ");
        int fyear = input.nextInt();
        Date fDate = new Date(fyear,fmonth-1,fday-1);
        
        long timeDiff = (fDate.getTime()-cDate.getTime());
        int dayDiff = (int) (timeDiff/(24*60*60*1000));
                
        System.out.println("Number of days: "+dayDiff);
    }
}
