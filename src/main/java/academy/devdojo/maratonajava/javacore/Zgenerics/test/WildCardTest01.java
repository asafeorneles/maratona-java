package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta(){
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro [] cachorros = {new Cachorro(), new Cachorro()};
        Gato [] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);

        System.out.println("---------------");
        Animal [] animais = {new Cachorro(), new Gato()};
        printConsulta(animais);
    }

    public static void printConsulta(Animal [] animais){
        for (Animal animal : animais) {
            animal.consulta();
        }

        animais [0] = new Gato(); // O código compila mas nao roda pois o Java sabe que o Array de cachorro é apenas de cachorros.
    }
}
