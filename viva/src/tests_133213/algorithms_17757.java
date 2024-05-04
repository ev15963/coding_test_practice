package tests_133213;

public class algorithms_17757 {
    public static boolean isValidAmount(String amountText) {

        return true;
    }

    public static void main(String[] args) {
        // 테스트
        System.out.println(isValidAmount("25,000,123")); // true
        System.out.println(isValidAmount("24,999,99")); // false
        System.out.println(isValidAmount("39900")); // true
        System.out.println(isValidAmount("0")); // true
        System.out.println(isValidAmount("0100")); // false
    }
}
