package 자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
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
        // 수열의 인덱스 출력
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        // 오큰수일 경우 자기 위치에 삽입 후 스택에 추가, 아닐 경우 그냥 스택에 추가
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            // 오큰수 이면 인덱스 스택이 비었으므로 추가
            // 오큰수가 아니면 스택에 추가
            stack.push(i);
        }
        // System.out.println(Arrays.toString(arr)); // [5, 7, 7, 7]
        // System.out.println(Arrays.toString(stack.toArray())); // [3]

        // 오큰수가 없는 경우 (스택 인덱스 기준) -1 출력
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1; // stack = 3 -> arr[3] = -1
        }
        // System.out.println(Arrays.toString(arr)); // [5, 7, 7, -1]

        // 출력하기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
