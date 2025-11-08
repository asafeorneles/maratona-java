package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        //Operador ternario
        // idade < 15 categoria infantil
        // idade >= 15 && idade <18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        String categoria = idade < 15 ? "categoria infantil" : idade >= 15 && idade <18 ? "Categoria juvenil" : "categoria adulto";

        System.out.println(categoria);
    }
}
