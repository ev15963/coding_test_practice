package 자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javafx.scene.Node;

// test case
// input
// 12 3
// 1 5 2 3 6 2 3 7 3 5 2 6
// output
// 1 1 1 2 2 2 2 2 3 3 2 2

// 참고
// https://g-db.tistory.com/entry/JAVA-%EB%B0%B1%EC%A4%80-11003-%EB%8D%B1

public class P11003_최솟값_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 버퍼에 넣고 한번에 출력하기 (fast io)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N : 배열의 길이, 여기선 12
        int N = Integer.parseInt(st.nextToken());

        // L : 배열의 수를 비교할 최대 길이, 여기선 3
        int L = Integer.parseInt(st.nextToken());

        // 배열의 요소 할당하기
        st = new StringTokenizer(br.readLine());

        Deque<Node> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            // 1 5 2 3 6 2 3 7 3 5 2 6 nowNun에 하나씩 들어감
            int nowNum = Integer.parseInt(st.nextToken());

            // 덱의 마지막 위치 부터 nowNum 보다 큰 값은 덱에서 제거
            // 덱이 비지 않았고 nowNum 보다 기존 값이 큰 경우 기존 값을 제거
            while (!deque.isEmpty() && nowNum < deque.getLast().value) {
                deque.removeLast();
            }

            // 덱의 마지막 위치에 nowNum값 저장하기
            deque.addLast(new Node(nowNum, i));

            // 덱의 1번째 위치에서부터 L의 범위를 벗어난 값(i - deque.getFirst().index > L)을 덱에서 제거
            if (i - deque.getFirst().index > L) {
                deque.removeFirst();
            }
            // 덱의 1번째 데이터 출력하기
            bw.write(deque.getFirst().value + " ");
        }
        // 버퍼 안에 있는 문자열이 출력
        bw.flush();
        // 스트림 종료
        bw.close();
    }

    // 덱에 저장할 노드 클래스 별도 생성하기
    static class Node {
        public int value;
        public int index;

        // 노드클래스 index(자신위치), value(자산의 값) 담기
        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
