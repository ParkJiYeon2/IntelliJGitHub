package codingStudy.yeon.chapter1;

import java.util.Scanner;


public class _1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //float 는 소수점 아래 n개수를 출력해 결과값 지저분함
        //double은 소수점 한 자리수 까지만 나타냄. 결과값 깔끔
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println(a/b);
    }
}
