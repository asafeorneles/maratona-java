package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    //Utilizando switch e dados os valores 1 a 7, imprima se é dia util ou final de semana
    //Considerando 1 como domingo

        int dia;
        System.out.println("Digite um dia da semana: ");
        dia = entrada.nextInt();

        switch (dia){
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia inválido, digite apenas um numero de 1 a 7");
                break;
        }
    }
}
