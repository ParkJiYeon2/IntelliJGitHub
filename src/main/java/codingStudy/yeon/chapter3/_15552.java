package codingStudy.yeon.chapter3;

import java.io.*;
import java.util.StringTokenizer;

//https://st-lab.tistory.com/30 참고
//sout의 속도가 느린 이유
public class _15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()))+ Integer.parseInt(st.nextToken())+ "\n");
        }
        br.close();
        bw.close();


    }
}
