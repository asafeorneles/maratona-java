package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        String s1 = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s3 = LocalDate.now().format(DateTimeFormatter.ISO_DATE);

        System.out.println(s1); // Por enquanto é uma string
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        LocalDate parse1 = LocalDate.parse("20250519", DateTimeFormatter.BASIC_ISO_DATE); // Utilizando o parse, vamos pegar a string e transformá-la em Data.
        LocalDate parse2 = LocalDate.parse("2025-05-19", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse3 = LocalDate.parse("2025-05-19+04:00", DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        // MM/dd/yyyy US
        // dd/MM/yyyy BR
        // yyyy/MM/dd JP

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Criamos nossa própia formatação.
        String s4 = LocalDate.now().format(formatterBR); // Criamos uma string que recebe uma data, nesse caso a now, e formatamos para a formatterBR.
        System.out.println(s4);

        LocalDate parse4 = LocalDate.parse(s4, formatterBR); // Tranformamos a string criada em uma data, assim podemos trabalhar com ela.
        System.out.println(parse4);

        //EXEMPLO COM NOSSA DATA CRIADA

        String aniversarioString = "10/12/2005";
        LocalDate aniversarioDate = LocalDate.parse(aniversarioString, formatterBR);
        System.out.println(aniversarioDate.format(formatterBR));


        //USANDO LOCALE
        Locale localeDE = new Locale("de", "DE");
        DateTimeFormatter formatterLocale = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", localeDE);
        String s5 = LocalDate.now().format(formatterLocale);
        LocalDate parse5 = LocalDate.parse(s5, formatterLocale);
        System.out.println(parse5.format(formatterLocale));

    }

}
