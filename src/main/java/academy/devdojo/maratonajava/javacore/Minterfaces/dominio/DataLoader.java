package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();

    public default void check(){ // Basicamente, passa a ser abstrato e nao quebra o codigo das implementaçoes.
        System.out.println("Fazendo checagem de permições");
    }

    // É possivel ter um corpo pois é um metodo static
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
