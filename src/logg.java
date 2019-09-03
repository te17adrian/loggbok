import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class logg {
    public static void main(String[] args) {
        int w = 1;
        ArrayList<String> log = new ArrayList<>();

        while (w > 0) {
            String answer = meny();
            val(answer,log);
        }

    }

    private static String meny() {
        System.out.println("Vad vill du göra?" + "\n" + "1: Visa loggboken" + "\n" + "2: Skriv in en ny post i loggboken" +"\n" + "6. Avsluta" );
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static void val(String answer, ArrayList<String> log) {

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
            log.add(namn + " " + formattedDate);
            System.out.println(log);
        } else if (answer.equals("6")) {
            System.out.println("6");
            System.exit(0);

        }
    }
}
