import java.util.Random;
import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args) {
        Random randomGen = new Random();
        int n1, n2;
        do {
            n1 = randomGen.nextInt(5);
            n2 = randomGen.nextInt(5);
            System.out.printf("隨機配對為: %d, %d\n", n1, n2);
        }while((n1 + n2) != 5);

    }
}
