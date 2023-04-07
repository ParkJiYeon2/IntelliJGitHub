package codingStudy.yeon.chapter2;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m =  sc.nextInt();
        int time = sc.nextInt();
        int total = h * 60 + m + time;

        h = (total / 60) % 24;
        m = total % 60;
        System.out.println(h+" "+m);
        //h와 m, time을 모두 분으로 바꾸기.
        //https://velog.io/@sherlockid8/%EB%B0%B1%EC%A4%80-2525%EB%B2%88-%EC%98%A4%EB%B8%90-%EC%8B%9C%EA%B3%84-JAVA%ED%92%80%EC%9D%B4
    }
}
