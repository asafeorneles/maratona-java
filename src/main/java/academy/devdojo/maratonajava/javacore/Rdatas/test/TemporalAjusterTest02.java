package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAjusterTest02 {
    public static void main(String[] args) {
        calculaDiaUtil(DayOfWeek.WEDNESDAY);
    }

    public static void calculaDiaUtil(DayOfWeek d) {
        LocalDate now = LocalDate.now().with(TemporalAdjusters.next(d));
        DayOfWeek opcao = d;

        switch (d) {
            case THURSDAY:
                now = now.plusDays(4);
                System.out.println(now);
                System.out.println(now.getDayOfWeek());
                break;
            case FRIDAY:
                now = now.plusDays(3);
                System.out.println(now);
                System.out.println(now.getDayOfWeek());
                break;
            case SATURDAY:
                now = now.plusDays(2);
                System.out.println(now);
                System.out.println(now.getDayOfWeek());
                break;
            case SUNDAY:
                now = now.plusDays(1);
                System.out.println(now);
                System.out.println(now.getDayOfWeek());
                break;
            default:
                now = now.plusDays(1);
                System.out.println(now);
                System.out.println(now.getDayOfWeek());
                break;
        }
    }
}
