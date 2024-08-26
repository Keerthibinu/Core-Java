
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Conversion {
    public static void main(String[] args)throws Exception {
        String string = "28 October, 2018";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
        LocalDate date = LocalDate.parse(string, format);
        System.out.println(date);
    }
}