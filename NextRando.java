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
            System.out.println("Hey! No let's try again.");
            for (int i = 0; i < 3; i++) {
                int PlayerVal_ = ScanPlayerVal.nextInt();
                if (PlayerVal_ - x < 25) {
                    System.out.println("You were pretty close though");
                } else {
                    System.out.println("Omg you are so wrong! Try one more time.");
                }
            }
        }
        ScanPlayerVal.close();
    }
}