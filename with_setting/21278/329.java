import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(int n, int k) {

        // 조합 구하기
        int MOD = 10007;
        int[][] comb = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }

        // 팩토리얼 구하기
        int[] factorial = new int[k + 1];
        factorial[0] = 1;

        for (int i = 1; i <= k; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int n1 = 2;
        int k1 = 2;

        int n2 = 3;
        int k2 = 2;
        
        System.out.println(solution(n1, k1)); // to be 2
        System.out.println(solution(n2, k2)); // to be 18
    }
}
