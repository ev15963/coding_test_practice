package 자료구조;

import java.util.Scanner;

// test case
// input
// 15
// output
// 4

// 슈도 코드
// N 변수 저장
// 사용 변수 초기화 (count = 1, start_index = 1, end_index = 1, sum = 1)
// while(end_index != N) {
//    if (sum == N) count 증가, end_index 증가, sum값 변경
//    else if (sum > N) sum값 변경, start_indes 증가
//    else if (sum < N) end_index 증가, sum값 변경
// }
// count 출력하기

public class P2018_연속된자연수의합 {
  public static void main(String[] args) {

    // 변수 초기화
    int count = 1;
    int start_index = 1;
    int end_index = 1;
    int sum = 1;

    // test case 입력 받아서 변수 초기화
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    // 연속된 자연수의 합 구하기
    while (end_index != N) {
      if (sum == N) {
        count++;
        end_index++;
        sum = sum + end_index;
      } else if (sum > N) {
        sum = sum - start_index;
        start_index++;
      } else if (sum < N) {
        end_index++;
        sum = sum + end_index;
      }
    }

    System.out.println(count);
  }
}
