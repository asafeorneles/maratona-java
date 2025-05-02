package academy.devdojo.maratonajava.javacore.Oexception.exceprion.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando funcionario");
    }
}
