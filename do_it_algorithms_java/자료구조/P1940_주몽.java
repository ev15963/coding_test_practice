package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// test case
// 6 재료의 갯수
// 9 갑옷이 완성되는 번호의 합
// 2 7 4 1 5 3 재료들

// 2 예상 출력 값

// 슈도 코드
// 재료의 갯수, 번호의 합 저장
// 재료 배열 저장하기 (정렬 알고리즘의 시간 복잡도 O(nlogn)이므로 정렬 사용 가능)
// 재료 배열 정렬
// i < j일 동안 투포인터
// 재료 합 < 갑옷이 완성되는 번호의 합 -> 작은 번호 재료 한칸 위로 변경
// 재료 합 > 갑옷이 완성되는 번호의 합 -> 큰 번호 재료 한칸 아래로 변경
// 재료 합 == 갑옷이 완성되는 번호의 합 -> 경우의 수 증가, 작은 번호 재료 한칸 위로, 큰 번호 재료 한칸 아래로 (i와 j가 엇갈리면 i>j가 되서 while문 종료)

public class P1940_주몽 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 재료의 갯수 및 번호의 합 저장
        int N = Integer.parseInt(br.readLine()); // 6
        int M = Integer.parseInt(br.readLine()); // 9

        // 입력된 재료들 배열로 저장
        int sum[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sum[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(sum));

    }

}
