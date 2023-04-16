package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        //https://st-lab.tistory.com/47 double
        Scanner sc = new Scanner(System.in);
        double max = 0;
        double mins = 0;
        double totla = 0;
        double[] arr = new double[sc.nextInt()]; // 배열의 개수를 입력할 때 []안에 scanner를 집어넣으면 더 간략.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
            for (double num : arr) {
                if (num > max){
                    max = num;
                }
        }
        for (double num : arr) {
            if (num == max){

            }

        }

    }
}
