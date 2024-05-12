package tests_133213;

public class algorithms_17766 {
    public static int solution(int money, int[][] stocks) {
        // 가치의 총합
        int totalValue = 0;

        // TODO.1 가진 금액 중 구매할 수 있는 가치를 찾기
        for (int[] stock : stocks) {
            System.out.println(stock);
            int value = stock[0];
            int price = stock[1];

            // 경우의수를 도입해서 적당한 price 선택하기
            if (money >= price) {

            }
            totalValue += value;

        }

        return totalValue;
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
