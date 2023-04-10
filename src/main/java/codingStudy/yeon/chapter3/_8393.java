package codingStudy.yeon.chapter3;

import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        for (int i = 0; i <= num; i++) {
            // += 연산자는 반복값으로 나온 값들을 더한 후 i에 할당한다.
            total += i;
        }
        System.out.println(total);
    }
}
