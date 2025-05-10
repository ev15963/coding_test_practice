import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(String[] pouches) {
        int max_count = 0;
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
                System.out.println("contributions : "+contributions);

            }
            Collections.sort(contributions, Collections.reverseOrder());

            // todo 3. 기여도 누적합 구하면서 count에 추가하기
            int total = 0;
            int count = 0;
            for (int contribution : contributions) {
                total += contribution;
                if (total > 0) {
                    count++;
                } else {
                    break;
                }
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }
    public static void main(String[] args) {
        // String[] pouches = {"cab", "adaaa", "e"}; // to be 3;
        // String[] pouches = {"aabb", "baba"}; // to be 0;
        String[] pouches = {"d", "a", "e", "d", "abdcc"}; // to be 3;
        // String[] pouches = {"a"}; // to be 1;
        System.out.println(solution(pouches));
    }
}
