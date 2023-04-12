package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = 31;
        int[] arr = new int[31]; //배열의 개수가 확실히 주어졌다면 int[] 안에 해당 개수를 넣자.
        for (int i = 1; i < 29; i++) {
            int st = sc.nextInt();
            arr[st] = 1;
            System.out.print(arr[st]);
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != 1){
                System.out.println(i);
            }

        }

    }
}
