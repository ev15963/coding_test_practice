package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

// test case
// input
// 18
// 1
// -1
// 0
// 0
// 0
// 1
// 1
// -1
// -1
// 2
// -2
// 0
// 0
// 0
// 0
// 0
// 0
// 0

// output
// -1
// 1
// 0
// -1
// -1
// 1
// 1
// -2
// 2
// 0

public class P11286_절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // compare return
        // 양수 : 첫번째 매개변수가 더 큰 값으로 판단
        // 0 : 같은 값으로 판단
        // 음수 : 첫번째 매개변수가 더 작은 값으로 판단
        // https://velog.io/@robolab1902/Java-Priority-Queue-%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%EC%97%90-%EB%9E%8C%EB%8B%A4%EC%8B%9D-%EC%93%B0%EB%8A%94-%EC%9D%B4%EC%9C%A0%EA%B0%80-%EB%AD%90%EC%95%BC

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            // 절대값이 같으면
            if (first_abs == second_abs) {
                // 음수 먼저 정렬
                return o1 > o2 ? 1 : -1;
            } else {
                return first_abs - second_abs;
            }
        });

        for (int i = 0; i < N; i++) {
            int queue_value = Integer.parseInt(br.readLine());
            // queue 0일때 들어갈 값이 비어있으면 0
            // 비어 있지 않다면 큐의 front 값 출력
            if (queue_value == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }

            } else {
                queue.add(queue_value);
            }
        }
    }
}
