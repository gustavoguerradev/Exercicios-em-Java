import java.time.*;
import java.time.temporal.ChronoUnit;

public class Codigos2 {
    public static void main(String[] args) {

        // Obtendo a data e hora atuais no fuso horário do sistema
        ZonedDateTime now = ZonedDateTime.now();
        int tempo = 2;
        System.out.println(now);

        // Criando um ZonedDateTime para um fuso específico
        ZonedDateTime zonedDateTimeNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Agora em Nova York: " + zonedDateTimeNY);

        //Convertendo Instant (que usa UTC) para ZonedDateTime
        Instant instant = Instant.now(); //Pega o instante global por padrao o de Londres
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("America/Sao_Paulo")); // ZoneID tambem aceita -03:00 por exemplo
        System.out.println("Instant convertido para ZonedDateTime: " + zonedDateTime);
        System.out.println("Instant sem estar convertido: " + instant);

        //Brincando com parametros e conversões
        ZonedDateTime zonedDateTime2 = LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).plus(5, ChronoUnit.DAYS);
        System.out.println("Brincando com parametros e conversões: " + zonedDateTime2);

        //Duração
        Duration duration = Duration.between(LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant(), Instant.now().minus(7, ChronoUnit.DAYS));
        System.out.println("Duração: " + duration.toDays() + " dias");

        //Period
        Period idade = Period.between(LocalDate.parse("2004-06-16"), LocalDate.now());
        System.out.println("Anos: " + idade.getYears() + "\nMeses: " + idade.getMonths() + "\nDias: " + idade.getDays());
    }
}
