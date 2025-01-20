package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// input
// 4 // 수열의 크기
// 3 5 2 7

// output
// 5 7 7 -1

public class P17298_오큰수 {
    public static void main(String[] args) throws IOException {
        // 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer sb = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            // 수열의 크기만큼 입력값 받기
            arr[i] = Integer.parseInt(sb.nextToken());
        }
        System.out.println(Arrays.toString(arr));
    }
}
