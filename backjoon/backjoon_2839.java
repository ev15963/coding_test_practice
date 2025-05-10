import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
// 설탕배달 : https://www.acmicpc.net/problem/2839
class Main {
    public static int solution(int score) {
        // todo 1. 단위 배열 만들기
        int count = 0;

        // todo 2. 단위로 나눈 나머지값이 0이 아닌경우 동안 조회 
        while (score >= 0) {
            if (score % 5 == 0) {
                count += score / 5;                
                return count;
            }
            score -= 3;
            count++;
        }
        return -1;
    }
    
    public static void main(String[] args) throws IOException {
        // int score = 18; // to be 4
        // int score = 4; // to be -1
        // int score = 6; // to be 2
        // int score = 9; // to be 3
        // int score = 11; // to be 3
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        System.out.println(solution(score));
    }

}
