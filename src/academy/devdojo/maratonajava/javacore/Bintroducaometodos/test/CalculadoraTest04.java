package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros03(num1, num2);

        System.out.println("\nDentro do calculadoraTest04: ");
        System.out.println("num1:" + num1);
        System.out.println("num1:" + num2);
    }
}
