package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime nascimento = LocalDateTime.of(2005, 12, 10, 13, 10);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.YEARS.between(nascimento, now) + " anos");
        System.out.println(ChronoUnit.MONTHS.between(nascimento, now) + " meses");
        System.out.println(ChronoUnit.WEEKS.between(nascimento, now) + " semanas");
        System.out.println(ChronoUnit.DAYS.between(nascimento, now) + " dias");
        System.out.println(ChronoUnit.HOURS.between(nascimento, now) + " horas");
        System.out.println(ChronoUnit.MINUTES.between(nascimento, now) + " minutos");

        /*
         Permite ter um retorno dos valores entre as datas.
         */
    }
}
