package academy.devdojo.maratonajava.javacore.Vio.test;
// File
// FileWriter
// FileReader
// BufferWriter
// BufferReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){ // Usando o try com recurso, ele já fecha (close) o uso do recurso do SO automaticamente. Usando o append true, ele cria outra escrita em vez de substituir
            fw.write("O DevDojo é lindo, William é o melhor professor do Brasillll\nJavinha é vida\n");
            fw.flush(); // Existe a chance de fechar o arquivo e o SO não ter mandado to.do o conteudo pro arrquivo. Por isso o flush (Cospe to.do o conteudo pro buffer e quando o metodo acbar o java chama o close do try)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
