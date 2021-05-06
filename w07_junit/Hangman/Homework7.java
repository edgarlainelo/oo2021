import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework7 {
  public static void main(String[] args) throws FileNotFoundException { 

    System.out.println("Palun sisestage nimi/nimed: "); //küsime mängija nime
		Scanner input = new Scanner(System.in); // input skanneri kasutamine nimi sisestamiseks
		String playerName = input.nextLine(); //lisasime nextLine et saaks kaht mängijat lisada
		System.out.println("Tere, " + playerName + "!"); //mängija tervitus


    Hangman hangman; //hangman klass
    Scanner keyboard = new Scanner(System.in); //keyboard skanneri kasutamine tähtede sisestamiseks

    System.out.println("Üks või kaks mängijat?"); //küsime mitu mängijat
    String players = keyboard.nextLine();

    String word;

    if (players.equals("1")) { //alustame loopi 
      Scanner scanner = new Scanner(new File("words.txt"));

      List<String> words = new ArrayList<>(); //list

      while (scanner.hasNext()) {
        words.add(scanner.nextLine());
      }
      scanner.close();

      hangman = new Hangman(words);
    } else {
      System.out.println("'Mängija 1' Sisestage sõna:");
      word = keyboard.nextLine();
      hangman = new Hangman(word);
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("'Mängija 2' olete valmis?" );
    
    }

    while (true) {
      hangman.printHangedMan();

      if (hangman.wrongCount >= 6) {
        System.out.println("Kaotasite :(");
        System.out.println("Sõna oli: " + hangman.getAnswer());

        System.out.println(" +\"\"\"\"\"+ "); //kurb nägu sest mängija kaotas
        System.out.println("(| 0 0 |)");
        System.out.println(" |  ^  | ");
        System.out.println(" | --- | ");
        System.out.println(" ------- ");
        break;
      }

      hangman.printWordState();
      if (!hangman.getPlayerGuess(keyboard)) {
        hangman.wrongCount++;
      }

      

      System.out.println("Sisestage, mis sõna see võiks olla: "); //küsime kas mängija arvab ära sõna
      if (hangman.isAnswer(keyboard.nextLine())) {
        System.out.println("Võitsite! :)");
        break;
      } else {
        System.out.println("Kahjuks mitte, proovige veel kord:)");
      }



      
    }

  }
}