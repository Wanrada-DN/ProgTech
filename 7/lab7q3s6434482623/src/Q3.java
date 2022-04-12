import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @Wanrada 6434482623
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String ID;
        String Name;
        
        String[] line;
        String courseId;
        String courseName;
        int credit;
        
        String grade;
        
        Student[] studentList = new Student[3];
        System.out.println("Enter 3 student ID and name: ");
        for (int i = 0; i < 3; i++) {
            ID = input.next();
            Name = input.nextLine().trim();
            studentList[i] = new Student(ID,Name);
        }
        System.out.println(Arrays.toString(studentList));
        
        Course[] courseList = new Course[5];
        System.out.println("Enter 5 course ID, name and credit: ");
        for (int i = 0; i < 5; i++) {
            line = input.nextLine().split(" ");
            courseId = line[0];
            courseName = String.join(" ", Arrays.copyOfRange(line, 1, line.length-1));
            credit = Integer.parseInt(line[line.length-1]);
            courseList[i] = new Course(courseName,courseId,credit);
        }
        System.out.println(Arrays.toString(courseList));
        
        for (int i = 0; i < 3; i++) {
            System.out.println(studentList[i].getName()+" grade report: ");
            courseId = input.next();
            while(!courseId.equals("X")) {
                grade = input.nextLine().trim();
                for (Course course : courseList) {
                    if (course.getCid().equals(courseId)) {
                    studentList[i].addGradeReport(course, grade);
                    }
                }
                courseId = input.next();
            }
        }
        
        for (Student student : studentList) {
            System.out.println("------ Transcript ------");
            System.out.println("  "+student.getID()+" "+student.getName());
            for (CourseGrade course : student.gradedCourse()) {
                System.out.println(course);
            }
            System.out.println("  GPA: "+student.calGPA());
        }
    }    
}
