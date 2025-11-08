package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove{

    // Não é possivel uma subclasse ter um modificador de acesso menos restritivo do que sua superclasse.
    // Por padrão, os atributos das classes possuem o modificador default
    // private -> default -> protected -> public
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void check() {
        System.out.println("Fazendo checagem nos dados do banco de dados");
    }

    // Nao é nescessario uma sobrescritaa, pois os métodos statics pertemcem a classe e nao ao objeto
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
