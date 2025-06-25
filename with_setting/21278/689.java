import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(int[][] board, int c) {
        // 노드 클래스 생성
        class Node implements Comparable<Node> {
            int r, c, cost;
    
            Node(int r, int c, int cost) {
                this.r = r;
                this.c = c;
                this.cost = cost;
            }
    
            // 비용 기준 오름차순 정렬
            public int compareTo(Node o) {
                return this.cost - o.cost;
            }
        }
        
        // 상하좌우 이동
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // dist를 따로 만들어서 borad의 행렬만큼 최대값으로 채우기
        int n = board.length;
        int m = board[0].length;

        int[][] dist = new int[n][m];
        
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // 시작지점, 도착지점 좌표 가져오기
        int startR = 0, startC = 0, endR = 0, endC = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 2) {
                    startR = i;
                    startC = j;
                } else if (board[i][j] == 3) {
                    endR = i;
                    endC = j;
                }
            }
        }

        // 우선순위 큐를 이용한 다익스트라 초기화
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(startR, startC, 0));
        dist[startR][startC] = 0;
        
        // 큐가 없을 때 까지 동안 비용 구하기
        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            // 현재 노드와 비용 추출
            int row = curr.r;
            int col = curr.c;
            int cost = curr.cost;

            // 부여된 비용이 클 경우 continue
            if (cost > dist[row][col]) {
                continue;
            }

            // 도착했다면 종료
            if ((endR == row) && (endC == col)) {
                return cost;
            }

            // 상하좌우 이동시
            for (int i = 0; i < 4; i++) {
                int nowRow = dr[i] + row;
                int nowCol = dc[i] + col;
                
                // 배열 인덱스 초과 오류 방어
                if (nowRow < 0 || nowRow >= n || nowCol < 0 || nowCol >= m) {
                    continue;
                }

                // 비용 계산하는 cost를 따로 선언하여 계산
                int nextCost = cost + 1;
                // board를 이용해서 이동한 위치가 장애물이 있는 경우 c 만큼 추가
                if (board[nowRow][nowCol] == 1) {
                    nextCost += c;
                }
                
        }
        // 도달할 수 없는 경우 -1 처리
        return -1;
    }

    public static void main(String[] args) {
        int[][] board1 = {{0,0,0,0,2,0,0,0,0,0},{0,0,1,1,1,1,1,0,0,0},{0,0,1,1,1,1,1,1,0,0},{0,0,1,1,1,1,1,0,1,0},{0,0,1,1,1,1,1,0,0,0},{0,0,0,0,3,0,0,0,1,0}};
        int c1 = 1;

        int[][] board2 = {{0,0,0,0,2,0,0,0,0,0},{0,0,1,1,1,1,1,0,0,0},{0,0,1,1,1,1,1,1,0,0},{0,0,1,1,1,1,1,0,1,0},{0,0,1,1,1,1,1,0,0,0},{0,0,0,0,3,0,0,0,1,0}};
        int c2 = 2;
            
        System.out.println(solution(board1, c1));
        System.out.println(solution(board2, c2));
    }
}
