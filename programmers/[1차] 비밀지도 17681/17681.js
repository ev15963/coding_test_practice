/**
 * 비밀지도
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/17681
 */

// task 1. 지도 1, 지도 2를 비교해서
// task 1.1. 어느 하나라도 벽은 전체 지도에서 벽
// task 1.2. 모두 공백인 부분은 전체 지도에서 공백
// task 2. 벽 = 1, 공백 부분 = 0 부호화
const n = 5;
const arr1 = [9, 20, 28, 18, 11];
const arr2 = [30, 1, 21, 17, 28];

function solution(n, arr1, arr2) {
    console.log(n);
    var a = arr1.map((v) => v.toString(2));
    console.log(a);
    
    var b = arr2.map((v) => v.toString(2));
    console.log(b);
    
    var answer = [];
    return answer;
}
const ans = solution(n, arr1, arr2);

//to be : ["#####","# # #", "### #", "# ##","#####"]
console.log(ans);