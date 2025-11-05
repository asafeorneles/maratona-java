package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.*;
import org.w3c.dom.ls.LSOutput;

public class DateTransferObjectTest01 {
    public static void main(String[] args) {

        Aircraft aircraft = new Aircraft("Jatinho do Pedrinho");
        Country country = Country.BRASIL;
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        Person person = new Person.PersonBuilder()
                .firstName("Kaio")
                .lastName("Jorge")
                .build();
        String name = person.getFirstName() + " " + person.getLastName();

        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .Builder()
                .aircraft(aircraft)
                .country(country)
                .currency(currency)
                .personName(name)
                .build();

        System.out.println(reportDto);
    }

}
