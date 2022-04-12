
/**
 *
 * @author Wanrada 6434482623
 */
public class Question {
    private String text;
    private String answer;
    
    public Question () {
        
    }
    
    public Question (String text) {
        this.text = text;
    }
    
    public void setText (String text) {
        this.text = text ;
    }
    
    public void setAnswer (String answer) {
        this.answer = answer ;
    }
    
    public String getText () {
        return this.text;
    }
    
    public String getAnswer () {
        return this.answer;
    }
    
    public boolean checkAnswer(String response) {
        return response.equals(this.answer);
    }
    
    public void display() {
        System.out.println(this.text);
    } 
}
