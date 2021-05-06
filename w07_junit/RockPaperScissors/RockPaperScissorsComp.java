import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissorsComp {
    ArrayList<String> list = new ArrayList<>();
    Random randInt = new Random();


    public ArrayList addToList(){

        list.add("Rock");
        list.add("Paper");
        list.add("Scissors");
        
        return list;
    }

    public String randomFromList(){

        A
        String value = list.get(randInt.nextInt(3));

        return value;
    }
}
