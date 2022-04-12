import java.util.ArrayList;

/**
 *
 * @author Wanrada 6434482623
 */
public class BusTester {
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<>();
        
        arr.add(new Hybrid(45,1200000,600,150,1));
        arr.add(new CNGBus(50,1000000,200,2));
        
        for(Bus bus : arr) {
            System.out.println("ID : "+ bus.getID());
            if (bus instanceof CNGBus cng) {
                System.out.println("Emission Tier: "+cng.getEmissionTier());
            } else if (bus instanceof Hybrid hyb) {
                System.out.println("Emission Tier: "+hyb.getEmissionTier());
            }
            System.out.println("Accel: "+bus.getAccel());
        }
    }
}
