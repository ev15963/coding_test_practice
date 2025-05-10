import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(int N, int K) {
        // todo 1. 방문 배열 만들기
        boolean[] visited = new boolean[100001];

        // todo 2. 큐배열 선언
        Queue<int[]> queue = new LinkedList<>();
        // todo 3. 큐에 해당 값이 추가되면 방문 배열에 true로 전환
        queue.offer(new int[] { N, 0 });
        visited[N] = true;
        // todo 4. queue가 계속 있는 동안 진행
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int position = current[0];
            int depth = current[1];

            // todo 5. 만약 도착지점과 같다면 시간(깊이) 반환
            if (position == K) {
                return depth;
            }

            // todo 6. 이동 or 순간이동 하면서 방문 하지 않은 곳만 찾아가기
            int[] nextSteps = { position - 1, position + 1, position * 2 }; // {X-1, X+1, 2*X}

            for (int nextStep : nextSteps) {
                if (nextStep >= 0 && nextStep < visited.length && !visited[nextStep]) {
                    visited[nextStep] = true;
                    queue.offer(new int[] { nextStep, depth + 1 });
                }
            }
        }
        // todo 7. 만약 도달할 수 없는 경우
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sol = solution(N, K);
        System.out.println(sol); // to be 4
    }
}