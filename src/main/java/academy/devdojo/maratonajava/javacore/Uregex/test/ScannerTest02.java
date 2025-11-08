package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,3,true,200";
        Scanner scanner = new Scanner(texto);

        scanner.useDelimiter(","); // Separa os valores com base no limitador escolhido. Neste caso: ,

        while (scanner.hasNext()) { // Enquanto tiver um proximo valor...
            if (scanner.hasNextInt()) { // Se o proximo valor for um int...
                int i = scanner.nextInt(); // i recebe o proximo valor int
                System.out.println("Inteiro: " + i); // printa i
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }

}
