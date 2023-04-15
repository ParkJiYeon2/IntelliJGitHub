package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int mins = 0;
        int totla = 0;
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
            for (int num : arr) {
                if (num > max){
                    max = num;
                }
        }
        for (int num : arr) {
            if (num == max){

            }

        }

    }
}
