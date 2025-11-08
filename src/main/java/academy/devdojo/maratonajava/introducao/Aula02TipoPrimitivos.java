package academy.devdojo.maratonajava.introducao;

public class Aula02TipoPrimitivos {
    public static void main (String[] args){
        //int, double, float, char, byte, short, long, boolean
        //String

        int age = (int) 100000000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000D;
        float salarioFloat = 2500F;
        byte salarioByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Naruto";

        System.out.println("A idade é " + age);
        System.out.println("Oi, meu nome é " + nome);
    }
}
