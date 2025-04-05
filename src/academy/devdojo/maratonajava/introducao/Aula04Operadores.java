package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - ? *
        int numero01 = 10;
        double numero02 = 20;
        double divisao = numero01 / numero02;

        System.out.println(divisao);

        // % -> resto
        int resto = 21 % 2;
        System.out.println("O resto e " + resto);

        //< > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);
        System.out.println(isDezDiferenteVinte);

        // && (AND) || (OR) ! (NOT)

        // = += *= /= %=
    }
}
