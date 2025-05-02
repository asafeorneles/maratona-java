package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException(); // Ele vai procurar um catch ate achar um melhor, nesse caso ele vai no mais genérico.
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            talvezLanceUmaExcessao(); // Como pode rolar uma excessao, obrigatoriamente se deve tratar.
        }catch(SQLException | FileNotFoundException e){
            System.out.println("Dentro do SQLException | FileNotFoundException");
        }

//        Antes se tinha assim:
//        try{
//            talvezLanceUmaExcessao();
//        }catch(SQLException e){
//            System.out.println("Dentro do SQLException");
//        }catch(FileNotFoundException e){
//            System.out.println("Dentro do FileNotFoundException");
//        }
//        O que mudou foi apenas a forma de escrever. É mais limpa e ocupa menos linha de código

    }

    public static void talvezLanceUmaExcessao() throws SQLException, FileNotFoundException {
        throw new SQLException();
    }
}
