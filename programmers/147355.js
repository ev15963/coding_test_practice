/**
 * 크기가 작은 부분문자열
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */

// task 1 : list에 있는 숫자가 작거나 같을 경우
// task 1.1 : 기존 배열에서 반복문으로 변경
// task 2 : t의 값을 p의 길이로 순서대로 나타내기 
// task 2.1 : 문자열 다루기 // 문자열 트리밍 하기, 문자열 앞에서부터 잘라내기, 문자열 뒤에서 잘라내기, 문자열 중간에 잘라내기, 소문자-대문자 서로 변환하기, ..// 문자열 앞에서 부터 잘라내기
// task 3 : 각각의 substring을 반복문으로 만들기

// const t0 = t[0] + t[1] + t[2];

const t = "3141592";
const p = "271";

const plength = p.length;
const list = []; //


// const list = [314, 141, 415, 159, 592];
const t0 =Number (t.substring(0,plength))
console.log(t0);
list.push(t0);
console.log(list);
// list 빈값에 substring한 값을 추가
// const t0 = "314";
const t1 = Number (t.substring(1, plength+1));
console.log(t1);
list.push(t1);



const t2 = Number (t.substring(2, plength+2));
console.log(t2);
list.push(t2);

const t3 = Number (t.substring(3, plength+3));
console.log(t3);
list.push(t3);


const t4 = Number (t.substring(4, plength+4));
console.log(t4);
list.push(t4);
console.log(list);
const n = Number(p);

var num = 0;

for (var i = 0; i < list.length; i++) {
    if (n >= list[i]) {
        num++;
    }
}
console.log(num);