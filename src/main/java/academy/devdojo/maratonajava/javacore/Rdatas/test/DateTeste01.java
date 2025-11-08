package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1746679829616L); //Passamos um long como parametro (Esse long representa uma determinada data)
        System.out.println(date); // Printamos a data atual
        date.setTime(date.getTime() + 3_600_000); // Adicionamos 1hora na data (1 hora é 3_600_000)
        System.out.println(date); // Printamos a data acrescida de 1 hora

    }
}
