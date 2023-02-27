import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import com.opencsv.bean.CsvDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor()
@NoArgsConstructor()
@Data
public class Person {
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "age")
    private Integer age;
    @CsvBindByName(column = "email")
    private String email;
    @CsvDate(value = "yyyy.MM.dd")
    @CsvBindByName(column = "birth")
    private Date birth;

}
