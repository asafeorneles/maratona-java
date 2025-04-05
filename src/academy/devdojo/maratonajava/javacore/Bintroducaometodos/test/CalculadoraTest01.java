package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.SomarDoisNumeros();
        System.out.println("Numeros somados");

        System.out.println("------------------");
        
        calculadora.subtrairDoisNumeros();
        System.out.println("Numeros subtraidos");

    }
}
