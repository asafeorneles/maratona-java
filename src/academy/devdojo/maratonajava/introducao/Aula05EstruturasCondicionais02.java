package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        // idade < 15 categoria infantil
        // idade >= 15 && idade <18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade;
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade <18) {
            System.out.println("Categoria juvenil");
        } else{
                System.out.println("Categoria adulta");
        }

    }
}
