package codingStudy.yeon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; //배열 초기화
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //byte로 변환된 값은 UTF-16으로 변환돼 아스키코드로 호환됨.
            //아스키코드는 숫자와 영어가 동일한 값을 나타냄.
            //97은 a의 10진수이기도 하니 by - a도 가능함.
            //즉 이전의 숫자 byte 변환 문제에서 마지막에 '0' 혹은 '48' 을 빼준 것처럼 문자열 아스키코드값인 97을 빼준다.
            //아스키코드의 숫자 초기화 '0'/48 , 영어 초기화 'a'/97
            if (arr[ch - 97] == -1) {
                //동일한 문자가 있을 경우 처음 변경된 값만 유지하기 위해 if문을 건다.
                arr[ch - 97] = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
