package 정렬;

// test case

// input
// 11 // 배열의 길이
// 215
// 15
// 344
// 372
// 294
// 100
// 8
// 145
// 24
// 198
// 831

// output
// 8
// 15
// 24
// 100
// 145
// 198
// 215
// 294
// 344
// 372
// 831

public class P10989_수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        // 기수정렬
        RadixSort(arr, 5);
    }

    public static void RadixSort(int[] arr, int maxSize) {
        // 기수 정렬 시킬 새 배열
        int[] output = new int[A.length];
    }
}
