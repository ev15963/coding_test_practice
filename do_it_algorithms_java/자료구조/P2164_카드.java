package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// test case
// input
// 6 // 카드의 개수

// output
// 4
public class P2164_카드 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 배열 만들기
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            // 배열에 값 넣기
            queue.add(i + 1);
        }
        System.out.println(queue.toString());

    }
}
