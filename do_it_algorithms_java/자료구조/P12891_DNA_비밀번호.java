package 자료구조;

// test case
// input
// 9 8
// CCTGGATTG
// 2 0 1 1
// output
// 0

public class P12891_DNA_비밀번호 {
    public static void main(String[] args) throws IOException {
        // S, P 입력 값 받기
        Bufferedreader bf = new Bufferedreader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 변수 선언
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // DNA 문자열 
        char[] str = br.readLine().toCharArray();

        // 각 문자 최소 갯수 배열
        st = new StringTokenizer(br.readLine());

        // 슬라이딩 윈도우 4 길이 배열
        int[] checkArr = new int[4];

        // 2 0 1 1 담기
        for (int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }
    }
}
