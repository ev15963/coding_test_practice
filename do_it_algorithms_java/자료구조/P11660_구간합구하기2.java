package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {
    public static void main(String[] args) throws Exception {
        // test case
        // 4 3
        // 1 2 3 4
        // 2 3 4 5
        // 3 4 5 6
        // 4 5 6 7
        // 2 2 3 4 -> 27
        // 3 4 3 4 -> 6
        // 1 1 4 4 -> 64

        // 배열크기
        // N(배열 크기) M(질의 수) 저장하기
        // (N만큼 반복하기) {
        // for (N만큼 반복하기) {
        // 원본 배열 저장하기
        // }
        // }

        // (N만큼 반복하기) {
        // for (N만큼 반복하기) {
        // 합 배열 저장하기
        // D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
        // }
        // }

        // for (M만큼 반복하기) {
        // 질의 계산 및 출력하기
        // 결과 = D[x2][y2] - D[x1-1][y2] + D[x2][y1-1] + D[x1-1][y1-1];
        // }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 변수 선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 입력과 동시에 합배열 구하기
        int S[][] = new int[N + 1][N + 1];

        // N(배열 크기) M(질의 수) 저장하기
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 합배열 저장하기
        int D[][] = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + S[i][j];
            }
        }

        // 질의 계산 및 출력하기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2] - D[x1 - 1][y2] + D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
