package 정렬;

// test case
// input
// 5 2 // 데이터 개수, K번째 수
// 4 1 2 3 5

// output
// 2

public class P11004_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 퀵정렬
        // 배열의 마지막 원소를 피벗 선택
        int start = 0;
        int end = arr.length - 1;
        
        
        while (start < end) {
            // 피벗 보다 작은 값 -> 왼쪽
            int pivot = arr[end];
            int i = start - 1;

            // 비벗보다 작은 값들을 앞으로 이동
            for (int j = start; j < end; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    // 바꾼다..
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // 피벗 보다 큰 값 -> 오른쪽
            // 피벗이 올바른 위치에 들어감
            int temp = arr[i + 1];
            arr[i + 1] = arr[end];
            arr[end] = temp;

            // 정렬 범위를 줄여서 반복
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}