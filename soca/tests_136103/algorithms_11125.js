function solution(tickets, roll, shop, money) {
  // 티켓 정보 초기화 (티켓 정보 분리)
  const ticketPrices = {};
  for (const ticket of tickets) {
    const [name, price] = ticket.split(" ");
    ticketPrices[name] = Number(price);
    console.log(ticketPrices[name], "ticketPrices[name]");
    console.log(ticketPrices, "ticketPrices"); // { A: 1, B: 2, C: 5, D: 3 }
  }

  // 각 상점 상태에서 구매 과정
  let maxGoldenTickets = 0;
  let currentMoney = 0;
  for (let count = 0; count < shop.length - 1; count++) {
    currentMoney = money - count * roll;
  }

  return currentMoney;
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
