
/**
 *
 * @author Wanrada 6434482623
 */
public class Course {
    private String SubjectName,SubjectID;
    private int Credit;
    
    public Course (String Name,String ID) {
        SubjectName=Name; SubjectID=ID; Credit=3;
    }
    
    public Course (String Name,String ID,int totalCredit) {
        SubjectName=Name; SubjectID=ID; Credit=totalCredit;
    }
    
    public void SetCid (String ID) {
        SubjectID=ID;
    }
    
    public void SetCname (String Name) {
        SubjectName=Name;
    }
    
    public void SetCname (int totalCredit) {
        Credit=totalCredit;
    }
    
    public String getCname() {
        return SubjectName;
    }
    
    public String getCid() {
        return SubjectID;
    }
    
    public int getCredit() {
        return Credit;
    }
    
    public Boolean equals(Course another) {
        return SubjectName.equals(another.SubjectName)
               &&SubjectID.equals(another.SubjectID)
               &&Credit==another.Credit; 
    }
    
    public int compare(Course another) {
        if (SubjectName.equals(another.SubjectName)
            &&SubjectID.equals(another.SubjectID)
            &&Credit==another.Credit) {
            return 0;
        } else if (SubjectName.equals(another.SubjectName)
            &&SubjectID.equals(another.SubjectID)
            &&Credit==another.Credit) {
            return 1;
        } else if (!SubjectName.equals(another.SubjectName)
            &&SubjectID.equals(another.SubjectID)
            &&Credit==another.Credit) {
            return 2;
        } else if (SubjectName.equals(another.SubjectName)
            &&SubjectID.equals(another.SubjectID)
            &&Credit!=another.Credit) {
            return 3;
        } else if (!SubjectName.equals(another.SubjectName)
            &&SubjectID.equals(another.SubjectID)
            &&Credit!=another.Credit) {
            return 4;
        } else if (SubjectName.equals(another.SubjectName)
            &&SubjectID.equals(another.SubjectID)
            &&Credit!=another.Credit) {
            return 5;
        } else if (!SubjectName.equals(another.SubjectName)
            &&SubjectID.equals(another.SubjectID)
            &&Credit==another.Credit) {
            return 6;
        } else {
            return 7;
        }
    }
    
    public String toString () {
            return SubjectID+" "+SubjectName+" "+Credit;
        }
}

