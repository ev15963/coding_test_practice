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

        // 합배열 선언
        int S[] = new int[N];

        // 나머지 배열 선언
        int M[] = new int[N];

        // M으로 나누어 떨어지는 구간의 개수
        int result;

        // 배열 돌려가며 구간합 구하기
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 구간합 배열 적재하기
            if (i == 0)
                S[i] = num;
            else 
                S[i] = S[i-1] + num;
            
            // M 배열도 같이 적재하기
            M[i] = S[i] % M;
        }

        // M 배열의 배열 결과 중 0인 값의 S[i] 총 합계
        for (int i = 0; i < N; i++) {
            if (M[i] == 0) {
                result += S[i];
            }
        }
        return result;
    }
}
