package codingStudy.yeon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            String a = br.readLine();
            sb.append(a.charAt(0));
            sb.append(a.charAt(a.length()-1)+"\n");

        }
        System.out.println(sb);

    }

}
