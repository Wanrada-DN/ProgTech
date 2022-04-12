import java.util.Scanner;
import java.util.Random;

/**
 *
 * @Wanrada 6434482623
 */
public class Q2 {
    public static int[][] randomMatrix(int r, int c) {
        Random random = new Random();
        int[][] matrix = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = random.nextInt(-100, 101);
            }
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mtx A,B,C,sum;
        
        A = new Mtx(randomMatrix(10,5));
        B = new Mtx(randomMatrix(10,5));
        C = new Mtx(randomMatrix(5,3));
        
        System.out.println("A =");
        Mtx.printMatrix(A.getMatrix());
        System.out.println("");
        
        System.out.println("B =");
        Mtx.printMatrix(B.getMatrix());
        System.out.println("");
        
        System.out.println("C =");
        Mtx.printMatrix(C.getMatrix());
        System.out.println("");
        
        if (A.equalSize(B)){
            System.out.println("A+B =");
            Mtx.printMatrix(A.add(B).getMatrix());
            System.out.println("");
        } else {
            System.out.println("A and B are not same size");
            System.out.println("");
        }
        
        System.out.println("2*B =");
        Mtx.printMatrix(B.mul(2).getMatrix());
        System.out.println("");
        
        if (A.compatible(B)){
            System.out.println("A*B =");
            Mtx.printMatrix(A.mul(B).getMatrix());
            System.out.println("");
        } else {
            System.out.println("A and B are not compatible");
            System.out.println("");
        }
        
        if (A.compatible(C)){
            System.out.println("A*C =");
            Mtx.printMatrix(A.mul(C).getMatrix());
            System.out.println("");
        } else {
            System.out.println("A and C are not compatible");
        }
    }
}
