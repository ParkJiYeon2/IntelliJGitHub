package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1]; // 배열의 0번을 1번으로 올리기 위해 n+1을 해준다.
        for (int i =1; i <= n; i++) {
            arr[i] = i; //배열 안에 1부터 n까지의 값이 차례대로 들어간다.
        }
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int k = sc.nextInt();
            int temp = arr[p]; // temp에 [p]값을 담아 [p]와 [k]의 값이 변경될 수 있게 처리한다.
            arr[p] = arr[k];
            arr[k] = temp;
        }
        for (int i = 1; i <=n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
