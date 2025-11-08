package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nbf = new NumberFormat[4];
        nbf[0] = NumberFormat.getCurrencyInstance();
        nbf[1] = NumberFormat.getCurrencyInstance(localeIT);
        nbf[2] = NumberFormat.getCurrencyInstance(localeJP);
        nbf[3] = NumberFormat.getCurrencyInstance(localeUS);

        double valor = 1000.3429;
        for (NumberFormat numberFormat : nbf) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1,000.34";
        try{
            System.out.println(nbf[3].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
