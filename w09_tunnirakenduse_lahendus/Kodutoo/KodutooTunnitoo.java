
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.IntStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class KodutooTunnitoo {
  public static void main(String[] args) throws IOException {

    /////////////EXEPTION TRY CATCH//////////
    Logger logger = Logger.getLogger(KodutooTunnitoo.class.getName());
    FileHandler fh;
    SimpleFormatter sf = new SimpleFormatter();

    int [] nums1 = {5, 60, 30, 10, 15};
    int [] nums2 = {6, 9, 0, 10, 4};
    

    try {
      fh = new FileHandler("TryCatch.txt");
      fh.setFormatter(sf);
      logger.addHandler(fh);
    } catch (Exception e){
      System.out.println("Something went wron");
    }

    for(int i = 0; i < nums1.length; i++){

        try{
            logger.info(String.valueOf(nums1[i]/nums2[i]));
        } catch(ArithmeticException aex){
            logger.warning("Error in division:" + aex.getMessage());
        }

    }

    try{
        logger.info(String.valueOf(returnChar("hello")));
    }catch(StringIndexOutOfBoundsException Stringe){
        logger.warning(Stringe.getMessage());
    }



    ///FOR EACH LOOP///////////
    String[] words = {"Hello", "It", "Is", "Me"};
    int[] numbers = {1, 2, 3, 4, 5};
    char[] chars = {'a', 'v', 't', 'q', 'x'};

    System.out.println("Strings");
    for(String word : words){
      System.out.println(word);
    }

    System.out.println("Integers");
    for(int num : numbers){
      System.out.println(num);
    }

    System.out.println("Char");
    for(char chartcer: chars){
      System.out.println(chartcer);
    }

    ////STREAM/////////
    
    PrintWriter pw1 = new PrintWriter(new FileWriter("data_new.txt"));
    PrintWriter pw2 = new PrintWriter(new FileWriter("data_minInt.txt"));
    

    Files.readAllLines(Paths.get("data.txt"))
      .stream()
      .map(e -> e.split(","))
      .filter(e -> Integer.parseInt(e[1]) >= 18)
      //.filter(e -> e[2] == "Female")
      .map(e -> "Name: " + e[0] + " Age: " + e[1] + " Gender: " + e[2])
      .forEach(pw1::println);
    
    pw1.close();

    List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

    int maxnum = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
    int minnum = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
    
    System.out.println("Max: " + maxnum);
    System.out.println("Min: "+ minnum);
    

    ////////Integerstream.of and Integerstrea,.range

    IntStream.range(1, 10)
      .filter(e -> e % 2 == 0)
      .forEach(System.out::print);


    System.out.println(" ");
    System.out.println("-----------------");


    IntStream.of(1, 2, 4, 8)
      .map(e -> e * e)
      .filter(e -> e < 50)
      .forEach(e -> System.out.print(e + " " ));

    
    System.out.println(" ");
    System.out.println("---------------");
  
    System.out.println(IntStream.of(2, 4, 6, 8, 10).allMatch(e -> e % 2 == 0));
    System.out.println(IntStream.of(2, 4, 6, 8, 9, 10).anyMatch(e -> e % 2 != 0)); 


    System.out.println(" ");
    System.out.println("---------------");
  
    System.out.println(IntStream.range(1, 10).allMatch(e -> e % 2 == 0));
    System.out.println(IntStream.range(1, 10).anyMatch(e -> e % 2 == 0));

    System.out.println(IntStream.range(1, 10).filter(e -> e % 2 == 0).allMatch(e -> e % 2 == 0));
    System.out.println(IntStream.range(1, 10).filter(e -> e % 2 == 0).anyMatch(e -> e % 2 == 0));




    }
    public static char returnChar(String s){
        char c = s.charAt(10);
        return c;
      } 

}
