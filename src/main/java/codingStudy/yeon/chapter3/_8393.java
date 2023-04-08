package codingStudy.yeon.chapter3;

import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
