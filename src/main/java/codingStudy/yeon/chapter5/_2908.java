package codingStudy.yeon.chapter5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //reverse() 사용 후 toString()으로 문자열 반환을 해줘야 함. 이후 Integer.parseInt로 int형 변환
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        // ? : 조건 연산자 , 조건식 ? 참일 때 반환할 값:거짓일 때 반환할 값
        System.out.print(A > B ? A:B);

    }
}
