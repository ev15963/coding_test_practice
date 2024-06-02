function solution(tickets, roll, shop, money) {
  // 티켓 정보 초기화 (티켓 정보 분리)
  const ticketPrices = {};
  for (const ticket of tickets) {
    const [name, price] = ticket.split(" ");
    ticketPrices[name] = Number(price);
    console.log(ticketPrices[name], "ticketPrices[name]");
    console.log(ticketPrices, "ticketPrices"); // { A: 1, B: 2, C: 5, D: 3 }
  }

  // 각 상점 상태에서 구매 시뮬레이션
  let maxGoldenTickets = 0;

  for (let shopRow = 0; shopRow <= shop.length - 1; shopRow++) {
    console.log(shopRow, "shopRow");
    console.log(money, "money");
    console.log(roll, "roll");
    let currentMoney = money - shopRow * roll;
    if (currentMoney < 0) {
      break;
    }

    // 상품 진열 순회
    const ticketCount = {};
    for (let i = 0; i <= shopRow; i++) {
      for (const ticket of shop[i]) {
        console.log(!ticketCount[ticket], `!ticketCount[${ticket}]`);
        if (!ticketCount[ticket]) {
          ticketCount[ticket] = 0;
        }
        ticketCount[ticket]++;
      }
    }
    console.log(ticketCount, "ticketCount");

    // 티켓 구매
    for (let i = 0; i <= shopRow; i++) {
      for (const ticket of shop[i]) {
        const price = ticketPrices[ticket];
        console.log(price, "price");
        while (currentMoney >= price && ticketCount[ticket] > 0) {
          currentMoney -= price;
          ticketCount[ticket]--;
          console.log(
            !ticketCount[ticket + "_purchased"],
            `!ticketCount[${ticket} + "_purchased"]`
          );
          if (!ticketCount[ticket + "_purchased"]) {
            ticketCount[ticket + "_purchased"] = 0;
          }
          ticketCount[ticket + "_purchased"]++;
        }
      }
    }
    console.log(ticketCount, "ticketCount2");

    // 황금 티켓 계산
    let goldenTickets = 0;
    for (const key in ticketCount) {
      console.log(key, "key");
      if (key.endsWith("_purchased")) {
        const count = ticketCount[key];
        goldenTickets += Math.floor(count / 3);
      }
    }
    console.log(goldenTickets, "goldenTickets");
    maxGoldenTickets = Math.max(maxGoldenTickets, goldenTickets);
  }

  return maxGoldenTickets;
}

// 테스트 케이스
const tickets1 = ["A 1", "B 2", "C 5", "D 3"]; // 일반 티켓의 종류
const roll1 = 10; // 상점 새로고침 비용
const shop1 = [
  ["B", "C", "B", "C"], // 2+5+2+5 = 14
  ["A", "A", "A", "B"], // 1+1+1+2 = 5
  ["D", "D", "C", "D"], // 3+3+5+3 = 14
]; // 상점의 티켓 진열 예측
const money1 = 30; //주어진 자금
console.log(solution(tickets1, roll1, shop1, money1)); // 출력: 2 // 모을 수 있는 황금 티켓 개수의 최댓값

const tickets2 = ["A 1", "B 2", "C 5", "D 3"];
const roll2 = 10;
const shop2 = [
  ["B", "C", "B", "C"],
  ["A", "A", "A", "B"],
  ["D", "D", "C", "D"],
];
const money2 = 100;
console.log(solution(tickets2, roll2, shop2, money2)); // 출력: 4
