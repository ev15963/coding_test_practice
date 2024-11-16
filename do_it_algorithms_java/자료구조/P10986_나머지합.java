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
        int S[][] = new int[N][N];

    }
}