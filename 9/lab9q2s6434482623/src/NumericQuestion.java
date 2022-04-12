

/**
 *
 * @author Wanrada 6434482623
 */
public class NumericQuestion extends Question {
    public NumericQuestion (String text) {
        super(text);
    }
    
    @Override
    public boolean checkAnswer(String response) {
        double numAnswer = Double.parseDouble(super.getAnswer());
        double numRespond = Double.parseDouble(response);
        
        return numRespond > numAnswer-0.01 && numRespond < numAnswer+0.01;
    }
}
