package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 문제
// 주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수가 있다면 좋은 수

// test case
// input
// 10 // 수의 개수
// 1 2 3 4 5 6 7 8 9 10
// output
// 8

public class P1253_좋은수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(br.readLine());

        long S[] = new long[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            S[i] = Integer.parseInt(st.nextToken());

        }

        // 정렬
        Arrays.sort(S);

        // 경우의 수
        int count = 0;
        for (int idx = 0; idx < num; idx++) {

            // 투포인터 구하기
            // ** i와 j를 초기화한 후, 모든 idx 값에 대해 반복문을 실행해야 하지만,
            // ** i와 j를 매번 초기화하지 않아서 문제가 발생
            // ** 투포인터 초기화 해야함
            int i = 0;
            int j = num - 1;

            while (i < j) {
                if (S[i] + S[j] == S[idx]) {
                    if (i != idx && j != idx) {
                        count++;
                        break;
                    } else if (i == idx) {
                        i++;
                    } else if (j == idx) {
                        j--;
                    }
                } else if (S[i] + S[j] < S[idx]) {
                    i++;
                } else if (S[i] + S[j] > S[idx]) {
                    j--;
                }
            }

        }
        System.out.println(count);
    }
}
