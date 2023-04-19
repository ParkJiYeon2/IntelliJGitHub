package codingStudy.yeon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1546_2 {
    public static void main(String[] args) throws IOException {
        //1546번 br로 풀이방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double arr[] = new double[Integer.parseInt(br.readLine())];
        //br은 공백까지 한 줄로 한 번에 받기 때메 반드시 문자열 분리를 해야함.
        //문자열 분리를 위해 StringTokenizer 사용
        //해당 문제는 한 줄에 공백을 기준으로 숫자 여러개를 받기 때문에 필요.
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i <arr.length; i++) {
            arr[i]=Double.parseDouble(st.nextToken());
        }
        double sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / arr[arr.length-1] * 100);
        }
        System.out.println((sum / arr.length));
    }
}
