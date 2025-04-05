package academy.devdojo.maratonajava.AaFixacao.Sequencias;

import java.util.Scanner;

public class Sequencia03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        double soma = 1;

        for (int i = 1; i < numero; i++) {
            soma += 1.0 / (i + 1);
        }
        System.out.println(soma);
    }
}
