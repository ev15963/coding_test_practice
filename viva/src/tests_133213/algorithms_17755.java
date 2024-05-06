package tests_133213;

import java.lang.Math;

public class algorithms_17755 {

    /**
     * @param {long} orderAmount 주문금액
     * @param {long} taxFreeAmount 비과세금액
     * @param {long} serviceFee 봉사료
     */
    public static long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
        // orderAmount : 주문금액
        // taxFreeAmount : 비과세금액
        // serviceFee : 봉사료

        // TODO 3. 공급가액 + 부가가치세 = 공급대가, 봉사료가 없는 공급대가는 주문금액과 같다.
        long supplyPrice = orderAmount - serviceFee;
        // TODO 2. 과세금액은 공급가액에서 비과세 금액을 차감
        long taxOverAmount = supplyPrice - taxFreeAmount;
        // TODO 1. 부가가체세는 과세금액의 10% 소숫점 첫재짜리에서 올림처리
        long vat = (long) Math.ceil(taxOverAmount * 0.1);
        // TODO 4. 공급대가 - 비과세금액 = 1원이면 부가가치세는 0원처리
        if (supplyPrice - taxFreeAmount == 1) {
            vat = 0;
        }

        return vat;
    }

    public static void main(String[] args) {
        long orderAmount = 100000;
        long taxFreeAmount = 20000;
        long serviceFee = 3000;
        long answer = solution(orderAmount, taxFreeAmount, serviceFee);
        System.out.println("부가가치세: " + answer);
    }
}
