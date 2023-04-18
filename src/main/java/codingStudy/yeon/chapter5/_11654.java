package codingStudy.yeon.chapter5;

public class _11654 {
    public static void main(String[] args) throws Exception{

        //sc나 br도 되지만 코드 최적화 측면에서 System.in 사용
        //사용 시 꼭 예외처리 (main 옆 Exception 혹은 IOException)
        int a = System.in.read(); //byte값으로 문자 한 개만 읽고, 해당 문자의 아스키코드 값을 저장
        System.out.println(a);

    }
}
