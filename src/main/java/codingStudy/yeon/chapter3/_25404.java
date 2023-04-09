package codingStudy.yeon.chapter3;

import java.util.Scanner;

//https://www.notion.so/c6b9c3f2a6ca48c78c8c280f0c953cda?v=973e6f150e1148d983e7e17de90a853e&p=4b4300d65a664fd790ce4e4d7cf8a2d7&pm=s
public class _25404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int totalNum = sc.nextInt();
        int price, num, tempPrice = 0;
        for (int i = 0; i < totalNum; i++) {
            price = sc.nextInt();
            num = sc.nextInt();
            tempPrice = tempPrice + (price * num);
        }
        if (tempPrice == total){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
