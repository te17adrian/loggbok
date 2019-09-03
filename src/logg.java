import java.util.Scanner;
import java.util.ArrayList;

public class logg {
    public static void main(String[] args) {
        String answer = meny();
        val(answer);


    }

    private static String meny() {
        System.out.println("Vad vill du göra?" + "\n" + "1: Visa loggboken" + "\n" + "2: Skriv in en ny post i loggboken" +"\n" + "6. Avsluta" );
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static void val(String answer) {
        ArrayList<String> log = new ArrayList<>();

        if (answer.equals("1")) {
            System.out.println("test1");
            System.out.println(log);
        } else if (answer.equals("2")) {
            System.out.println("test2");
            Scanner input = new Scanner(System.in);

        } else if (answer.equals("6")) {
            System.out.println("test6");
            System.exit(0);

        }
    }
}
