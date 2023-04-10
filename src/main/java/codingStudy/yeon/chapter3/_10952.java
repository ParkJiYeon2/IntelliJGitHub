package codingStudy.yeon.chapter3;

import java.util.Scanner;

public class _10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 1; i > num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a+b == 0){
                break;

            }else {
                System.out.println(a+b);
            }

        }
    }
}
