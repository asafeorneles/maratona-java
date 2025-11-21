package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class ProducerServiceTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while (true){
            producerMenu();
             op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            ProducerService.menuProducerService(op);

        }
    }

    private static void producerMenu(){
        System.out.println("Type the number of your operation");

        System.out.println("1. Search Your Name");
        System.out.println("2. Search All");
        System.out.println("3. Delete");
        System.out.println("4. Save");
        System.out.println("0. Exit");
    }
}
