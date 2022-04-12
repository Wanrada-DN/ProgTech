

/**
 *
 * @author Wanrada 6434482623
 */
public class Expo extends Taylor {
    
    public Expo(int k, double x) {
        super(k,x);
    }
    
    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is " + Math.exp(super.getValue()) + ".");
        System.out.println("Approximated value is " + this.getApprox() + ".");
    }   
    @Override
    public double getApprox() {
        double approx = 0;
        for (int n = 0; n <= super.getIteration(); n++) {
            approx += Math.pow(super.getValue(),n)/super.factorial(n);
        }
        return approx;
    }
}
