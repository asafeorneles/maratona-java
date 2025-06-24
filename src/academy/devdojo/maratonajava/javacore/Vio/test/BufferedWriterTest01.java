package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("O DevDojo é lindo, William é o melhor professor do Brasillll");
            bw.newLine(); // Quebra a linha de acordo com a quebra de linha do SO. O \n pode nao ser aceito pelo SO.
            bw.write("Javinha é vida");
            bw.newLine();
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
