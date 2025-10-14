package academy.devdojo.maratonajava.javacore.ZZDoptional.Service;

import academy.devdojo.maratonajava.javacore.ZZDoptional.Repositorys.MangaRepository;
import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.Optional;
import java.util.function.Predicate;

public class MangaService {

    public static Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return findBy(m-> m.getId().equals(id));
    }

    public static Optional<String> findTitleById(Integer id){
        return findBy(m-> m.getId().equals(id)).map(Manga::getTitle);
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga mangaFind = null;
        for (Manga manga : MangaRepository.mangas){
            if (predicate.test(manga)){
                mangaFind = manga;
            }
        }
        return Optional.ofNullable(mangaFind);
    }
}
