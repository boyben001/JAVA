import java.util.Random;
import java.util.Scanner;

public class HW1_3 {
    public static void main(String[] args) {
        Random randomGen = new Random();
        int [] ans;
        ans = new int[4];
        for (int i = 0; i < 4; i++){
            ans[i] = randomGen.nextInt(3);
        }
        System.out.println("正解: ");
        for (int i = 0; i < 4; i++){
            System.out.printf("%d", ans[i]);
        }
        System.out.println("\n");

        boolean state = false;  //過關狀態

        Scanner scn = new Scanner(System.in);
        while(state != true){
            int []guess;
            guess = new int[4];
            for (int i = 0; i < 4; i++){
                int num = scn.nextInt();
                guess[i] = num;
            }
            scn.nextLine();
            boolean []correct;
            correct = new boolean[4];
            for (int i = 0; i < 4; i++){
                correct[i] = false;    //一開始都設錯
            }
            int A = 0, B = 0;
            for(int i = 0; i < 4; i++){
                if (ans[i] == guess[i]){
                    correct[i] = true;
                    A++;
                }
                for (int j = i+1; j < 4; j++){
                    if (ans[i] == guess[j] && !correct[i]){
                        B++;
                        break;
                    }
                }   
            }
            if (A == 4){
                state = true;
                System.out.println("恭喜過關~~~\n");
            }
            System.out.printf("%dA %dB\n", A, B);
        }
        
    }
}
