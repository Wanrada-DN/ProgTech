
/**
 *
 * @Wanrada 64344826223
 */
public class Mtx {
    private int row,columm;
    private int[][] matrix;
    
    public Mtx (int[][] arr_2d) {
        row = arr_2d.length; columm = arr_2d[0].length; matrix = arr_2d;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getColumm() {
        return columm;
    }
    
    public int[][] getMatrix() {
        return matrix;
    }
    
    public boolean equalSize(Mtx another) {
        return this.row==another.row && this.columm==another.columm;
    }
    
    public boolean compatible(Mtx another) {
        return this.columm==another.row;
    }
    
    
    public Mtx add(Mtx another) {
        int[][] sum =  new int[row][columm];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < columm; j++) {
                sum[i][j] = this.matrix[i][j] + another.matrix[i][j];
            }
        }
        Mtx summat = new Mtx(sum);
        return summat;
    }
    
    public Mtx mul(Mtx another) {
        int[][] sum =  new int[this.row][another.columm];
        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < another.columm; j++) {
                for(int k = 0; k < another.row; k++)
                sum[i][j] += this.matrix[i][k] * another.matrix[k][j];
            }
        }
        Mtx summat = new Mtx(sum);
        return summat;
    }
    
    public Mtx mul(int n) {
        int[][] sum = new int[row][columm];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < columm; j++) {
            sum[i][j] = this.matrix[i][j]*n;   
            }
        }
        Mtx summat = new Mtx(sum);
        return summat;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
