package 자료구조;

public class P11660_구간합구하기2 {
    public static void main(String[] args) {
        // test case
        // 4 3
        // 1 2 3 4
        // 2 3 4 5
        // 3 4 5 6
        // 4 5 6 7
        // 2 2 3 4 -> 27
        // 3 4 3 4 -> 6
        // 1 1 4 4 -> 64

        // 배열크기
        // N(배열 크기) M(질의 수) 저장하기
        // for (N만큼 반복하기) {
        //     for (N만큼 반복하기) {
        //     원본 배열 저장하기
        //     }
        // }

        // for (N만큼 반복하기) {
        //     for (N만큼 반복하기) {
        //     합 배열 저장하기
        //     D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
        //     }
        // }

        // for (M만큼 반복하기) {
        // 질의 계산 및 출력하기
        // 결과 = D[x2][y2] - D[x1-1][y2] + D[x2][y1-1] + D[x1-1][y1-1];
        // }

        BufferReader br = new BufferReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 변수 선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 입력과 동시에 합배열 구하기
        int [][] S = new int[N+1][N+1];
        for (int i = 0; i< N+1; i++) {
            for (int j = 0; j < N+1; j++) {
                
            }
        }
    }
}
