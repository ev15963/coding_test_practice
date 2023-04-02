// 거스름 돈
//input : pay, list
//
let pay = 1260; //거슬러줘야할돈
let count = 0;
let list = [500, 100, 50, 10];

// console.log('dfdfd');
function solution(pay, count, list) {
	console.log(list);
	for (let coin of list) {
		
		//몫을 count하면서 잔돈 개수 카운트
		count += parseInt(pay / coin);
		console.log(count, 'count');
		pay %= coin
		console.log(pay, 'pay');
	}
	console.log(count);
};

solution(pay, count, list);