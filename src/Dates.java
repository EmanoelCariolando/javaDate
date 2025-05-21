import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dates {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.parse("2025-01-01T00:00");
        Instant d04 = Instant.parse("2019-01-01T00:00:00.00Z");


        LocalDate i01 = LocalDate.ofInstant(d04, ZoneId.systemDefault());
        LocalDate i02 = LocalDate.ofInstant(d04, ZoneId.of("Portugal"));
        LocalDateTime i03 = LocalDateTime.ofInstant(d04, ZoneId.systemDefault());
        LocalDateTime i04 = LocalDateTime.ofInstant(d04, ZoneId.of("Portugal"));
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);
        System.out.println(i04);

        System.out.println("day: " + d02.getDayOfMonth());
        System.out.println("month: " + d02.getMonth());
        System.out.println("year: " + d02.getYear());



    }

}

