import java.util.*;

import jdk.internal.jshell.tool.ConsoleIOContext.FixComputer;

import java.text.*;

public class Main{
    /* 基礎運算
    public static void main(String[] args) {
        int num = 7;
        System.out.printf(num + "\n" + num + num);
        int num0 = 10;
        float num1 = 10.0f; 
        double num2 = 3.14;
        long num3 = 1000l;
        System.out.printf(num + "\n" + num1 + "\n" + num2 + "\n" + num3 + "\n");
    }
    */

    /* 位元運算
    public static void main(String[] args) {
        int num = 1;
        System.out.printf("2 的 0 次方: %d%n", num);
        System.out.printf("2 的 1 次方: %d%n", num << 1); //左移
        System.out.printf("2 的 2 次方: %d%n", num << 2);
    }
    */
    /* 型態轉換的重要 ! ! !
    public static void main(String[] args) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");           
        Date birth = dateFormat.parse("2001-1-11");
        Date current = new Date();
        long life = current.getTime() - birth.getTime();
        System.out.println("你今年的歲數為：" + (life / (365 * 24 * 60 * 60 * 1000l)));
    }
    */
    /* 二進位的魔術
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE == -Interger.MIN_VALUE);
    }
    */
    
}
