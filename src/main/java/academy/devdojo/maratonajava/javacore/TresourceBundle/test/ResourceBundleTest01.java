package academy.devdojo.maratonajava.javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages_pt_BR", new Locale("pt", "BR"));
        // Criamos um resourceBundle com suporte para o locale desejado, isso permite pegar as chaves e traduzir os valores do nosso arquivo criado com base no locale
        System.out.println(resourceBundle.getString("ola"));
        System.out.println(resourceBundle.getString("bom.dia"));


        resourceBundle = ResourceBundle.getBundle("messages_en_US", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("ola"));
        System.out.println(resourceBundle.getString("bom.dia"));

        // Locale("fa", "CA"); - Se quisermos usar o locale do francer de Canada por exemplo
        // messages_fa_CA.properties - Ele vai procurar um arquivo com base nesse locale
        // messages_fa.properties - Se nao achar, vai procurar no que tem a linguagem apenas
        // messages_pt_BR.properties - Se nao achar, ele vai procurar com base no padrao do SO
        // messages_pt.properties - Se nao achar, vai procurar no que tem a linguagem apenas
        // messages.properties - Caso nao ache, vai procurar meio que no arquivo base universal.

        resourceBundle = ResourceBundle.getBundle("messages");
        System.out.println(resourceBundle.getString("hi"));

    }
}
