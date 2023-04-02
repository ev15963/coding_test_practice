// 5와 6의 차이

// 문제
// 상근이는 2863번에서 표를 너무 열심히 돌린 나머지 5와 6을 헷갈리기 시작했다.
// 상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는, 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.
// 두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다. 이때, 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 두 정수 A와 B가 주어진다. (1 <= A, B <= 1,000,000)
// 11 25

// 출력
// 첫째 줄에 상근이가 구할 수 있는 두 수의 합 중 최솟값과 최댓값을 출력한다.
// 36 37

let list = [11, 25];
let new_list ='';
let sum_new_list1 = 0;
let sum_new_list2 = 0;
let output = [];

function solution(list) {
	console.log(list);
	let dd = JSON.stringify(list);
	for (let d of dd) {
		console.log(d);
		if(d=='5') {
			d='6';
			console.log(d, 'if in');
		} else if(d=='6') {
			d='5';
		}
		new_list+=d;
		console.log(new_list, 'new_list');

	}
	console.log(new_list, 'dd');
	let new_list1 = JSON.parse(new_list);
	console.log(new_list1);
	
	for (let i =0; i < list.length; i++) {
		sum_new_list1+=list[i];
	}
	console.log(sum_new_list1, 'sum_new_list1');
	
	for (let i =0; i < new_list1.length; i++) {
		sum_new_list2+=new_list1[i];
	}
	console.log(sum_new_list2, 'sum_new_list2');
	
	if (sum_new_list1 < sum_new_list2) {
		output = [sum_new_list1, sum_new_list2];
	} else {
		output = [sum_new_list2, sum_new_list1];
	}
	console.log(output);
	return output;
}

const sol = solution(list);

console.log(sol);