import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(int[][] office, int k) {

        int len = office.length;
        int maxCount = 0;
        for (int i = 0; i < len - k + 1; i++) {
            for (int j = 0; j < len - k + 1; j++) {
                int count = 0;
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        if (office[x][y] == 1) {
                            count += 1;
                        }
                    }  
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        
        return maxCount;
    }
    
    public static void main(String[] args) {
        // 예제 1
        // int[][] office1 = {{1,0,0,0},{0,0,0,1},{0,0,1,0},{0,1,1,0}};
        // int k1 = 2;
        // System.out.println(solution(office1, k1));  // to be 3
        
        // // 예제 2
        int[][] office2 = {{1,0,0},{0,0,1},{1,0,0}};
        int k2 = 2;
        System.out.println(solution(office2, k2));  // to be 1

    }
}
