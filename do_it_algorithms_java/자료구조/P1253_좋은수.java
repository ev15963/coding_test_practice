package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        int S[] = new int[num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken());

        }

    }
}
