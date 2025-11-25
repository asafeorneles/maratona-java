package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    PersonService personService;


    @BeforeEach
    public void setUp() {
        adult = new Person(19);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnsFalse_WhenAgeIsLowerThan18() {  // Forma de nomear o test: Nome do metodo, O que ele deve retornar, a condição do retorno dele.
        Assertions.assertFalse(personService.isAdult(notAdult));
//      Assertions.assertEquals(false, personService.isAdult(person)); -> Mesma coisa que assertFalse, mas passamos que esperamos que o resultado seja falso

    }

    @Test
    @DisplayName("A person should be adult when age is greater or equals than 18")
    void isAdult_ReturnsTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException when age is null")
    void isAdult_ShouldThrowException_WhenAgeIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> personService.isAdult(null));
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultsOnly_WhenListOfPersonIsPassed() {
        List<Person> personList = new ArrayList<>(List.of(new Person(20), new Person(15), new Person(38)));
        Assertions.assertEquals(2,personService.filterRemovingNotAdult(personList).size());
    }
}