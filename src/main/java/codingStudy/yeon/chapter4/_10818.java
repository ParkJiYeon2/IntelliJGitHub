package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        //배열의 최댓값 구하기 https://hianna.tistory.com/513
        // Integer.MIN_VALUE, Integer.MAX_VALUE 으로 변수를 지정하면 바로 최대값, 최솟값을 구할 수 있다.
        int mini = arr[0];
        //for( A : B ) ->  B에서 차례대로 객체를 꺼내서 A에다가 넣겠다는 것 (B에서 꺼낼 객체가 없을 때까지)
        for (int num : arr){
            if (num < mini){
                mini = num;
            }
        }
        int max = arr[0];
        for (int num2 : arr){
            if (num2 > max) {
                max = num2;
            }
        }
        System.out.println(mini+" "+max);
    }
}
