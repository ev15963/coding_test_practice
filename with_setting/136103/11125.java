import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(String[] tickets, int roll, String[][] shop, int money) {
        // 1. 티켓 이름 -> 가격으로 변환
        Map<String, Integer> ticketMap = new HashMap<>();
        
        for (String ticket : tickets) {
            String[] info = ticket.split(" ");
            ticketMap.put(info[0], Integer.parseInt(info[1]));
        }

        int n = shop.length;
        int maxGold = 0;

        // 2. 누적 상점, 누적 티켓 선언
        List<Map<String, Integer>> prefixSum = new ArrayList<>();
        Map<String, Integer> cumulative = new HashMap<>();

        // 3. 누적 상점 기반 티켓 갯수 세기
        for (int i = 0; i < n; i++) {
            Map<String, Integer> current = new HashMap<>(cumulative);
            for (String t : shop[i]) {
                current.put(t, current.getOrDefault(t, 0) + 1);
            }
            current.forEach((key, value) -> {	
            	System.out.println(key + " : " + value);	
            });
            cumulative = current;
        }

        // 4. prefixSum 값을 이용해 최선의 갯수 구하기
        for (int i = 0; i < n; i++) {
            prefixSum.get(i);
        }
        
        int budget = money;
        
        // roll 가격 빼고 prefixSum 3개 이상 중 가격 낮은 순으로 정렬
        for (int i = 0; i < prefixSum.size(); i++) {
            int rollCost = roll * i;

            if (budget < rollCost) continue;

            int balance = budget - rollCost; // 잔액
            
            Map<String, Integer> prefixSumOne = prefixSum.get(i);
            List<String> keySet = new ArrayList<>(prefixSumOne.keySet());
            keySet.sort(Comparator.comparingInt(ticketMap::get));

            // 가격기준 오름차순으로 된 keySet 저렴한 티켓 구하기
            int copyRollCost = balance;
            int goldCount = 0;
            
            for (String key : keySet) {
                int cost = ticketMap.get(key);
                int count = prefixSumOne.get(key);

                // 최대 구매량 : 잔액에서 나눈 금액이 갖고 있는 수량을 비교해서 적은 수량
                int maxBuyQuantity = Math.min(copyRollCost / cost, count);

                copyRollCost -= maxBuyQuantity * cost;

                // 구매할 수 있는 수량을 goldCount에 추가
                goldCount = maxBuyQuantity;

            }
            maxGold = Math.max(goldCount, maxGold);
        }
        return maxGold;
    }
    public static void main(String[] args) {
        // to be 2;
        String[] tickets = {"A 1", "B 2", "C 5", "D 3"};
        int roll = 10;
        String[][] shop = {{"B", "C", "B", "C"}, {"A", "A", "A", "B"}, {"D", "D", "C", "D"}};
        int money = 30;
        
        System.out.println(solution(tickets, roll, shop, money));
    }
}
