/**
 * 크기가 작은 부분문자열
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */

// task 1 : list에 있는 숫자가 작거나 같을 경우
// task 1.1 : 기존 배열에서 반복문으로 변경
const t = "3141592";
const p = "271";
const list = [314, 141, 415, 159, 592];

const n = Number(p);
var num = 0;

for (var i = 0; i < list.length; i++) {
    if (n >= list[i]) {
        num++;
    }
}
console.log(num);