import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataHoraExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a data
        System.out.print("Digite o ano (yyyy): ");
        int ano = scanner.nextInt();
        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia (1-31): ");
        int dia = scanner.nextInt();

        // Solicita a hora
        System.out.print("Digite a hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Digite os minutos (0-59): ");
        int minuto = scanner.nextInt();
        System.out.print("Digite os segundos (0-59): ");
        int segundo = scanner.nextInt();

        // Solicita os fusos horários
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o fuso horário de origem (exemplo: America/Sao_Paulo): ");
        String fusoOrigem = scanner.nextLine();
        System.out.print("Digite o fuso horário de destino (exemplo: Europe/London): ");
        String fusoDestino = scanner.nextLine();

        try {
            // Cria a data e hora com o fuso de origem
            ZoneId zonaOrigem = ZoneId.of(fusoOrigem);
            LocalDateTime dataHoraLocal = LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
            ZonedDateTime dataHoraOrigem = ZonedDateTime.of(dataHoraLocal, zonaOrigem);

            // Converte para o fuso horário de destino
            ZoneId zonaDestino = ZoneId.of(fusoDestino);
            ZonedDateTime dataHoraDestino = dataHoraOrigem.withZoneSameInstant(zonaDestino);

            // Formata e exibe a data e hora convertidas
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
            System.out.println("Data e hora convertidas: " + dataHoraDestino.format(formatter));
        } catch (Exception e) {
            System.out.println("Erro ao processar os fusos horários. Verifique se os nomes estão corretos.");
        }

        scanner.close();
    }
}
