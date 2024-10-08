package tests_133213;

public class algorithms_17757 {
    public static boolean isValidAmount(String amountText) {
        // 금액이 0원일 때는 true 반환
        if (amountText.equals("0")) {
            return true;
        }

        // 옳은 금액인지 확인하기 위한 변수들 초기화
        int commaCount = 0;
        int digits = 0;
        System.out.println("========");
        System.out.println(amountText.length()); // 9 5 4
        // 옳은 금액인지 확인
        for (int i = amountText.length() - 1; i >= 0; i--) {
            char c = amountText.charAt(i);

            // 금액에 0~9 사이 숫자 또는 쉼표 포함
            if (!Character.isDigit(c) && c != ',') {
                return false;
            }

            // 가장 왼쪽 숫자가 0일 경우
            if (i == 0 && c == '0' && amountText.charAt(i + 1) != ',') {
                return false;
            }

            // 쉼표의 위치와 개수 체크
            if (c == ',') {
                commaCount++;
                // 쉼표 위치는 오른쪽 부터 시작해서 숫자 3개 단위 뒤 1개씩 나타나야함
                if (digits != 3 || commaCount == 0 || commaCount % 3 == 0) {
                    return false;
                }
                digits = 0;
            } else {
                digits++;
            }
        }

        // 마지막 세 자리가 쉼표로 끝나면 옳지 않은 금액임
        if (amountText.charAt(amountText.length() - 1) == ',') {
            return false;
        }

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
