package academy.devdojo.maratonajava.AaFixacao.Sequencias;

import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro e maior que 1: ");
        int n = entrada.nextInt();

        System.out.println("Agora, digite quantas vezes este numero vai se repitir: ");
        int m = entrada.nextInt();

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= n; j++) {
                    System.out.print(j + " ");
                }
            }
            else {
                for (int j = n; j >= 0; j--){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}