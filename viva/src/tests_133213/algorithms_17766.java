package tests_133213;

import java.util.Arrays;

public class algorithms_17766 {
    public static int solution(int money, int[][] stocks) {
        // 가격 높은 순으로 배열
        Arrays.sort(stocks, (a, b) -> b[1] - a[1]);
        String text = Arrays.deepToString(stocks);
        System.out.println(text);
        System.out.println("*********************");

        // 0 ~ 10이라는 배열 만들기
        int[] money_arr = new int[money + 1];

        for (int[] stock : stocks) {
            int value = stock[0];
            int price = stock[1];
            System.out.println(Arrays.toString(stock));
            // 배열을 뒤에서부터 순회하여 최대 가치를 업데이트
            for (int j = money; j >= price; j--) {
                System.out.println("---------------------------");
                System.out.println("j");
                System.out.println(j);
                System.out.println("price");
                System.out.println(price);
                System.out.println("=============================");
                System.out.println(money_arr[j]);
                System.out.println(money_arr[j - price] + value);
                money_arr[j] = Math.max(money_arr[j], money_arr[j - price] + value);
                System.out.println(money_arr[j]);
            }

        }
        return money_arr[money];
    }

    public static void main(String[] args) {
        int money1 = 10;
        int[][] stocks1 = { { 1, 1 }, { 3, 5 }, { 3, 5 }, { 4, 9 } };
        System.out.println("예시1 결과: " + solution(money1, stocks1)); // 출력: 6

        int money2 = 30;
        int[][] stocks2 = { { 1, 31 } };
        System.out.println("예시2 결과: " + solution(money2, stocks2)); // 출력: 0
    }
}
