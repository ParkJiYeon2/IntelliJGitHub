package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _3052_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt() % 42;

        }
        int cnt = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] != arr[i+1]){
                cnt++;
            }
        }
        System.out.println((cnt+1));
    }

}
