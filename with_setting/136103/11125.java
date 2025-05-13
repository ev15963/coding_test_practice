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
        System.out.println(ticketMap.get("A"));

        // 2. 0 ~ n-1 회 새로고침 가능한 경우의 수를 시도 == 최대 roll 구하기
        int maxGetTicket = 0;
        for (int i = 0; i < shop.length; i++) {
            money -= roll * i;
            if (money < 0) {
                continue;
            }
            int maxRoll = i;
            System.out.println("maxRoll: "+maxRoll);
            System.out.println(money);
            System.out.println(Arrays.toString(shop[i]));

            // 0 ~ maxRoll 까지 상점 순회
            for (int j = 0; j <= maxRoll; j++) {
                System.out.println(shop[maxRoll][j]);
                System.out.println("ticketMap.get(shop[j])"+ticketMap.get(shop[maxRoll][j]));
            }
        }
        
        return 0;
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
