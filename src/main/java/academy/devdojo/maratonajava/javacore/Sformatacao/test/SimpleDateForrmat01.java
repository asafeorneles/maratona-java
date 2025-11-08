package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateForrmat01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss Z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(calendar.getTime()));

        String pattern2 = "'Brasil,' dd 'de' MMMM 'de' yyyy  'exatamente ás' HH:mm:ss";

        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(calendar.getTime()));
    }
}
