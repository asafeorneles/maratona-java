package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // Mostra a atual config do locale no sistema operacional
        String[] isoLanguages = Locale.getISOLanguages(); // Pega todas as linguagens disponíveis
        String[] isoCountries = Locale.getISOCountries(); // Pega todos os países disponíveis

        for (String isoLanguage : isoLanguages){
            System.out.print(isoLanguage + " ");
        }

        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

    }
}
