package codingStudy.yeon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003 {
    public static void main (String[] args) throws IOException {
        //체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = 1;
        int b = 1;
        int c = 2;
        int d = 2;
        int e = 2;
        int f = 8;

        //st에 br이 담겨 있어 br을 선언해주지 않아도 된다.
        a = a - Integer.parseInt((st.nextToken()));
        b = b - Integer.parseInt((st.nextToken()));
        c = c - Integer.parseInt((st.nextToken()));
        d = d - Integer.parseInt((st.nextToken()));
        e = e - Integer.parseInt((st.nextToken()));
        f = f - Integer.parseInt((st.nextToken()));
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        System.out.print(d+" ");
        System.out.print(e+" ");
        System.out.print(f);


    }

}
