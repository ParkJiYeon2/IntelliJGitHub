package codingStudy.yeon.chapter3;

import java.util.Scanner;

public class _10951 {
    //입력의 종료는 더이상 읽을 수 있는 데이터 (EOF) 가 없을 때 종료한다.
    //EOP란? 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때
    //Scanner의 경우 EOP 상황 시, NoSuchElementException 오류를 띄움
    //처리1. try-catch 문으로 예외상황 시 반복문을 종료시키도록 함
    //처리2. Scanner 의 메소드인 hasNext()를 통해 처리함
    //System.in=키보드 엔터나 스페이스도 입력값을 받았다고 처리함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){

            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);

        }
    }
}
