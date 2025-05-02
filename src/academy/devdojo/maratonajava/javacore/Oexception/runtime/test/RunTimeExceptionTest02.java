package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    public static int divisao(int a, int b) throws ArithmeticException {
        if (b ==0){
            throw new IllegalArgumentException("Argumento ilegal, b não pode ser zero.");
        }

        return a / b;
    }
}
