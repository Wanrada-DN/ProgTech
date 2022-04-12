
/**
 *
 * @author Wanrada 6434482623
 */
public class main {
    public static void main(String[] args) {
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue(); 
        
        System.out.println("\n");
        Taylor[] arr = new Taylor [3];
        arr[0] = new Expo(7, 1);
        arr[1] = new Sine(7, Math.PI/4);
        arr[2] = new Cosine(7, 1);
        
        for(int i=0; i<3; i++) {
            arr[i].printValue();
        }
    }
}
