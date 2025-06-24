package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneIdTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); // Retorna as zonas que o Java oferece suporte

        ZoneId zoneId = ZoneId.systemDefault(); // Retorna a zona configurada no nosso SO
        System.out.println(zoneId);

        ZoneId australiaZone = ZoneId.of("Australia/Sydney"); // Criamos uma ZoneId
        System.out.println(australiaZone);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = now.atZone(australiaZone); // Atribuímos uma zona no localDate. Logo, é criado um ZonedLocalDate (Não altera o horário pra Australia/Sidnay)
        System.out.println(zonedDateTime1);

        Instant nowInstant = Instant.now(); // Criamos uma instant que retorna a zulu time
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(australiaZone); // Atribuímos uma zona no Instant. Ele adiciona ou subtrai as horas do fuso horario ao zulu time (horario neutro)
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN); // Minimos que podemos setar para uma deterrmrinada hora
        System.out.println(ZoneOffset.MAX); // Máximo que podemos setar para uma deterrmrinada hora

        ZoneOffset offsetLisboa = ZoneOffset.of("+01:00"); // Criamos um Offset (Quando nao sabemos ou temos a zona mas sabemos o seu UTC)
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetLisboa); // Atribui o offset ao DataTime
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetLisboa); // Outra forma de atribuir um offset
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetLisboa); // Atribuindo um offSet a um instant, logo ele adiciona ou subtrai as horas no zulu tima
        System.out.println(offsetDateTime3);

        JapaneseDate japaniseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaniseDate);

        LocalDate japaniseLocalDate = LocalDate.of(1900, 2, 1);
        System.out.println(JapaneseDate.from(japaniseLocalDate));
    }
}
