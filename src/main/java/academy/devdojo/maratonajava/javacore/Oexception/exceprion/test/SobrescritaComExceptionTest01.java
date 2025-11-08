package academy.devdojo.maratonajava.javacore.Oexception.exceprion.test;

import academy.devdojo.maratonajava.javacore.Oexception.exceprion.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exceprion.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exceprion.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
