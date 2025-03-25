import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Codigos {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        LocalDate d1 = LocalDate.now(); //instancia a hora de agora
        LocalDateTime d2 = LocalDateTime.now(); // agora com data local com hora

        Instant d3 = Instant.now(); //data hora global (com fuso horario) vai gerar com 3 horas a mais pois esta no horario de londres

        LocalDate d4 = LocalDate.parse("2004-06-16");
        LocalDateTime d5 = LocalDateTime.parse("2004-06-16T12:00:02");
        Instant d6 = Instant.parse("2004-06-16T12:00:02Z");
        Instant d7 = Instant.parse("2004-06-16T15:00:02-03:00"); // passando com o fuso horario de sao paulo


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d8 = LocalDate.parse("20/07/2022", fmt1); //sem fmt nao funciona, tem que usar formato customizado

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d9 = LocalDateTime.parse("16/06/2004 12:00", fmt2);

        LocalDate d10 = LocalDate.of(2022,7,12);
        LocalDateTime d11 = LocalDateTime.of(2022,7,12, 1,12);
        Instant instant = d11.toInstant(ZoneOffset.UTC);


        //CONVERTENDO DATA HORA GLOBAL PARA LOCAL
        Instant d12 = Instant.parse("2004-06-16T01:00:02Z");
        LocalDateTime result1 = LocalDateTime.ofInstant(d12, ZoneId.systemDefault());
        LocalDateTime result2 = LocalDateTime.ofInstant(d12, ZoneId.of("Portugal"));
        int dia = d1.getDayOfYear();

        //CALCULOS COM DATA/HORA
        LocalDate d13 = LocalDate.parse("2020-01-01");
        LocalDateTime d14 = LocalDateTime.parse("2021-01-01T12:00");
        Instant d15 = Instant.parse("2022-01-01T12:00:00Z");

        LocalDate nextWeekLocalDate = d13.plusDays(7);
        Instant nextWeekInstant = d15.plus(7, ChronoUnit.DAYS);

        //CALCULOS DE DURAÇÂO
        Duration t1 = Duration.between(d15, nextWeekInstant);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
        System.out.println(d9);
        System.out.println(d10);
        System.out.println(d11);
        System.out.println(d12);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(d1.getDayOfMonth());
        System.out.println(dia);
        System.out.println(nextWeekLocalDate);
        System.out.println(nextWeekInstant);
        System.out.println(t1.toDays());
        System.out.println(t1.toHours());
        System.out.println(t1.toMinutes());

        ZoneId zonaOrigem = ZoneId.of("America/Sao_Paulo");
        System.out.println(zonaOrigem);
    }
}