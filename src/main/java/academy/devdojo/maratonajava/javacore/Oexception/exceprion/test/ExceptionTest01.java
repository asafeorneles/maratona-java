package academy.devdojo.maratonajava.javacore.Oexception.exceprion.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarArquivo();
    }

    private static void criarArquivo(){
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch (IOException e){
            e.printStackTrace(); // Mostra detalhadamente um relatórrio do que aconteceu nas pilhas da stack.
        }

        /*

        O createNewFile() por padrão, identifica que pode se ter uma excessão do tipo checked (Precisa ser checada antes de compilar),
        fazendo que seja necessário obrigatoriamente fazer um tratamento.

        Por IOException ser uma excessão checked, é preciso que dentro do try, tenha algum motivo que leve o catch ser possivelmente executado,
        nesse caso, o file.createNewFile();
        */


    }
}
