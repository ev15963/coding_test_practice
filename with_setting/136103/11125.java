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

        ticketMap.forEach((key, value) -> {	
            System.out.println(key + " : " + value);	
        });
        Set<String> keySet = ticketMap.keySet();
        
        System.out.println("--------------");
        
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
            System.out.println("=================");
            prefixSum.add(current);
            System.out.println(prefixSum); // [{B=2, C=2}, {A=3, B=3, C=2}, {A=3, B=3, C=3, D=3}]
            cumulative = current;
        }

        // 4. prefixSum 값을 이용해 최선의 갯수 구하기
        for (int i = 0; i < n; i++) {
            prefixSum.get(i);
        }
        System.out.println("prefixSum.get(0) : "+prefixSum.get(0));

        
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
