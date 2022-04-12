import java.util.ArrayList;

/**
 *
 * @author Wanrada 6434482623
 */
public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;
    
    public ChoiceQuestion (String text) {
        super(text);
        choices = new ArrayList<>();
    }
    
    public void addChoice(String choice,boolean correct) {
        choices.add(choice);
        
        if (correct == true) {
            this.setAnswer(Integer.toString(choices.indexOf(choice)+1));
        }
    }
    
    @Override
    public void display() {
        System.out.println(this.getText());
        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i+1+": "+choices.get(i));
        }
    }
}
