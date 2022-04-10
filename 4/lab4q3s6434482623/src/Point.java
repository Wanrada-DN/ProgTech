

/**
 *
 * @Wanrada 6434482623
 */
public class Point {
    private double x,y;
    
    public Point(double px , double py) {
        x=px; y=py;
    }
    
    public double distance(Point another) {
        double distance = Math.sqrt(Math.pow(x-another.x,2)+Math.pow(y-another.y,2));
        return distance; 
    }
    
    public void translate(double dx, double dy) {
        x+=dx; y+=dy;
    }
    
    public Boolean equals(Point other)  {
        return x == other.x && y == other.y;
    }
    
    public String toString()    {
        return "("+x+","+y+")";
    }
}
