import java.util.Scanner;

public interface Interface {
    
    void printHangedMan();
    boolean getPlayerGuess(Scanner keyboard);
    boolean printWordState();
    String getAnswer();
    boolean isAnswer(String guess);
}


