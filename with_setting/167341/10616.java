import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static boolean solution(int capacity, int[][] routes) {
        // 0~1000 거리 선언
        int[] distance = new int[1001];

        // 최대 경로 구하기
        int maxDistance = 0;
        
        for (int[] route : routes) {
            int get = route[0];
            int start = route[1];
            int end = route[2];

            // 선물 들고 가는 경로 남기기
            distance[start] += get;
            distance[end] -= get;

            maxDistance = Math.max(maxDistance, end);
        }

        int currentGift = 0;
        // 최대 용량이 넘을 경우 false
        for (int i = 0; i < maxDistance+1; i++) {
            // 누적해서 더하기
            currentGift += distance[i];
            
            if (capacity < currentGift) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[][] routes = {{3, 2, 6}, {5, 1, 4}, {1, 7, 13}};
        System.out.println(solution(9, routes)); // to be true
    }
}
