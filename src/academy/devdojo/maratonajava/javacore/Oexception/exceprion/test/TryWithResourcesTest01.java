package academy.devdojo.maratonajava.javacore.Oexception.exceprion.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo2(){
        try (Reader reader = new BufferedReader(new FileReader("arquivo.txt"))) {

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo() {
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("arquivo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
