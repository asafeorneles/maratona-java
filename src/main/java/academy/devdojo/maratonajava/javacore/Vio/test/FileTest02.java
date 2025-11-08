package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir(); // Cria um diretorio usando filename.mkdir
        System.out.println(isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt"); // Informamos que o caminho para o arquivo é no fileDiretorio.
        boolean isArquivoCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isArquivoCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isFileRenamed = fileArquivoDiretorio.renameTo(fileRenamed); // Renomeamos o arquivo anterior para o novo criado.
        System.out.println(isFileRenamed);

        File diretorioRenamed = new File("pasta02");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
