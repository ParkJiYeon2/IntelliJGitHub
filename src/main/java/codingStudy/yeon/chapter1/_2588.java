package codingStudy.yeon.chapter1;

import java.util.Scanner;

public class _2588 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();

            int hundredsDigit = 0;
            int tendsDigit = 0;
            int unitDigit = 0;
            //중괄호 안의 변수는 지역 변수로, 중괄호 안에서만 사용 가능하다.
            {
                int tmepValue = secondNum;
                hundredsDigit = tmepValue / 100;
                System.out.println(hundredsDigit + "Hundreds");

                tmepValue = tmepValue % 100;
                tendsDigit = tmepValue / 10;
                System.out.println(tendsDigit + "tens");
                System.out.println(tmepValue + "temp");

                tmepValue = tmepValue % 10;
                unitDigit = tmepValue;
            }
            System.out.println(firstNum * unitDigit);
            System.out.println(firstNum * tendsDigit);
            System.out.println(firstNum * hundredsDigit);
            System.out.println(firstNum * secondNum);
        }
}
