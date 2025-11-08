package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(10, 0);
        System.out.println(result);

        double result2 = calculadora.divideDoisNumeros02(10, 0);
        System.out.println(result2);

        System.out.println("------------------------");
        calculadora.imprimaDivisaoDoisNumeros02(10, 0);
    }
}
