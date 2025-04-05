package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 1000000

        int milhao = 100;

        for (int i = 0; i <= milhao; i++){
            if(i % 2 == 0){
                System.out.println("Numero par: " + i);
            }
        }
    }
}
