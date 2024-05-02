package tests_133213;

public class algorithms_17771 {
    public static void main(String[] args) {
        // 입력 문자열 s
        String s = "111999333";
        String s1 = "000";
        String s2 = "123456789";

        System.out.println("answer");

        // findCoolNumber 메소드 호출하여 결과 출력
        System.out.println(findCoolNumber(s));
        System.out.println(findCoolNumber(s1));
        System.out.println(findCoolNumber(s2));
    }

    // 가장 큰 멋쟁이 숫자를 찾는 메소드
    public static int findCoolNumber(String s) {
        // -1로 초기화하기
        int coolNumber = -1;

        for (int i = 0; i < s.length() - 2; i++) {
            // 현 위치에서 세자리 추출
            String threeNumber = s.substring(i, i + 3);

            if (threeNumber.charAt(0) == threeNumber.charAt(1) && threeNumber.charAt(1) == threeNumber.charAt(2)) {
                if (Integer.parseInt(threeNumber) > coolNumber) {
                    coolNumber = Integer.parseInt(threeNumber);
                }
            }
        }

        return coolNumber = coolNumber == 000 ? 0 : coolNumber;

    }
}
