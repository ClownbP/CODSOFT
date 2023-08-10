import java.util.Random;
import java.util.Scanner;

public class NextRando {
    public static void main(String[] args) {

        Scanner ScanPlayerVal = new Scanner(System.in);
        int PlayerVal = ScanPlayerVal.nextInt();
        Random rand = new Random();
        int x = rand.nextInt(100);
        if (PlayerVal == x) {
            System.out.println("Correct You Win");
        } else {
            System.out.println("You were close though");
        }
        ScanPlayerVal.close();
    }
}