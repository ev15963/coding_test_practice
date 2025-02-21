package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// test case
// input
// 5 // 수의 개수
// 5
// 4
// 3
// 2
// 1

// output
// 1
// 2
// 3
// 4
// 5

// 참고 URL
// https://ittrue.tistory.com/564

public class P2751_수정렬하기2 {
    // mergeSort 함수 생성으로 인한 변수 상위 선언
    static int[] arr;
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tmp = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(Arrays.toString(arr));

    }

    // 병합 정렬
    public static void mergeSort(int start, int end) {
        // 시작점과 끝점이 같으면 종료
        if (start == end) {
            return;
        }
        // 중간 인덱스 구하기
        int middle = (start + end) / 2;

        // 재귀로 반복 0 ~ middle, middle+1 ~ end
        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        // tmp 배열 복사
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        // 복사한 tmp로 반으로 나눠서 비교 (두 그룹을 병합하는 로직)
        int k = start;
        int tmpStart1 = start;
        int tmpStart2 = middle + 1;

        // 복사한 tmp을 반으로 나눠서 비교
        while (tmpStart1 <= middle && tmpStart2 <= end) {
            // tmp 배열의 시작점1이 시작점2보다 작거나 같으면 원래 배열에 추가
            if (tmp[tmpStart1] <= tmp[tmpStart2]) {
                arr[k] = tmp[tmpStart1];
                tmpStart1++;
            } else {
                arr[k] = tmp[tmpStart2];
                tmpStart2++;
            }
            k++;
        }
    }
}
