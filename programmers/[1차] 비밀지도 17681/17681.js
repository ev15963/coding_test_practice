/**
 * 비밀지도
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/17681
 */

// task 1. 지도 1, 지도 2를 비교해서
// task 1.1. 어느 하나라도 벽은 전체 지도에서 벽
// task 1.2. 모두 공백인 부분은 전체 지도에서 공백
// task 2. 벽 = 1, 공백 부분 = 0 부호화

// 참고
// 자바스크립트 2진수 변환 길이
// let N = 7;
// let padding = '00000000';
// let result = N.toString(2).padStart(8, '0');
// URL : https://chinsun9.github.io/2020/11/17/js-%EC%9D%B4%EC%A7%84%EC%88%98-%EC%95%9E%EC%97%90-0%EB%84%A3%EA%B8%B0/
const n = 5;
const arr1 = [9, 20, 28, 18, 11];
const arr2 = [30, 1, 21, 17, 28];

function solution(n, arr1, arr2) {
    console.log(n);
    let a = arr1.map((v) => v.toString(2).padStart(5, '0'));
    console.log(a);
    
    let b = arr2.map((v) => v.toString(2).padStart(5, '0'));
    console.log(b);
    
    console.log(a[0][0]);

    // 
    // 자바스크립트 배열 끼리 값 더하기
    // 내가 생각한거 
    // for (let i; i<n; i++) {
    //     for (let j; j<n; j++) {
    //         if (a[i][j] + b[i][j] >= 1) {
    //             a[i][j] = 1;
    //         } else {
    //             a[i][j] = 0;
    //         }
    //         console.log(a);
    //     }
    // }

    // - Array.prototype.map() 메서드 사용
    //   arrA.map((x, y) => x + arrB[y]); // [6, 8, 10, 12,]
    let a_new = a.map((v,i)=> String(Number(v)+Number(b[i])));
    console.log(a_new);

    // 출력값으로 바꾸기
    //for (let i of a_new) {
    //    console.log(i);
    //}
    let b_new = a_new.map((v)=> v.split('0').join(' ').split('1').join('#').split('2').join('#'));
    console.log(b_new);

    let answer = [];
    return answer;
}
const ans = solution(n, arr1, arr2);

//to be : ["#####","# # #", "### #", "# ##","#####"]
console.log(ans);