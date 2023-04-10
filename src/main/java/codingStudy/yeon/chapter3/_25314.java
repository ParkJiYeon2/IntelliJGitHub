package codingStudy.yeon.chapter3;

import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int num = sc.nextInt();
        //값을 반복시킬 패턴에 변동을 주고 싶다면 패턴을 넣을 변수를 추가, for문에 패턴 변수로 조건을 다양하게 만들자.
        int length = num / 4;

            for (int i = 0; i < length; i++) {

                num = num - 4;
                System.out.print("long ");
            }
            System.out.print("int");
    }
}
