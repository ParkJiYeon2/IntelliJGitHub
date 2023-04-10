package codingStudy.yeon.chapter3;

import java.util.Scanner;

public class _2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //다중 for문으로 i는 *을 출력하는 행의 횟수, j는 별의 개수 출력
        for (int i = 1; i <=num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //내부 for문이 끝나면 줄바꿈을 한다.
            System.out.print("\n"); //줄바꿈
        }
    }
}
