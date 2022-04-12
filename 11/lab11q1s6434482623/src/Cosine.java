

/**
 *
 * @author Wanrada 6434482623
 */
public class Cosine extends Taylor {
    
    public Cosine(int k, double x) {
        super(k,x);
    }
    
    @Override
    public void printValue() {
        System.out.println("Value from Math.cos() is " + Math.cos(super.getValue()) + ".");
        System.out.println("Approximated value is " + this.getApprox() + ".");
    }   
    @Override
    public double getApprox() {
        double approx = 0;
        for (int n = 0; n <= super.getIteration(); n++) {
            approx += Math.pow(-1,n)*Math.pow(super.getValue(),2*n)/super.factorial(2*n);
        }
        return approx;
    }
}
