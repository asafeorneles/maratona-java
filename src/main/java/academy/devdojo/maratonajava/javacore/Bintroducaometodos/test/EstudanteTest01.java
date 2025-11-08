package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprime = new ImprimeEstudante();

        estudante01.nome = "Tsunade";
        estudante01.idade = 59;
        estudante01.sexo = 'F';
        imprime.imprimirEstudante(estudante01);

        /* Estamos passando um objeto como parâmetro. Quando passamos um objeto,
        estamos passando a referência da variável (endereço em memória). Isso
        só acontece com variaveis não primitivas (objetos, arrays...).
        Quando modificamos uma variavel referencia dentro de um metodo por exemplo, estamos
        alterando o valor diretamente no endereço de memória, na raiz, já tipos primitivos
        está sendo alterada uma cópia.*/


        estudante02.nome = "Sakura";
        estudante02.idade = 19;
        estudante02.sexo = 'F';
        imprime.imprimirEstudante(estudante02);

        System.out.println(estudante01.nome);
        System.out.println(estudante02.nome);
    }
}
