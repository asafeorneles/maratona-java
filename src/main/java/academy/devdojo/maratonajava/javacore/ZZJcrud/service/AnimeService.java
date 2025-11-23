package academy.devdojo.maratonajava.javacore.ZZJcrud.service;


import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menuAnimeService(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> findAll();
            case 3 -> delete();
            case 4 -> save();
            case 5 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    public static void findByName() {
        System.out.println("Type the name to find animes or empty to find all");
        String name = SCANNER.nextLine();
        AnimeRepository.findAll().forEach(a -> System.out.printf("[%d] - %s - %d - %s%n", a.getId(), a.getName(), a.getEpisodes(), a.getProducer().getName()));
    }

    public static void findAll() {
        AnimeRepository.findAll().forEach(a -> System.out.printf("[%d] - %s - %d - %s%n", a.getId(), a.getName(), a.getEpisodes(), a.getProducer().getName()));
    }

    public static void delete() {
        findAll();
        System.out.println("Type the id to delete one anime");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    public static void save() {
        System.out.println("Type the name of the new anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the episodes of the new anime");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id_producer of the new anime");
        Producer producer = Producer.builder().id(Integer.parseInt(SCANNER.nextLine())).build();
        Anime anime = Anime.builder().name(name).episodes(episodes).producer(producer).build();
        AnimeRepository.save(anime);
    }

    private static void update() {
        findAll();
        System.out.println("Type the id of anime you want update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found, id not exist");
        }
        Anime animeByDb = animeOptional.get();
        System.out.println("Anime found:" + animeByDb);

        System.out.println("Type the name of the anime to update");
        String name = SCANNER.nextLine();
        System.out.println("Type the episodes of the new anime");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        Anime animeToUpdate = Anime.builder().id(animeByDb.getId()).name(name).episodes(episodes).build();
        AnimeRepository.update(animeToUpdate);
    }
}
