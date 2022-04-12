

/**
 *
 * @author Wanrada 6434482623
 */
public class Subject implements Evaluation {
    private String subjName;
    private int[] score;
    
    public Subject(String subjName,int[] score) {
        this.subjName = subjName;
        this.score = score;
    } 
    
    @Override
    public double evaluate() {
        int total = 0;
        int count = score.length;
        for (int sc : score) {
            total += sc;
        }
        return total/count;
    }
    
    @Override
    public char grade(double score) {
        return score >= 70 ? 'P' : 'F';
    }
    
    @Override
    public String toString() {
        return this.subjName;
    }
}
