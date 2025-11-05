package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.CurrencyFactory;

import java.beans.Customizer;

public class CurrencyTest01 {
    public static void main(String[] args) {
        // Código cliente limpo
        Currency currencyReal = CurrencyFactory.newCurrency(Country.BRASIL);
        Currency currencyUsa = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currencyUsa.getSymbol());
        System.out.println(currencyReal.getSymbol());

        // Se necessário criar moedas em outro ponto do código, não precisa criar outros switch
        // Se criar outra moeda Euro por exemplo, só iremos alterar a lógica 1 vez ne uma classe separada.
    }
}
