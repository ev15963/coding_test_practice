import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static long solution(int r, int c) {
        int[][] dp = new int[r][c];

        for (int i = 0; i < r; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < c; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        return dp[r-1][c-1];
    }

    
    public static void main(String[] args) {
        System.out.println(solution(2, 4)); // to be 4
        // System.out.println(solution(3, 3)); // to be 6
    }
}
