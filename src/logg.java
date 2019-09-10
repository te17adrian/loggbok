/**
 * Loggbok
 * Created 2019-09-03
 *
 *
 * @author Adrian TE17
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class logg {
    public static void main(String[] args) {
        int w = 1;
        ArrayList<LogEntry> log = new ArrayList<>();

        while (w > 0) {
            String answer = meny();
            w = val(answer,log);
        }

    }

    private static String meny() {
        System.out.println("Vad vill du göra?" + "\n" + "1: Visa loggboken" + "\n" + "2: Skriv in en ny post i loggboken" +"\n"+ "3.Redigera en gammal post i loggboken" + "\n" + "4.Spara loggboken" + "\n" + "5.Läs in en loggbok" + "\n" + "6. Avsluta" );
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static int val(String answer, ArrayList<LogEntry> log) {

        if (answer.equals("1")) {
            System.out.println("1");
            System.out.println(log);
        } else if (answer.equals("2")) {
            LocalDateTime tid = LocalDateTime.now();
            DateTimeFormatter formtid =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            System.out.println("2");
            System.out.println("namn?");
            Scanner input = new Scanner(System.in);
            String namn = input.nextLine();
            String formattedDate = tid.format(formtid);
            log.add(new LogEntry(namn));
            System.out.println(log);

        } else if (answer.equals("3")) {
            System.out.println("3");
        } else if (answer.equals("4")) {
            System.out.println("4");
        } else if (answer.equals("5")) {
            System.out.println("5");
        } else if (answer.equals("6")) {
            System.out.println("Hej då");
                return 0;
        }
        return 1;
    }
}
