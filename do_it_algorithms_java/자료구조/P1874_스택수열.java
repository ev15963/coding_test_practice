package 자료구조;

// test case
// input
// 8 // 수열의 갯수
// 4 // 수열
// 3 
// 6
// 8
// 7
// 5
// 2
// 1
// output
// +
// +
// +
// +
// -
// -
// +
// +
// -
// =
// +
// -
// -
// -
// -
// -

// 참고
// https://st-lab.tistory.com/182
// Stringbuilder를 쓰는 이유 -> 여러 객체를 생성하기보다 한 객체에 변경가능한 문자열을 만들어 gc를 줄인다.
// https://onlyfor-me-blog.tistory.com/317

public class P1874_스택수열 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stringbuffer sb = new StringBuilder();

        // 수열의 갯수 할당, 수열 선언
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        // 수열 반복문으로 할당
        for (int i = 0; i < A.length(); i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
    }
}
