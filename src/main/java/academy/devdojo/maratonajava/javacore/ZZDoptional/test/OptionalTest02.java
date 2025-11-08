package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.Service.MangaService;
import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaService.findByTitle("One Punchmans"); // MangaService.findByTitle("One Punchman"); -> retorna Optional<Manga>, logo, um Manga manga não pode recebe-lo
        mangaByTitle.ifPresent(m-> m.setTitle(m.getTitle() + "2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaService.findById(2) // findById(2) → retorna um Optional<Manga>
                .orElseThrow(IllegalArgumentException::new); // .orElseThrow(...) → retorna o conteúdo do Optional (um Manga), ou lança uma exceção caso ele esteja vazio. Por isso, ou é um Manga que recebe
        System.out.println(mangaById);

        Manga newManga = MangaService.findByTitle("Naruto").orElse(new Manga(4, "Naruto", 400));
        System.out.println(newManga);

        Optional<String> titleById = MangaService.findTitleById(3);
        String title = titleById.orElse("Id nao cadastrado");
        System.out.println(title);

//    Tem outros métodos úteis pra lidar com Optional, por exemplo:
//
//    // Retorna o Manga, ou lança uma exceção se não existir
//    Manga m1 = MangaService.findById(1).orElseThrow(() -> new RuntimeException("Manga não encontrado"));
//
//    // Retorna o Manga, ou null se não existir
//    Manga m2 = MangaService.findById(1).orElse(null);
//
//   // Executa algo se o Manga existir
//   MangaService.findById(1).ifPresent(m -> System.out.println(m.getTitle()));
    }
}
