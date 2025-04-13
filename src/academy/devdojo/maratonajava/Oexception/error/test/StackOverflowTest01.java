package academy.devdojo.maratonajava.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() { // Fica se chamando até a memória estourar
        recursividade();
    }

    /*O que aconteceu?
    A função recursividade() fica se chamando infinitamente, sem uma condição de parada.
    Cada chamada ocupa um espaço na stack (pilha de chamadas), e como essa pilha tem um limite, o Java lança a exceção:
       java.lang.StackOverflowError
    Ou seja, você "estourou a pilha de execução" por recursão infinita.*/
}
