import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dates {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate dp01 = LocalDate.parse("2025-10-15");
        LocalDateTime dp02 = LocalDateTime.parse("2025-10-15T10:15:30");
        Instant dp03 = Instant.parse("2025-10-15T01:15:30Z");

        LocalDate dpf01 = LocalDate.parse("15/10/2005", fmt1);
        LocalDateTime dpf02 = LocalDateTime.parse("15/10/2005 10:15", fmt2);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        System.out.println();

        System.out.println("dp1 = " + dp01);
        System.out.println("dp2 = " + dp02);

        System.out.println();

        System.out.println("dpf1 = " + dpf01.toString());
        System.out.println("dpf2 = " + dpf02.toString());



    }

}

