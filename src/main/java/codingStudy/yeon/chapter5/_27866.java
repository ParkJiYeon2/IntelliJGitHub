package codingStudy.yeon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866 {
    //단어 S의 i번째 글자를 출력하시오
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(i-1));
        //charAt(n): String으로 저장된 문자열 중, 한 글자만 선택해 char타입으로 변환함.
        //index n번째의 문자를 char 형태로 변환하기 때문에, charAt(n) 형태여야 함.
        //Scanner를 쓰면서 char 타입을 쓸 때 사용하기도 함.
    }
}
