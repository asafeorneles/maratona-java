package academy.devdojo.maratonajava.javacore.Uregex.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest03 {
    public static void main(String[] args) {
        // \d -> Busca por tudo o que for número (Números)
        // \D -> Busca por tudo o que não for número (Letras, caracteres especiais, espaços em branco)
        // \s -> Busca por todos os espaços em branco, \n, \t, \f (Espaços em branco)
        // \S -> Busca por todos o que não é espaço em branco (Letras, números e caracteres especiais)
        // \w -> a-z, A-Z, dígitos e _ (Letras, números e underline)
        // \W -> Tudo o que nao for /w (Caracteres especais, e espaços em branco)
        //[xX] -> Ou x ou X

//        String regex = "[a-zA-C]"; // Funciona como se fosse um ou. Quero que traga ou a, ou b, ou c... até z. Mesma coisa com o maiúsculo.
//        String text = "cafeBABE";

        // Com números Hexadecimais
        String regex = "0[xX][0-9a-fA-F]"; // Manipulamos o regex para retornar apenas numeros hx (Números hexadecimais em java obrigatoriamente começam com 0x ou 0X e depois o conteudo até f ou F)
        String text = "12 0x 0X 0xFFABC 0x109 0x1";


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
