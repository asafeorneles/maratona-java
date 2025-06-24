package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String nomes = "Levi, Eren, Mikasa";
        String [] arrayNomes = nomes.split(","); // Criamos um array de string que recebe os valores de nomes, ele identifica cada valor separando-os por vírgula.

        for (String nome : arrayNomes){
            System.out.println(nome.trim());
        }
    }

}
