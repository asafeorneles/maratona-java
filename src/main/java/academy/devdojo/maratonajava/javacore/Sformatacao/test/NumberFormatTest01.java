package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nbf = new NumberFormat[4];
        nbf[0] = NumberFormat.getInstance();
        nbf[1] = NumberFormat.getInstance(localeIT);
        nbf[2] = NumberFormat.getInstance(localeJP);
        nbf[3] = NumberFormat.getInstance(localeUS);

        double valor = 100_000_000.3429;
        for (NumberFormat numberFormat : nbf) {
            numberFormat.setMaximumFractionDigits(2);
            numberFormat.getMaximumFractionDigits();
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.3429";
        try{
            System.out.println(nbf[3].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
