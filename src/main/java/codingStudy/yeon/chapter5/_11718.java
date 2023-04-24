package codingStudy.yeon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11718 {
    public static void main(String[] args)  throws IOException {
        //줄바꿈을 기준으로 나뉘는 문자열을 그대로 출력하는 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //한 곳에 입력값들을 저장 시킨 후 출력한다 (Arraylist 사용 가능)
        StringBuilder sb = new StringBuilder();
        while (true){
            String s = br.readLine();
            //띄어쓰기 값을 반영 시키려면 .isEmpty() 를 사용
            //다음 입력값이 공백이면 중단시킨다.
            if (s == null || s.isBlank()){
                break;
            }
            //StringBuilder에 입력된 값 + \n(줄바꿈 이스케이프 문자) 해서 축적시킴
            sb.append(s).append("\n");
        }
        br.close();
        // 축적됐던 값을 출력한다.
        System.out.println(sb);
    }
}
