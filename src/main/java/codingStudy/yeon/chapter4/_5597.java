package codingStudy.yeon.chapter4;

import java.util.Scanner;

public class _5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = 31;
        int[] arr = new int[31]; //배열의 개수가 전제로 주어졌다면 int[] 안에 해당 개수를 넣자.
        for (int i = 1; i < 29; i++) {
            int st = sc.nextInt();
            arr[st] = 1; // 입력한 학생 번호 배열 안에 1값을 넣는다.
        }
        //for문을 돌려 arr 배열 안에 1값이 들어있지 않은 수를 출력 시킨다.
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != 1){
                System.out.println(i);
            }

        }

    }
}
