import java.io.*;
import java.util.Random;

/**
 * This is a class
 * Created 2019-09-17
 *
 * @author Magnus Silverdal
 */
public class filHantering {
    public static void main(String[] args) {
        String filenameTxt = "RandomNumbers.txt";
        String filenameBin = "RandomNumbers.bin";

        try {
            DataOutputStream binOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filenameBin)));
            PrintWriter txtOut = new PrintWriter(new BufferedOutputStream(new FileOutputStream(filenameTxt)));
            Random r = new Random();
            for (int i = 0 ; i < 1000 ; i++) {
                int randomNumber = r.nextInt();
                binOut.writeInt(randomNumber);
                txtOut.println(randomNumber);
            }
            binOut.close();
            txtOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataInputStream binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filenameBin)));
            int number;
            System.out.println("Binary data");
            for (int i = 0 ;  i < 1000 ; i++) {
                number = binIn.readInt();
                System.out.println(number);
            }
            System.out.println("Text data");
            BufferedReader txtIn = new BufferedReader(new FileReader(filenameTxt));
            for (int i = 0 ; i < 1000 ; i++) {
                number = Integer.parseInt(txtIn.readLine());
                System.out.println(number);
            }
            binIn.close();
            txtIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}