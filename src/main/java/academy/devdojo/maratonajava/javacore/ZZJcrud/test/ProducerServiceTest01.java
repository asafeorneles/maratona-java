package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.AnimeService;
import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class ProducerServiceTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            switch (op) {
                case 1 -> {
                    producerMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    ProducerService.menuProducerService(op);
                }
                case 2 -> {
                    animeMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    AnimeService.menuAnimeService(op);
                }
            }

        }
    }

    private static void menu() {
        System.out.println("Type the number of your operation");

        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println("0. Exit");
    }

    private static void producerMenu() {
        System.out.println("Type the number of your operation");

        System.out.println("1. Search Your Name");
        System.out.println("2. Search All");
        System.out.println("3. Delete");
        System.out.println("4. Save");
        System.out.println("5. Update");
        System.out.println("0. Exit");
    }

    private static void animeMenu() {
        System.out.println("Type the number of your operation");

        System.out.println("1. Search Your Name");
        System.out.println("2. Search All");
        System.out.println("3. Delete");
        System.out.println("4. Save");
        System.out.println("5. Update");
        System.out.println("0. Exit");
    }
}
