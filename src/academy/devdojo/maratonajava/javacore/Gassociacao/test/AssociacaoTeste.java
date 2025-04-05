package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local1 = new Local("Konoha");
        Local local2 = new Local("Campo de batalha");

        Professor professor = new Professor("Jyraia", "Taradeza");

        Aluno aluno1 = new Aluno("Naruto", 17);
        Aluno aluno2 = new Aluno("Minato", 28);
        Aluno aluno3 = new Aluno("Nagato", 22);
        Aluno aluno4 = new Aluno("Konan", 21);
        Aluno aluno5 = new Aluno("Yahiko", 23);
        Aluno alunos1[] = {aluno1, aluno2};
        Aluno alunos2[] = {aluno3, aluno4, aluno5};

        Seminario seminario1 = new Seminario("A arte do rasengao", local1, alunos1);
        Seminario seminario2 = new Seminario("Treinamento de orfaos da guerra", local2, alunos2);
        Seminario [] seminariosDisponiveis = {seminario1, seminario2};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}