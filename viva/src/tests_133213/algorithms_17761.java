package tests_133213;

import java.util.Arrays;
import java.util.Collections;

public class algorithms_17761 {
    public static int selectProblem(Integer[] levels) {
        // 내림차순으로 정렬
        Arrays.sort(levels, Collections.reverseOrder());

        // 상위 25%
        int top25PercentIndex = (int) (levels.length * 0.25) - 1;

        // 가장 쉬운 문제의 난이도를 반환.
        return levels[top25PercentIndex];
    }

    public static void main(String[] args) {
        // 예시 입력
        Integer[] levels1 = { 1, 2, 3, 4 };
        Integer[] levels2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // 예시 출력
        System.out.println("answer");
        System.out.println(selectProblem(levels1)); // 출력: 4
        System.out.println(selectProblem(levels2)); // 출력: 8
    }
}
