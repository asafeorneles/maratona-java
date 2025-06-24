package academy.devdojo.maratonajava.javacore.Uregex.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaaba";
        String regex2 = "aba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Texto:  " + text2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Posições encontradas:");
        while (matcher.find()){
            System.out.print(matcher.start() + " "); // Procura se há o regex pelo texto.
        }

        /*
         Basicamente faz uma busca do regex (Neste caso, ab ou aba) pelo texto.
        */
    }
}
