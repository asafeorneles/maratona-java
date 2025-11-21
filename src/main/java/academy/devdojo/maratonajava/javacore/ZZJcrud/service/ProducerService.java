package academy.devdojo.maratonajava.javacore.ZZJcrud.service;


import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menuProducerService(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> findAll();
            case 3 -> delete();
            case 4 -> save();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }


    public static void findByName() {
        System.out.println("Type the name to find producers or empty to find all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name).forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    public static void findAll() {
        ProducerRepository.findAll().forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    public static void delete() {
        findAll();
        System.out.println("Type the id to delete one producer");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    public static void save() {
        System.out.println("Type the name of the new producer");
        Producer producer = Producer.builder().name(SCANNER.nextLine()).build();
        ProducerRepository.save(producer);
    }
}
