package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){
//            char[] in = new char[4];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1){ // fr.read() retorna um valor em hexadecimal que representa o caractere. Quando a leitura acaba ele retorna -1.
                System.out.print((char)i); // Enquanto i nao receber -1 (leitura acabar), printe to.do o conteudo lido.
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
