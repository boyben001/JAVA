import java.util.Scanner;

public class HW1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        int max = -1;
        while((num = scn.nextInt()) >= 0){
            if (num == -1) {
                break;
            }
            else{
                if (num > max){
                    max = num;
                }
            }
        }
        System.out.printf("全部輸入的數最大為: %d\n", max);
    }
}
