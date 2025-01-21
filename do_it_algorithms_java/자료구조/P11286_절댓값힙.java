package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

// test case
// input
// 18
// 1
// -1
// 0
// 0
// 0
// 1
// 1
// -1
// -1
// 2
// -2
// 0
// 0
// 0
// 0
// 0
// 0
// 0

// output
// -1
// 1
// 0
// -1
// -1
// 1
// 1
// -2
// 2
// 0

public class P11286_절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(Arrays.toString(arr));
    }
}
