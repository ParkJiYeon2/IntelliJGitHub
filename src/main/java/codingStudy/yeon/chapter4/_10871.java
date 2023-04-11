package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n; i++) {
            array [i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (x > array[i]) {
                System.out.print(array[i]+" ");
            }
        }
    }
}
