package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("O primeiro dia da semana é domingo.");
        }
        else {
            System.out.println("O primeiro dia da semana não é domingo");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // printa o dia da semana
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // printa o dia do mes
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // printa o dia do ano
        System.out.println(c.get(Calendar.YEAR)); // printa o ano
        Date d  = c.getTime();
        System.out.println(d);

        c.add(Calendar.HOUR, 0); // Adiciona mais horas, ou outra unidade de tempo na data. (Ele pula po dia, mes, ano seguinte quando passa o limite)
        c.roll(Calendar.HOUR, 15); // Adiciona mais horas, ou outra unidade de tempo na data mantendo o mesmo dia porém alterando a unidade.
        d = c.getTime();
        System.out.println(d);
    }
}
