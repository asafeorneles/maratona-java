package academy.devdojo.maratonajava.javacore.ZZDoptional.dominio;

import java.util.Objects;

public class Manga {
    private Integer id;
    private String title;
    private int chapter;

    public Manga() {

    }

    public Manga(Integer id, String title, int chapter) {
        this.id = id;
        this.title = title;
        this.chapter = chapter;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapter=" + chapter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getChapter() {
        return chapter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }
}
