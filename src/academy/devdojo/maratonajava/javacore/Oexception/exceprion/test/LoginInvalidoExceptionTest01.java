package academy.devdojo.maratonajava.javacore.Oexception.exceprion.test;

import academy.devdojo.maratonajava.javacore.Oexception.exceprion.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    public static void logar() throws LoginInvalidoException{
        Scanner entrada = new Scanner(System.in);

        String usuarioDB = "zafin";
        String senhaDB = "zafinJava";

        System.out.println("Usuario: ");
        String usuarioInserido = entrada.nextLine();
        System.out.println("Senha: ");
        String senhaInserida = entrada.nextLine();

        if (!usuarioInserido.equals(usuarioDB) || !senhaInserida.equals(senhaDB)){
            throw new LoginInvalidoException("Usuário ou senha incorretos.");
        }

        System.out.println("Logado com sucesso");
    }
}
