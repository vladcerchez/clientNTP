import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class ExactHour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("(ex. 'GMT+2') or 'exit': ");
            String geoZone = scanner.nextLine();

            if ("exit".equalsIgnoreCase(geoZone)) {
                break;
            }
            String zoneId = "GMT" + geoZone.substring(3);

            try {
                ZonedDateTime exactHour = ZonedDateTime.now(ZoneId.of(zoneId));
                System.out.println("Exact hour for geoZone is: " + exactHour);
            } catch (Exception e) {
                System.out.println("Incorrect format");
            }

            System.out.println();
        }

        System.out.println("Program closed");
    }
}
