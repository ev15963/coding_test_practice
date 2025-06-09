import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(int[][] office, int k) {
        int answer = -1;
        return answer;
    }
    
    public static int solution(int[][] office, int k) {
        int len = office.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int count = 0;
                for (int x = 0; x < len - k + 1; x++) {
                    for (int y = 0; y < len - k + 1; y++) {
                        if (office[x][y] == 1) {
                            count += 1;
                        }
                    }  
                }
            }
        }
        
        return -1;
    }
}
