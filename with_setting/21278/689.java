import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(int[][] board, int c) {
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
        
        return 0;
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
