package academy.devdojo.maratonajava.javacore.ZZJcrud.service;


import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menuProducerService(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            case 2:
                findAll();
                break;
            case 3:
                delete();
                break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    public static void findByName() {
        System.out.println("Type the name to find producers or empty to find all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s%n", producers.get(i).getId(), producers.get(i).getName());
        }
    }

    public static void findAll(){
        List<Producer> producers = ProducerRepository.findAll();
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s%n", producers.get(i).getId(), producers.get(i).getName());
        }
    }

    public static void delete() {
        findAll();
        System.out.println("Type the id to delete one producer");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }
}
