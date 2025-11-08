package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "      Killua      ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace('l', 's'));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.substring(0, numeros.length()));
        // se eu colocar um valor como limite, ele vai até o valor. Por exemplo, de 0 até a posição 3. Ele imprime 012.
        System.out.println(numeros.length());
        System.out.println(nome.trim());


    }
}
