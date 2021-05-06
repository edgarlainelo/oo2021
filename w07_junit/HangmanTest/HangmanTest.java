import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdk.jfr.Timestamp;

import java.util.Random;

public class HangmanTest implements InterfaceTest {
  int wrongCount = 0;
  List<Character> playerGuess = new ArrayList<>();
  Random rand = new Random();
  public String word;

  //Kaks mängijat
  public HangmanTest(String word) {
    this.word = word;
  }

  //Üks mängija
  public HangmanTest(List<String> words) {
    this.word = words.get(rand.nextInt(words.size()));
  }

  public void printHangedMan() { //joonte loomine
    System.out.println(" -------");
    System.out.println(" |     |");
    if (wrongCount >= 1) { //wrongCount >= 1 ehk esimese vea avastamisel juba hakkab joonte loomine
      System.out.println(" O");
    }

    if (wrongCount >= 2) { //teine viga
      System.out.print("\\ ");
      if (wrongCount >= 3) {
        System.out.println("/");
      } else {
        System.out.println("");
      }
    }

    if (wrongCount >= 4) {
      System.out.println(" |");
    }

    if (wrongCount >= 5) {
      System.out.print("/ ");
      if (wrongCount >= 6) {
        System.out.println("\\");
      } else {
        System.out.println("");
      }
    }
    System.out.println("");
    System.out.println("");
  }

  public boolean getPlayerGuess(Scanner keyboard) {
    System.out.println("Palun sisestage täht:");
    String letterGuess = keyboard.nextLine();
    playerGuess.add(letterGuess.charAt(0));

    return word.contains(letterGuess);
  }

  public boolean printWordState() { //prindib välja mis tähed, mis olid ära arvatud
    int correctCount = 0;
    for (int i = 0; i < word.length(); i++) {
      if (playerGuess.contains(word.charAt(i))) {
        System.out.print(word.charAt(i));
        correctCount++;
      } else {
        System.out.print("-");
      }
    }
    System.out.println();

    return (word.length() == correctCount);
  }

  public String getAnswer() throws IllegalStateException {
    if (wrongCount >= 6) {
      return word;
    } else {
      throw new IllegalStateException("Vastust tohib küsida ainult kaotamise puhul!");
    }
  }

  public boolean isAnswer(String guess) {
    return guess.equalsIgnoreCase(word);
  }

  
}
