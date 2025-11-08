package academy.devdojo.maratonajava.javacore.Uregex.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest04 {
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

        // Com números Hexadecimais
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // Se nao ouvesse o agrupamento (\s|$), o codigo ia ler: ou: uma string que começa com 0x ou 0X, seguida por um ou mais caracteres hexadecimais e depois um espaço obrigatório (\s),ou: nada, ou o fim da string ($)
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";


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
