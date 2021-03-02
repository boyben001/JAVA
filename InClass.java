import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {

        int i = Integer.MAX_VALUE; 
        System.out.println(i+2);  //overflow

        char ch = '\"';  //跳脫字元
        System.out.println(ch + "Time" + ch);
        
        Scanner scn = new Scanner(System.in);  //輸入
        String name;
        System.out.println("你叫啥???");
        name = scn.nextLine();
        System.out.println("Hi, " + name + "\n");
        //---
        System.out.println("輸入長跟寬: ");
        int l = scn.nextInt();
        int w = scn.nextInt();
        System.out.printf("長方形面積: %d%n", l*w);

        int age = 0;
        String address = "";
        age = scn.nextInt();
        scn.nextLine();  // == C 的 getchar()
        address = scn.nextLine();
        System.out.println(age + "years old");
        System.out.println("address: " + address);


    }
}
