

/**
 *
 * @author Wanrada 6434482623
 */
public abstract class Taylor {
    private int k;
    private double x;
    
    public Taylor(int k,double x) {
        this.k = k; 
        this.x = x;
    }
    
    public int factorial(int n) {
        if ( n >= 1) {
            return n*this.factorial(n-1);
        } else {
            return 1;
        }
    }
    
    public int getIteration() {
        return this.k;
    }
    
    public double getValue() {
        return this.x;
    }
    
    public abstract void printValue();
    public abstract double getApprox();
}
