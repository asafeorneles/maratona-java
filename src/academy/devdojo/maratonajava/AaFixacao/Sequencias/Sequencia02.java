package academy.devdojo.maratonajava.AaFixacao.Sequencias;

import java.util.Scanner;

public class Sequencia02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();

        int valor = 1;
        int anterior = 0;

        for (int i = 0; i < numero; i++) {
            System.out.print(valor + " ");

            int proximo = valor + anterior;
            anterior = valor;
            valor = proximo;
        }
    }
}
