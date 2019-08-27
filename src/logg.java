import java.util.Scanner;

public class logg {
    public static void main(String[] args) {
        System.out.println("Vad vill du göra?" + "\n" + "1: Visa loggboken" + "\n" + "2: Skriv in en ny post i loggboken" +"\n" + "6. Avsluta" );
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();


        if (answer.equals("1")) {
            System.out.println("test1");
        } else if (answer.equals("2")) {
            System.out.println("test2");
        } else if (answer.equals("6")) {
            System.out.println("test6");
            System.exit(0);
        }
    }
}
