package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// TODO 1. 배열의 구간합 배열 생성하기
// TODO 2. 구간합 배열의 나머지 배열 구하기
// TODO 3. 나머지 배열 요소가 0인 부분만 더하기

// test case
// 5 3
// 1 2 3 1 2

public class P10986_나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 변수 선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 합 배열 및 나머지 카운팅 결과 값
        long[] S = new long[N + 1];
        long result = 0;

        // 입력값 읽기
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            S[i] = S[i - 1] + num; // 합 배열 생성
            int remainder = (int) (S[i] % M); // 나머지 계산
            if (remainder < 0)
                remainder += M; // 음수 나머지 보정
            if (remainder == 0)
                result++; // 나머지 개수 증가
        }

        // 결과 출력
        System.out.println(result);
    }
}
