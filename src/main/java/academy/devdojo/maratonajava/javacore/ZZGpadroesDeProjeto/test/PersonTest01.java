package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.Person;

public class PersonTest01 {
    public static void main (String[] args){
//        Para criar este objeto sem um builder é difícil pois não sabemos a ordem dos atributos que devem ser inseridos.
//        Person person = new Person("Asafe", "Orneles", "zafin", "asafeorneles@gmail.com");

        Person person = new Person.PersonBuilder() // Cria o objeto builder
                .firstName("Asafe") // Retorna o próprio builder pra ser trabalhado pelos outros métodos
                .lastName("Orneles")
                .username("Zafin")
                .emailAddress("asafeorneles@gmail.com")
                .build();
        System.out.println(person);

    }
}
