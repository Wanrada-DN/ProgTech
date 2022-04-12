import java.util.ArrayList;

/**
 *
 * @author Wanrada 6434482623
 */

public class Course {
    private String SubjectName,SubjectID;
    private int Credit;

    static int total;
    static ArrayList<FacCourse> facultyCourse = new ArrayList<FacCourse>(); 
    
    public Course (String Name,String ID) {
        SubjectName=Name; SubjectID=ID; Credit=3; total++; this.addFacCourse(ID);
    }
    
    public Course (String Name,String ID,int totalCredit) {
        SubjectName=Name; SubjectID=ID; Credit=totalCredit; total++; this.addFacCourse(ID);
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
    
    public static int numberOfCourse() {
        return total;
    }
    
    public static int numberOfFacCourse(int facultyCode) {
        for (FacCourse facID : facultyCourse) {
            if (facID.getFacultyCode() == facultyCode) {
                return facID.getTotalCourse();
            }
        }
        return 0;
    }
    
    public int checkFacIndex(int facultyCode) {
        for(int i =0 ; i < facultyCourse.size(); i++) {
            if (facultyCourse.get(i).getFacultyCode() == facultyCode) {
                return i;
            }
        }
        return -1;
    }
    
    public void addFacCourse(String ID) {
        int facID = Integer.parseInt(ID.substring(0,2));
        int facIndex = this.checkFacIndex(facID);
            if (facIndex != -1) {
                facultyCourse.get(facIndex).addCourse();
            } else {
                facultyCourse.add(new FacCourse(facID));
            }
        
    }
    
    public static ArrayList<Integer> onlyFacID(){
        ArrayList<Integer> listOfFaculty = new ArrayList<>();
        for (FacCourse facID : facultyCourse) {
            listOfFaculty.add(facID.getFacultyCode());
        }
        return listOfFaculty;
    }
}


