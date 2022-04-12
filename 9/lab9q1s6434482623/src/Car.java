

/**
 *
 * @author Wanrada 63434482623
 */
public class Car {
    private double gas;
    private double efficiency;
    
    public Car (double gas,double efficiency) {
        this.gas = gas;
        this.efficiency = efficiency;
    }
    
    public void drive(double distance) {
        double usedGas = distance/efficiency;
        
        if (usedGas > this.gas) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            this.gas -= usedGas;
        }
    }
    
    public void setGas(double amount) {
        this.gas = amount;
    }
    
    public double getGas() {
        return this.gas;
    }
    
    public double getEfficiency() {
        return this.efficiency;
    }
    
    public void addGas(double amount) {
        this.gas += amount;
    }
    
}
