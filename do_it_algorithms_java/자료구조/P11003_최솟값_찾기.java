package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
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

        // N : 배열의 길이, 여기선 12
        int N = Integer.parseInt(st.nextToken());

        // L : 배열의 수를 비교할 최대 길이, 여기선 3
        int L = Integer.parseInt(st.nextToken());

        // 배열의 요소 할당하기
        st = new StringTokenizer(br.readLine());

        Deque<Node> deque = new ArrayDeque();

        for (int i = 0; i < N; i++) {
            int nowNum = Integer.parseInt(st.nextToken());

        }
    }
}
