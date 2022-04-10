import java.util.Random;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Calendar current = Calendar.getInstance();
        GregorianCalendar gcal = new GregorianCalendar();
        int cday = gcal.get(Calendar.DATE);
        current.set(Calendar.DATE, cday);
        int cmonth = gcal.get(Calendar.MONTH);
        current.set(Calendar.MONTH, cmonth);
        int cyear = gcal.get(Calendar.YEAR);
        current.set(Calendar.YEAR, cyear);
        System.out.println("Current date: "+cday+"-"+cmonth+"-"+cyear);
        
        Calendar bday = Calendar.getInstance();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        int randomDay = 1+(int)(Math.random()*(28-1)+1);
        bday.set(Calendar.DATE, randomDay);
        int randomMonth = (int)(Math.random()*(11)+1);
        bday.set(Calendar.MONTH, randomMonth);
        int randomYear = 2000+(int)(Math.random()*(2021-2000)+1);
        bday.set(Calendar.YEAR, randomYear);
        System.out.println("Birth date: "+randomDay+"-"+randomMonth+"-"+randomYear);
        
        long timeDiff = current.getTime().getTime() - bday.getTime().getTime();
        int dayDiff = (int)(timeDiff/(24*60*60*1000)+1);
        System.out.println("Age in days: "+dayDiff);
    }
}
