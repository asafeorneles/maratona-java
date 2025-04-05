package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor  = new Professor();

        professor.nome = "Jiraya";
        professor.idade = 54;
        professor.sexo = 'M';

        System.out.printf("Nome: %s Idade: %d Sexo: %s", professor.nome, professor.idade, professor.sexo);

    }
}
