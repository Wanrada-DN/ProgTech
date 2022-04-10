
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @Wanrada 6434482623
 */
public class Q3 {
    public static void main(String[] args) {
        try {
            File scoreFile = new File("score.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            
            double score;
            double max = 0;
            double min = 0;
            double sum = 0;
            int count = 0;
            
            if (scoreReader.hasNextLine()) {
                max = scoreReader.nextDouble();
                min = scoreReader.nextDouble();
            }
            
            while (scoreReader.hasNextLine())   {
                score = scoreReader.nextDouble();
                sum += score;
                count++;
                
                if (score>max) {
                    max = score;
                }
                if (score<min) {
                    min = score;
                }
            }
            double avg = sum/count;
            
            System.out.println("Average score = "+avg);
            System.out.println("Highest score = "+max);
            System.out.println("Lowest score = "+min);
            
            scoreReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An orror occurred.");
        }        
    }
}
