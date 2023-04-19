package codingStudy.yeon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11720 {
    public static void main(String[] args) throws IOException {
        //정수를 문자열로 입력받는 문제.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        //정수 크기에 제한이 있어 예제의 큰 숫자는 일반적인 정수 자료형으로 담을 수 없음.
        //.getBytes() :String의 해당 문자열을 하나의 byte 배열로 변환
        //이때 변환되는 건 Charset처럼 UTF-16인코딩으로 변경 즉 아스키코드로 호환됨.
        //sc에서 이와 비슷하게 CharAt()을 사용.
        for (byte a : br.readLine().getBytes()) {
            //byte값으로 바꾼 숫자는 아스키 코드를 저장하고 있음으로 -'0' 혹은 -48을 해야함.
            sum += (a - '0');
        }
        System.out.println(sum);
    }
}
