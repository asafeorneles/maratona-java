package academy.devdojo.maratonajava.AaFixacao.Sequencias;

import java.util.Scanner;

public class Senhas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senha = 1234;
        for (int i = 0; i < 3; i++){
            System.out.println("Digite sua senha: ");
            int tentativa = entrada.nextInt();

            if (tentativa == senha){
                System.out.println("Acesso permitido");
            }
            else {
                System.out.println("Acesso negado");
            }

            if (i == 2){
                System.out.println("Usuario bloqueado pelo excesso de tentativas.");
            }
        }

    }
}
