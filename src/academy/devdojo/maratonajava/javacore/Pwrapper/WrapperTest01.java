package academy.devdojo.maratonajava.javacore.Pwrapper;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'A';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing -> O java transformamos um tipo primitivo em Wrapper
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'A';
        Boolean booleanW = true;
        // Tipos Wrappers são objetos, portanto agem como objetos.

        int i = intW; // unboxing -> Quando transformamos um tipo wrapper em tipo primitivo

        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE"); //Ele ignora os caracteres maiúsculos e minúsculos.
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
