package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeveloperTest {

    @Test
    public void instanceOf_ReturnData_WhenObjectIsOfChildOfType(){
        Employee employeeDeveloper = new Developer(1, "Java");
//        Employee employeeDeveloper = new Employee(1);

        if (employeeDeveloper instanceof Developer){ // Forma antiga de fazer. Antes, requeria um Quest
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java", developer.getMainLanguage());
        } else {
            Assertions.fail();
        }

        if (employeeDeveloper instanceof Developer developer){ // Forma nova de fazer, agora, só adicionar uma variavel do lado que se for uma instancia, o Java já faz o Quest dentro do if
            Assertions.assertEquals("Java", developer.getMainLanguage());
        } else {
            Assertions.fail();
        }
    }
}