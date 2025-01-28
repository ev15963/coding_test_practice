package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// test case
// input
// 5 // 배열의 크기
// 10
// 1
// 5
// 2
// 3

// output
// 3

public class P1377_버블소트1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // int arr[] = new int[N];
        mData arr[] = new mData[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new mData(Integer.parseInt(br.readLine()), i);
        }

        for (int i = 0; i < N; i++) {
            System.out.println("arr[" + i + "].index" + (arr[i].index));
            System.out.println("arr[" + i + "].value" + (arr[i].value));
        }
    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}