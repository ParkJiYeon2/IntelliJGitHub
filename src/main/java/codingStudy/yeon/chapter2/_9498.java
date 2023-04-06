package codingStudy.yeon.chapter2;

import java.util.Scanner;

public class _9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 0 && score <= 100 ) {
            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("D");
            } else if (score < 60) {
                System.out.println("F");
            }
        }else{
            System.out.println("0에서 100의 숫자를 입력하세요.");
        }
    }
}
