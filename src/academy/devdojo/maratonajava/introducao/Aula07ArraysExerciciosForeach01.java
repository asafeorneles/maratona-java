package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysExerciciosForeach01 {
    public static void main(String[] args) {
//  Soma dos Elementos de um Array
//
//  Crie um array de números inteiros e utilize um laço foreach para calcular a soma de todos os elementos. No final, exiba o resultado.

        int [] numeros = {2,5,9,14,7};
        int soma = 0;

        for(int i : numeros){
            soma += i;
        }
        System.out.println(soma);

//        int soma = Arrays.stream(numeros).sum();
//        System.out.println("A soma usando stream = " + soma);
    }
}
