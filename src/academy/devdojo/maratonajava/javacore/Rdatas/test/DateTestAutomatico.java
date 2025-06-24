package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTestAutomatico {
    public static void main(String[] args) {
        Date date = new Date(); // Cria um date do tipo Date.
        long dateAuto = date.getTime(); // Armazena o long que representa a data atual.
        date.setTime(dateAuto); // Insere o long na varivel date.
        System.out.println(date); // Printa o a data através do long.
    }
}
