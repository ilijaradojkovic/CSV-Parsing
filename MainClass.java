import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        List<Person> people = new CsvToBeanBuilder(new FileReader("persons.csv"))
                .withType(Person.class)

                .build()
                .parse();

        System.out.println(people);

    }
}
