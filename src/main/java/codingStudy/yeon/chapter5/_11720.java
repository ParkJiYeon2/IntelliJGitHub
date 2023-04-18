package codingStudy.yeon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        for (byte a : br.readLine().getBytes()) {
            //byte값으로 바꾼 숫자는 아스키 코드를 저장하고 있음으로 -0 혹은 -48을 해야함.
            sum += (a - '0');
        }
        System.out.println(sum);
    }
}
