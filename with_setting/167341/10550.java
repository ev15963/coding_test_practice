import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(String[] pouches) {
        // todo 1. 낱말을 abcde 문자열로 순회하며 진행
        for (char i = 'a'; i <= 'e'; i++) {
            System.out.println("flavor : "+i);
            // todo 2. contributions 기여도 구하기
            List<Integer> contributions = new ArrayList<>();
            
            for (String pouch : pouches) {
                int thisFlavor = 0;
                for (char c : pouch.toCharArray()) {
                    if (c == i) {
                        thisFlavor += 1;
                    }
                }
                int etcFlavor = pouch.length() - thisFlavor;
                contributions.add(thisFlavor - etcFlavor);
                Collections.sort(contributions, Collections.reverseOrder());
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String[] pouches = {"cab", "adaaa", "e"}; // to be 3;
        // String[] pouches = {"aabb", "baba"}; // to be 0;
        // String[] pouches = {"d", "a", "e", "d", "abdcc"}; // to be 3;
        // String[] pouches = {"a"}; // to be 1;
        System.out.println(solution(pouches));
    }
}
