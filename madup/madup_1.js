// 입력값 〉
// [100, 101, 102, 103, 104], [1, 2], [2, 4]
// 기댓값 〉
// [203, 309]
// 실행 결과 〉
// 실행한 결괏값 []이 기댓값 [203,309]과 다릅니다.

var numbers = [100, 101, 102, 103, 104];
var start = [1, 2];
var finish = [2, 4];

// 첫 번째 작업은 start[0]부터 finish[0] 구간의 숫자를
// 모두 더하는겁니다. start[0]은 1이고 finish[0]은 2
// 이므로 numbers의 1~2사이의 숫자를 모두 더하면
// 101 + 102 = 203이 됩니다.
console.log(numbers[start[0]], 'numbers');
console.log(numbers[[finish[0]]]);
console.log(start[0], 'numbers');



//console.log(ans_1);




//console.log(ans_2);


function solution(numbers, start, finish) {
    var answer = [];

    var ans_1 = numbers[start[0]] + numbers[[finish[0]]];
    var ans_2 = 0;

    for (var i = numbers[start[1]]; i <= numbers[finish[1]]; i++) {
        console.log(i, 'i');
        ans_2 += i;
    }

    answer.push(ans_1, ans_2);
    return answer;
}

console.log(solution(numbers, start, finish));


// 두 번째 작업은 start[1]부터 finish[1] 구간의 숫자를
// 모두 더하는 작업이므로 numbers의 2~4 사이의 숫
// 자를 모두 더하면 102 + 103 + 104 = 309가 됩니
// 다.


