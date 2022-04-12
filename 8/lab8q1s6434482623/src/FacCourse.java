
/**
 *
 * @Wanrada 6434482623
 */
public class FacCourse {
    private int facCode;
    private int totalCourse;
    
    public FacCourse(int facultyCode) {
        facCode = facultyCode; totalCourse = 1;
    }
    
    public void addCourse() {
        totalCourse++;
    }
    
    public int getFacultyCode() {
        return facCode;
    }
    
    public int getTotalCourse() {
        return totalCourse;
    }
}
