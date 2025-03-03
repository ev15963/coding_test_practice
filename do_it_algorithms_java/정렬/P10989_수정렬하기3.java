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
        int[] output = new int[arr.length];
        int jarisu = 1;
        int count = 0;

        while(count != maxSize) {
            int[] bucket = new int[10];
            // 일의 자릿수가 몇개 있는지 배열로 나타냄
            for (int i = 0; i < arr.length; i++) {
                bucket[(arr[i] / jarisu) % 10]++;
            }
            // 중간 결과 : [1, 1, 1, 0, 3, 3, 0, 0, 2, 0]
            
            // 합배열 사용
            for (int i = 1; i < 10; i++) {
                bucket[i] = bucket[i] + bucket[i-1];
            }
            // 중간 결과 : [1, 2, 3, 3, 6, 9, 9, 9, 11, 11]
               
            count++;
        }
    }
}
