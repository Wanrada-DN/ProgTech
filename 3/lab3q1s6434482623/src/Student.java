import java.util.GregorianCalendar;
import java.util.Calendar;

public class Student {
    private String Name,ID; 
    private Calendar BD;
    
    public Student(String id,String name) {
        ID=id; Name=name; BD=new GregorianCalendar();
    }
    
    public Student(String id, Calendar birthday, String name) {
        ID=id; BD=birthday;  Name=name;
    }
    
    public void setBD(int bday, int bmonth,int byear) {
        BD.set(byear,bmonth,bday);
    }
    
    public void setName(String name) {
        Name=name;
    }
    
    public Calendar getBD() {
        return BD;
    }
    
    public String getName() {
        return Name;
    }
    
    public String getID() {
        return ID;
    }
    
    public int getAge() {
        GregorianCalendar gcal = new GregorianCalendar();
        int cyear = gcal.get(Calendar.YEAR);
        int byear = BD.get(Calendar.YEAR);
        int age = cyear-byear;
        return age;
    }
    
    public int daysToYears(int totalday) {
        int totalyear = totalday/365;
        return totalyear;
    }

    public boolean equals(Student first) {
            return ID.equals(first.ID)
                   &&Name.equals(first.Name) 
                   &&BD.get(Calendar.DATE) == (first.BD.get(Calendar.DATE))
                   &&BD.get(Calendar.MONTH) == (first.BD.get(Calendar.MONTH))
                   &&BD.get(Calendar.YEAR) == (first.BD.get(Calendar.YEAR));
        }
    
    public String toString() {
        int bday = BD.get(Calendar.DATE);
        int bmonth = BD.get(Calendar.MONTH);
        int byear = BD.get(Calendar.YEAR);
        String info = ID+" "+Name+" "+bday+" "+bmonth+" "+byear;
        return info;
    }
}

