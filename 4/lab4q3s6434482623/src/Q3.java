import java.util.Scanner;

/**
 *
 * @Wanrada 6434482623
 */
public class Q3 {
    public static void main(String[] args) {
        
    double x;
    double y;
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Point A: ");
    x = input.nextDouble();
    y = input.nextDouble();
    Point firstPoint = new Point(x,y);
    
    System.out.print("Point B: ");
    x = input.nextDouble();
    y = input.nextDouble();
    Point secondPoint = new Point(x,y);
    
    double distance = firstPoint.distance(secondPoint);
    System.out.println("A = "+firstPoint.toString()+" B = "+secondPoint.toString()+" Distance = "+distance);
    
    System.out.print("Move the points: ");
    x = input.nextDouble();
    y = input.nextDouble();
    firstPoint.translate(x, y);
    secondPoint.translate(x, y);
    System.out.println("A = "+firstPoint.toString()+" B = "+secondPoint.toString()+" Distance = "+distance);
    
    if (firstPoint.equals(secondPoint) == true){
        System.out.println("A and B are at the same position");
    }
    else {
        System.out.println("A and B are not at the same position");
    }
    }   
}
