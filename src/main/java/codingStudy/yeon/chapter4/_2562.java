package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int index = 0;
        //Integer.MAX_VALUE 로 변수를 만들면 바로 최대값을 구할 수 있다.
        int max = 0;
        int n = 9;
        int[] arr = new int[n];
        for (int i = 0; i <9; i++) {
            arr[i] = sc.nextInt();
        }
        for(int num : arr){
            count ++;
            if (num > max) {
                max = num;
                index = count;

            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
