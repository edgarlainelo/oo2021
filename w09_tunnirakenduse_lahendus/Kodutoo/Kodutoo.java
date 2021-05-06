import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Kodutoo {
    public static void main(String[] args) throws IOException {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Artjom Sidorov", 180, 70, "skate", "male", 18));
        personList.add(new Person("Lauri Artomonov", 179, 75, "music", "male", 22));
        personList.add(new Person("Nastja Ponomarova", 160, 50, "traveling", "female", 15));
        personList.add(new Person("Veronika Kasporavichus", 167, 55, "reading", "female", 19));

        

        List<Person> afterStreamList = personList.stream()
            .filter(e -> e.age >= 18)
            .sorted(Comparator.comparing(e -> e.name))
            .collect(Collectors.toList());

        afterStreamList.forEach(p -> System.out.println(p.name + " " + p.heigth + " " + p.weigth +" " + p.hobby +" " + p.gender +" " + p.age));

        PrintWriter pw = new PrintWriter(new FileWriter("data_kt_new.txt"));

        Files.readAllLines(Paths.get("data_kt.txt"))
        .stream()
        .map(e -> e.split(","))
        .filter(e -> Integer.parseInt(e[1]) % 2 == 0)
        //.filter(e -> e[2] == "female")
        .map(e -> "Name: " + e[0] + " num: " + e[1] + " gender: " + e[2])
        .forEach(pw::println);

        pw.close();

        

    }
}
