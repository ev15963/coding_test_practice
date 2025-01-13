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
        StringBuilder sb = new StringBuilder();

        // 수열의 갯수 할당, 수열 선언
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        // 스택 선언
        Stack<Integer> stack = new Stack<>();

        // 수열 반복문으로 할당
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        // stringbuffer 선언하고 A 배열 길이 만큼 +, - 추가
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        int num = 1; // 오름 차순 수

        for (int i = 0; i < A.length(); i++) {
            int su = A[i];
            // 현재 수열이 오름 차순 순서 이상일 경우 push, pop 진행
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                // num이 su 보다 커지면 pop 작업
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                // 스택 위 수가 들어오는 수열 보다 크면 출력 불가
                if (n > su) {
                    System.out.println("No");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        // 출력 불가 요건이 없다면 출력
        if (result) {
            System.out.println(bf.toString());
        }
    }
}
