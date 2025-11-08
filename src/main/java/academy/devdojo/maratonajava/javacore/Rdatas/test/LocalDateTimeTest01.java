package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2030-12-10"); //Também é possivel utilizar o parse para passar uma string.
        LocalTime time = LocalTime.parse("13:45:21");
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(agora);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
