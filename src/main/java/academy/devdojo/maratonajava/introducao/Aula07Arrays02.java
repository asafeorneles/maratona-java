package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Padrões de inicialização
        // byte, short, int, long -> 0
        // float e String -> 0.0
        // char -> '\u0000'
        // boolean -> false
        // String -> null

        String [] nomes = new String [3];

        nomes [0] = "Naruto";
        nomes [1] = "Jiraya";
        nomes [2] = "Kakashi";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
