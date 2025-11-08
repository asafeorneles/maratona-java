package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void SomarDoisNumeros() {

        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) { // função com parâmetro
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0; // O return ignora as linhas de baixo e ja vai pro main. Como se fosse um break
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimaDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void imprimaDivisaoDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return; // Funciona basicamente como um break.
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros03(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numeros: ");
        System.out.println("num1:" + num1);
        System.out.println("num1:" + num2);

    }

    public void somaArray(int [] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVaargs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
