package 자료구조;


// 슈도코드 작성
// suNo(숫자 갯수), quizNo(질의 갯수) 저장하기
// for (숫자 갯수만큼 반복하기) {
//    합 배열 생성하기(S[i] = S[i - 1] + A[i])
// }
// for (질의 갯수 만큼 반복하기) {
// 질의 범위 받기 (i ~ j)
// 구간 합 출력하기 (S[i] - S[i - 1])
// }

public class P11659_구간합구하기 {
    public static void main(String[] args) {
        // 숫자 갯수, 질의 갯수 저장하기
        // 숫자 갯수 : suNo
        // 질의 갯수 : quizNo
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // 합배열 선언 long 형으로 숫자 덧셈시 범위가 넘어가는 경우가 있음
        long[]S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferReader.readLine());
        
        // 0번째 신경 안쓰고 진행하기 위해 1부터 시작
        for (int i =1; i<=suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.readLine());
        }
        // 질의 갯수 만큼 반복하기
        for (int q=0; q<quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[j] - S[i-1]);
        }
    }
}
