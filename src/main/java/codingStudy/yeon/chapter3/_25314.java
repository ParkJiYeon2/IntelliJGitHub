package codingStudy.yeon.chapter3;

import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int num = sc.nextInt();
        int length = num / 4;

            for (int i = 0; i < length; i++) {

                num = num - 4;
                System.out.print("long ");
            }
            System.out.print("int");
    }
}
