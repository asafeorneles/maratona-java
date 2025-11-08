package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(10);

        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofYears(20);
        Period p3 = Period.ofMonths(70);
        Period p4 = Period.ofDays(32);
        Period p5 = Period.ofWeeks(58);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5.getDays()); //Ele retorna as semanas em dias. Ao tentar saber quantos meses tem 58 semanas, ele retorna 0. O getMonth nao funfa.
        System.out.println(Period.between(now, now.plusDays(p5.getDays())).getMonths()); // Mesmo fazendo gambiarra não dá certo.
        System.out.println(now.until(now.plusDays(p5.getDays()), ChronoUnit.MONTHS)); // Assim funciona
    }
}
