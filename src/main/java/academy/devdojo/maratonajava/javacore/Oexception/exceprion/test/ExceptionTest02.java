package academy.devdojo.maratonajava.javacore.Oexception.exceprion.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarArquivo();
    }

    private static void criarArquivo() throws IOException{
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
            throw e; // Relança o erro, é como se ele desse uma segunda chance. (Obrigatoriamente devemos colocar um throws IOException no metodo.)
//          throw new RuntimeException("Problema ao criar o arquivo") // Cria uma nova excessão. (Não é obrigatório colocar um throws IOException no metodo.)
        }

        /*

        Se o metodo criarArquivo for publico, faz sentido deixar um throws IOException e deixar a funçao só criando o arquivo,
         pois qualquer classe que chamar esse metodo, vai tratá-lo da melhor forma dentro da necessidade da classe.
         Se for private, se pode manter sem o throws IOException e tratar dentro do próprio metodo.

        Quando relançamos uma excessão, obrigatoriamente devemos colocar um throws IOException no metodo.
        */
    }
}
