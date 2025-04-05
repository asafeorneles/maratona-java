package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysExerciciosForeach02 {
    public static void main(String[] args) {
//  Contagem de Vogais em um Array de Caracteres
//
//  Crie um array de caracteres contendo letras aleatórias. Utilize um foreach para contar quantas vogais (a, e, i, o, u) existem no array e exiba o total.

        char []  caracteres = {'r','e','f','g','a','i','p','s','u'};
        int quantidadeVogais = 0;

        for (char c : caracteres){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                quantidadeVogais++;
            }
        }

        System.out.println("A quantidade de vogais = " + quantidadeVogais);
    }
}
// VERSAO MELHORADA
//public class Main {
//    public static void main(String[] args) {
//        char[] caracteres = {'r', 'E', 'f', 'g', 'A', 'i', 'P', 's', 'U'};
//        System.out.println("A quantidade de vogais = " + contarVogais(caracteres));
//    }
//
//    public static int contarVogais(char[] caracteres) {
//        int quantidadeVogais = 0;
//        for (char c : caracteres) {
//            if (ehVogal(c)) {
//                quantidadeVogais++;
//            }
//        }
//        return quantidadeVogais;
//    }
//
//    public static boolean ehVogal(char c) {
//        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
//    }
//}