package academy.devdojo.maratonajava.javacore.Uregex.test;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest05 {
    public static void main(String[] args) {
        // \d -> Busca por tudo o que for número (Números)
        // \D -> Busca por tudo o que não for número (Letras, caracteres especiais, espaços em branco)
        // \s -> Busca por todos os espaços em branco, \n, \t, \f (Espaços em branco)
        // \S -> Busca por todos o que não é espaço em branco (Letras, números e caracteres especiais)
        // \w -> a-z, A-Z, dígitos e _ (Letras, números e underline)
        // \W -> Tudo o que nao for /w (Caracteres especais, e espaços em branco)
        //[xX] -> Ou x ou X

        // ? -> 0 ou 1 ocorrência
        // * -> 0 ou mais ocorrências
        // + -> 1 ou mais ocorrências
        // {n,m} -> n até m ocorrências. (n e m são variáveis)
        // () -> agrupamento
        // | -> Ou. Utilizando junto com a de cima: o(v|c)o = Ou ovo, ou oco.
        // $ -> final
        // ^ -> início
        //[^abc] -> Negaçao. Dentro de colchetes, o ^ nega o que estiver dentro do colchete.
        // \b -> Garante que vai pegar um texto que vem logo depois de "/s, $, ^, ," . Substitui escrever (\\s|^) ou (\\s|$) por exemplo
        // . -> coringa. Ex: 1.3 -> 123, 133, 1A3, 1@3, 113

        // Com números Hexadecimais
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Texto valido: " + "#@!zoro@mail.br".matches(regex) + "\n"); // Verifica se determinada string é valida de acordo com o outra string. Nesse caso, o text e o regex.

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
