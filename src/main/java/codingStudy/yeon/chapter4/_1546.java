package codingStudy.yeon.chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        //https://st-lab.tistory.com/47 double
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double[] arr = new double[sc.nextInt()]; // 배열의 개수를 입력할 때 []안에 scanner를 집어넣으면 더 간략.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr); // Arrays.sort() 배열값 오름차순 정렬

        for (int i = 0; i < arr.length; i++) {
            //arr의 특정 배열 위치를 지정하고 싶다면 .length에서 -n 해준다.
            //배열은 0번부터 시작하기 때문에 원하는 위치만큼 1을 더해 마이너스 해줄 것.
            sum += (arr[i]/arr[arr.length-1] * 100);
        }
        System.out.println((sum/arr.length));

    }
}
