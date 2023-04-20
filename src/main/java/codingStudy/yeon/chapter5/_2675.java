package codingStudy.yeon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i <t; i++) {
            //공백을 입력처리 받지 않기 위해 split() 사용 (StringTokenrize를 사용해도 됨)
            String[] str = br.readLine().split(" ");
            int r = Integer.parseInt(str[0]);
            String s = str[1];

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k <r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
