package codingStudy.yeon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2444 {
/*우선 i가 1일 때, 스페이스 4개가 먼저 출력된다.
즉, j = 1부터 n - i까지인 for-loop을 만든다. 이 for-loop에서는 스페이스만 추가한다.
그리고 i = 1일 때, *이 1개, i = 2일 때, *이 3개다.
즉, 별이 2 × i - 1개 있다는 것. 새로운 for-loop을 만들어 처리한다.
상단의 삼각형 * 모양이 생겼다 이후 나머지 줄을 처리해준다.
새로운 이중 for-loop을 만들어 준다.  i = n - 1부터 i가 1이 될 때까지 이다.
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
