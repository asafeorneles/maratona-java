package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp(){
        manga1 = new Manga("Kimetsu no Yaiba", 24);
        manga2 = new Manga("Kimetsu no Yaiba", 24);
    }

    @Test
    public void accessors_ReturnData_WhenMangaIsSerialized(){
        Assertions.assertEquals("Kimetsu no Yaiba", manga1.name());
        Assertions.assertEquals(24, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1, manga2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenHashCodesAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void nonNull_ThrowException_WhenMangaNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Manga(null, 24));
    }

    @Test
    public void isRecord_ReturnTrue_WhenMangaIsRecord(){
        Assertions.assertTrue(Manga.class.isRecord());
    }
}