package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Asafe";
        String nome2 = "Asafe";
        nome.concat(" Orneles"); // É criado uma nova String na Pool String. A variável nome ainda continua recebendo "Asafe".
        System.out.println(nome);
        System.out.println(nome == nome2);

        System.out.println("---------------------------");

        nome = nome.concat(" Orneles"); // Agora, nome recebe a concatenação, Asafe Orneles.
        System.out.println(nome);
        System.out.println(nome == nome2);

        System.out.println("--------------");

        String nome3 = new String("Asafe"); // É criado um novo espaço em memória fora da pool.
        System.out.println(nome2 == nome3); // Vai dar false, pois nome3 aponta para um endereço de memória no heap, fora da pool.
        System.out.println(nome3.equals(nome2)); // Vai dar true, pois o valor é o mesmo.
    }
}
