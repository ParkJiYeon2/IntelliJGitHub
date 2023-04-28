package codingStudy.yeon.chapter6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10988 {
    //알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
    //팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. ex) level
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int rsl = 1;
        //입력받은 문자열을 배열로 쪼갠다.
        //ex 6글자 단어의 경우 배열 0-5 , 1-4 , 2-3 의 알파벳이 같으면 팰린드롬이다.
        //fori 문을 s.length 즉 단어의 제일 마지막 글자서부터 첫번째 글자까지 내려오게 설정한다.
        for (int i = s.length() - 1; i >= 0; i--) {
            //s가 가리키고 있는 문자열에서 i번째에 있는 문자를 char타입으로 변환한다는 의미 (단어를 한글자씩 쪼갬)
            //charAt을 쓰기 위해선 꼭 char 변수를 선언해줘야 함.
            char c = s.charAt(i);

            //팰린드롬을 확인하기 위한 규칙 확인
            if (c != s.charAt(s.length() - i - 1)) {
                rsl = 0;
                break;
            }
        }

        bw.write(rsl + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
