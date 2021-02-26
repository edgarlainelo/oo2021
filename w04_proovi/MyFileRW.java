import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileRW {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("dummy2.txt"));
    PrintWriter pw = new PrintWriter("out_dummy2.txt");

    String line = br.readLine();
    int sum = 0;
    while (line != null){
      sum += Integer.parseInt(line);
      line = br.readLine();
    }

    pw.println("Sum is " + sum);

    br.close();
    pw.close();
  }
}
