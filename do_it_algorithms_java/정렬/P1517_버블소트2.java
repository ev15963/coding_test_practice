package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// test case
// input
// 8 // 수의 개수
// 3 2 8 1 7 4 5 6
// output
// 11

public class P1517_버블소트2 {
    static int[] arr;
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int start, int end) {
        // 시작점과 끝점이 같으면 종료
        if (start == end) {
            return;
        }

        // 중간 인덱스
        int middle = (start + end) / 2;

        // 재귀로 반복
        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        // tmp 배열 복사
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        // 병합
        int k = start;
        int tmpStart1 = start;
        int tmpStart2 = middle + 1;

        while (tmpStart1 <= middle && tmpStart2 <= end) {
            if (tmp[tmpStart1] <= tmp[tmpStart2]) {
                arr[k] = tmp[tmpStart1];
                tmpStart1++;
            } else {
                arr[k] = tmp[tmpStart2];
                tmpStart2++;
            }
            k++;
        }

        // 남은 거 채우기
        while (tmpStart1 <= middle) {
            arr[k] = tmp[tmpStart1];
            tmpStart1++;
            k++;
        }

        while (tmpStart2 <= end) {
            arr[k] = tmp[tmpStart2];
            tmpStart2++;
            k++;
        }
    }
}
