/**
 * 3진법 뒤집기
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */

//  문제 설명
//  자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

//  제한사항
//  n은 1 이상 100,000,000 이하인 자연수입니다.

//  입출력  예
//  n	    result
//  45	    7
//  125	    229

//  입출력 예 설명

//  입출력 예 #1

//  답을 도출하는 과정은 다음과 같습니다.
//  n (10진법)	    n (3진법)	    앞뒤 반전(3진법)   	10진법으로 표현
//  45	            1200	        0021	            7
//  따라서 7을 return 해야 합니다.

//  입출력 예 #2

//  답을 도출하는 과정은 다음과 같습니다.
//  n (10진법)	n (3진법)	    앞뒤 반전(3진법)	10진법으로 표현
//  125	        11122	        22111	            229
//  따라서 229를 return 해야 합니다.


// javascipt 3진법
// 출처 : https://ryuhojin.tistory.com/20
// 10진수  -> 2진수( 3, 4, 5...N 진수)
// let decimal = 2022;
// //10진수 -> 2진수
// console.log(decimal.toString(2));
// //10진수 -> 3진수
// console.log(decimal.toString(3));
// //10진수 -> N진수
// console.log(decimal.toString(N));


// javascipt 역순으로 출력
// 출처 : https://lakelouise.tistory.com/145
// 📝 str.split('').reverse().join('')
// function reverse(str) {
//     let reverse = str.split('');
 
//     reverse = reverse.reverse();
 
//     return reverse.join('')
// }
 
// console.log(reverse("Hello")); // olleH
// split()은 지정해준 구분자로 나눠서 배열로 반환해준다.
// 그리고 reverse() 함수를 사용해서 배열을 역순으로 뒤집어준다.
// join()으로 하나의 문자열로 합쳐주면 끝!

// javascipt 3진법 (3진법 -> 10진법)
// 출처 : https://ryuhojin.tistory.com/20
// N진수 -> N진수
// //3진수 -> 2진수
// console.log(parseInt("21121",3).toString(2));

// 다른 분 답안
// URL : https://school.programmers.co.kr/learn/courses/30/lessons/68935/solution_groups?language=javascript

let decimal = 125;

function solution(decimal) {
    var answer = decimal.toString(3);
    console.log(answer);
    console.log(answer.split('').reverse('').join(''));
    var answer_reverse = answer.split('').reverse('').join('');
    var answer_10 = parseInt(answer_reverse, 3);
    return answer_10;
}

console.log(solution(decimal));