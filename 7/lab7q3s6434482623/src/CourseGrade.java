
/**
 *
 * @author Wanrada 6434482623
 */
public class CourseGrade {
    public Course course;
    public String grade;
    
    public CourseGrade (Course c, String g) {
        course = c; grade = g;
    }
    
    public double getGreadeNumber () {
        return switch (grade) {
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D+" -> 1.5;
            case "D" -> 1.0;
            default -> 0;
        };
    }
    
    @Override
    public String toString() {
        return course.getCid()+" "+course.getCname()+" "+course.getCredit()+" "+grade;
    }
}
