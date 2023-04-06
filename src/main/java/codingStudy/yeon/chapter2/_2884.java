package codingStudy.yeon.chapter2;

import java.util.Scanner;

public class _2884 {
    //https://st-lab.tistory.com/24 참고
    //24시간 표현
    //입력은 공백을 기준으로 시,분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (m < 45){
            h--;
            m = 60 - (45 - m);
            if( h < 0) {
                h = 23;
            }
            System.out.println(h+" "+m);
        }else System.out.println(h+" "+ (m-45));
    }
}
// n--; 가 n의 수를 1씩 줄어들게 하는 부분을 응용.
