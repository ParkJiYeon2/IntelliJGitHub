package codingStudy.yeon.chapter4;

import java.util.Scanner;


    public class _10811 {
        //바구니 n개 바구니 시작 번호 1 , 바구니 순서를 m번 역순으로 바꿈
        //2개 바구니 순서를 바꿈 a, b

        public static void main(String[] args)  {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = i+1;
                System.out.print(arr[i]);
            }

            for (int i = 0; i < M; i++) {
                int a = sc.nextInt()-1;
                int b = sc.nextInt()-1;

                //역순으로 바꾸기 위해 숫자 앞뒤를 바꿈
                while (a < b) {
                    int temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                    a++;
                    b--;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i]+" ");

            }

        }
    }

