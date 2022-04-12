import java.awt.Point;

/**
 *
 * @author Wanrada 6434482623
 */
public abstract class Quadrilateral {
    private Point a,b,c,d;
    
    public Quadrilateral (int x1, int y1,int x2, int y2,int x3, int y3,int x4, int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }
    
    public double[] getSortedDist() {
        double[] dist = new double[6];
        
        dist[0] = a.distance(b);
        dist[1] = a.distance(c);
        dist[2] = a.distance(d);
        dist[3] = b.distance(c);
        dist[4] = b.distance(d);
        dist[5] = c.distance(d);
        
        for (int i = 0; i < dist.length; i++) {
            for (int j = i+1; j < dist.length; j++) {
                double tmp = 0;  
                if (dist[i] > dist[j]) {  
                    tmp = dist[i];  
                    dist[i] = dist[j];  
                    dist[j] = tmp;  
                }  
            }
        }
        
        return dist;
    }
    
    @Override
    public String toString() {
        return a+"\n"+b+"\n"+c+"\n"+d;
    }
    
    public abstract double area();
}
