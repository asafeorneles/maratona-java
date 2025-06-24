package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAjusterTest01 {
    public static void main(String[] args) {
        calculaDiaUtil(DayOfWeek.FRIDAY);
    }
    public static void calculaDiaUtil (DayOfWeek d){
        LocalDate now = LocalDate.now().with(TemporalAdjusters.next(d));

        if (now.getDayOfWeek() == DayOfWeek.THURSDAY){
            now = now.plusDays(4);
            System.out.println(now);
            System.out.println(now.getDayOfWeek());
        } else if (now.getDayOfWeek() == DayOfWeek.FRIDAY) {
            now = now.plusDays(3);
            System.out.println(now);
            System.out.println(now.getDayOfWeek());

        } else if (now.getDayOfWeek() == DayOfWeek.SATURDAY) {
            now = now.plusDays(2);
            System.out.println(now);
            System.out.println(now.getDayOfWeek());

        } else if (now.getDayOfWeek() == DayOfWeek.SUNDAY) {
            now = now.plusDays(1);
            System.out.println(now);
            System.out.println(now.getDayOfWeek());
        }
        else {
            now = now.plusDays(1);
            System.out.println(now);
            System.out.println(now.getDayOfWeek());
        }
    }
}
