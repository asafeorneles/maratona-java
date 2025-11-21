package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class ProducerServiceTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        while (true){
            producerMenu();
             op = Integer.parseInt(scanner.nextLine());
            if (op == 0) break;
            ProducerService.menuProducerService(op);

        }
    }

    private static void producerMenu(){
        System.out.println("Type thje number of your operation");

        System.out.println("1. Search Your Name");
        System.out.println("2. Search All");
        System.out.println("3. Delete");
        System.out.println("0. Exit");
    }
}
