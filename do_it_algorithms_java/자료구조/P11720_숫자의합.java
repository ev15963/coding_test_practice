package 자료구조;

// 슈도코드 작성
// N값 입력 받기
// 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
// sNum을 다시 char []형 변수 cNum에 변환하여 저장하기 -> String => char[]
// int형 변수 sum 선언하기
// for (cNum 길이만큼 반복하기)
// {
// 배열의 각 자릿값을 정수형으로 변환하여 sum에 더하여 누적하기
// }
// sum 출력하기

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0; // 초기화
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // or 48
        }
        System.out.println(sum);
    }
}