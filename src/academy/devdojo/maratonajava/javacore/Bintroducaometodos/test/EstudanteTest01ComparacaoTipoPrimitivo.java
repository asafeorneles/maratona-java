package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01ComparacaoTipoPrimitivo {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Tsunade";
        estudante01.idade = 59;
        estudante01.sexo = 'F';

        estudante01.imprimeEstudanteTeste(estudante01.nome, estudante01.idade, estudante01.sexo);

        estudante02.nome = "Sakura";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        estudante02.imprimeEstudanteTeste(estudante02.nome, estudante02.idade, estudante02.sexo);
        System.out.println(estudante01.nome); // (Continua tsunade pois o que foi modificado era apenas uma copia e nao a referencia (local) da variavel).
        //
    }
}
