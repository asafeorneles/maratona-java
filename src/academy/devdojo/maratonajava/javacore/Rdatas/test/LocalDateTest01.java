package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate agora = LocalDate.now();
        agora = agora.plusDays(5); // LocaDate é uma classe imutável. Só é possível alterar valores associando a uma variável de referencia.
        LocalDate localDate = LocalDate.of(2030, Month.DECEMBER, 10);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getYear());
        System.out.println(localDate.lengthOfYear());
        System.out.println(localDate.isLeapYear()); // Se o ano é bissexto
        System.out.println(localDate);
        System.out.println(agora);
    }
}
