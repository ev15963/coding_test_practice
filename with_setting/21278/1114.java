import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(int[][] office, int r, int c, String[] move) {
        int length = office.length;
        int[] rowDis = {-1, 0, 1, 0}; // 북, 동, 남, 서 순
        int[] colDis = {0, 1, 0, -1};

        // 처음에는 북쪽 방향 (rowDis와 colDis의 0번째)
        int street = 0;

        int cleanDis = 0;

        // 현위치 청소 후 0으로 바꾸기
        cleanDis += office[r][c];
        office[r][c] = 0;
        
        // 움직일 동안 명령어에 따라 진행
        for (String mission : move) {
            if (mission.equals("go")) {
                // 현위치에서 나가아야할 위치 더해주기
                int plusRow = r + rowDis[street];
                int plusCol = c + colDis[street];

                // 남북, 동서의 제한이 없고 물체 (-1)가 없는 경우 이동
                if ((plusRow >= 0 && plusRow < n) && (plusCol >= 0 && plusCol < n) && (office[plusRow][plusCol] != -1)) {
                    
                }
                
            } else if (mission.equals("left")) {
                
            } else (mission.equals("right")) {
                
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int[][] office = {{5,-1,4},{6,3,-1},{2,-1,1}};
        int r = 1;
        int c = 0;
        String[] move = {"go","go","right","go","right","go","left","go"};
        
        System.out.println(solution(office, r, c, move)); // to be 14
    }
}

