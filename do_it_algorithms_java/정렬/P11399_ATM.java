package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// test case
// input
// 5 // 데이터 갯수
// 3 1 4 3 2

// output
// 32

public class P11399_ATM {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    int[] sum = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    // 삽입 정렬
    for (int i = 1; i < N; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }

    // 합 배열 구하기
    sum[0] = arr[0];
    for (int i = 1; i < N; i++) {
      sum[i] = sum[i-1] + arr[i];
    }

    // 합 배열의 총합 구하기
    int sum = Arrays.stream(sum).sum();

    System.out.println(sum);
  }
}
