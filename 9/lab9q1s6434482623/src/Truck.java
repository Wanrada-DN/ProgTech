
/**
 *
 * @author Wanrada 63434482623
 */
public class Truck extends Car {
    private double M_weight;
    private double weight;
    
    public Truck(double gas,double efficiency,double M_weight,double weight) {
        super(gas, efficiency);
        this.M_weight = M_weight;
        
        if (weight > M_weight) {
            this.weight = M_weight;
        } else {
            this.weight = weight;
        }
    }
    
    @Override
    public void drive(double distance) {
        double usedGas = distance/this.getEfficiency();
        double sumGas;
        
        if (this.weight < 1) {
            sumGas = usedGas;
        } else if (this.weight >= 1 && this.weight <= 10) {
            sumGas = usedGas + (usedGas*0.1);
        } else if (this.weight >= 11 && this.weight <= 20) {
            sumGas = usedGas + (usedGas*0.2);
        } else {
            sumGas = usedGas + (usedGas*0.3);
        }
        
        if (sumGas > super.getGas()) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            super.setGas(super.getGas()-sumGas);
        }
    } 
}
