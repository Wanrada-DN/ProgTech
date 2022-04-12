

/**
 *
 * @author Wanrada 6434482623
 */
public class Hybrid extends Bus implements LiquidFuel,Electric {
    private double voltage;
    private double range;
    private int emissionTier;
    
    public Hybrid(int capacity,double cost,double voltage,double range,int emissionTier) {
        super(capacity, cost);
        if (voltage < LOW_VOLTAGE) {
            this.voltage = LOW_VOLTAGE;
        } else if (voltage > HIGH_VOLTAGE) {
            this.voltage = HIGH_VOLTAGE;
        } else {
            this.voltage = voltage;
        }
        this.range = range;
        this.emissionTier = emissionTier;
    }
    
    @Override
    public double getAccel() {
        return 4.0;
    }
    
    @Override
    public double getRange() {
        return this.range;
    }
    
    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }
    
    @Override
    public double getVoltage() {
        return this.voltage;
    }
}
