package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// test case
// input
// 9 8
// CCTGGATTG
// 2 0 1 1
// output
// 0

// 참고
// https://jyeonnyang2.tistory.com/321
// https://velog.io/@richsubin/%EB%B0%B1%EC%A4%80-12891%EB%B2%88-DNA-%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8-JAVA

public class P12891_DNA_비밀번호 {

    // 슬라이딩 윈도우 4 길이 배열
    static int[] checkArr = new int[4];

    // A C G T에 따라 myArr에 추가
    static int[] myArr = new int[4];

    public static void main(String[] args) throws IOException {
        // S, P 입력 값 받기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 변수 선언
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // DNA 문자열
        char[] str = bf.readLine().toCharArray();
        // 각 문자 최소 갯수 배열
        st = new StringTokenizer(bf.readLine());

        // 2 0 1 1 담기
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }

        // 출력값 answer 선언
        int answer = 0;

        // 주어진 패스워드 길이에 따라 슬라이딩 초기화 과정
        for (int i = 0; i < P; i++) {
            if (str[i] == 'A')
                myArr[0]++;
            if (str[i] == 'C')
                myArr[1]++;
            if (str[i] == 'G')
                myArr[2]++;
            if (str[i] == 'T')
                myArr[3]++;
        }
        if (checkCounting())
            answer++;

        // 부분 문자열 (슬라이딩 윈도우 움직이는 횟수)
        for (int j = P; j < S; j++) {
            // ex) j = 8, P = 8, i = 0
            int i = j - P;

            if (str[i] == 'A')
                myArr[0]--;
            if (str[i] == 'C')
                myArr[1]--;
            if (str[i] == 'G')
                myArr[2]--;
            if (str[i] == 'T')
                myArr[3]--;

            if (str[j] == 'A')
                myArr[0]++;
            if (str[j] == 'C')
                myArr[1]++;
            if (str[j] == 'G')
                myArr[2]++;
            if (str[j] == 'T')
                myArr[3]++;
        }
        if (checkCounting())
            answer++;

        System.out.println(answer);
    }

    public static boolean checkCounting() {
        for (int i = 0; i < 4; i++) {
            if (myArr[i] < checkArr[i]) {
                return false;
            }
        }
        return true;
    }
}
