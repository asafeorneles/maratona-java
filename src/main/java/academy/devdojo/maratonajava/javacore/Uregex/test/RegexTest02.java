package academy.devdojo.maratonajava.javacore.Uregex.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {
    public static void main(String[] args) {
        // \d -> Busca por tudo o que for número (Números)
        // \D -> Busca por tudo o que não for número (Letras, caracteres especiais, espaços em branco)
        // \s -> Busca por todos os espaços em branco, \n, \t, \f (Espaços em branco)
        // \S -> Busca por todos o que não é espaço em branco (Letras, números e caracteres especiais)
        // \w -> a-z, A-Z, dígitos e _ (Letras, números e underline)
        // \W -> Tudo o que nao for /w (Caracteres especais, e espaços em branco)
        String regex = "\\S";
        String text = "@sa_02 9da3\tn#d3-7";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Texto:  " + text);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group(/*Fala a posiçao da String texto*/) + "\n");
        }
    }
}
