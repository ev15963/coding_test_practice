/**
 * 추억 점수
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */

// name : ["may", "kein", "kain", "radi"]
// yearning : [5, 10, 1, 3]
// photo : [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]
// result : [19, 15, 6]

/** 
 * 배열.reduce((누적값, 현잿값, 인덱스, 요소) => { return 결과 }, 초깃값);
 * acc : [ 'may', 'may', 'kon' ]
 * cur : 
 * 참고 URL : https://www.zerocho.com/category/JavaScript/post/5acafb05f24445001b8d796d#google_vignette
 * 참고 URL : https://school.programmers.co.kr/learn/courses/30/lessons/176963/solution_groups?language=javascript
 * 참고 URL : https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce
 * reduce 안 에서는 indexOf로 name에서 해당 사람의 인덱스를 가져온 후, 
 * yearning에 데이터로 가져옮 
 * 다만 점수 데이터가 없으면 undefined가 반환되므로 0으로 처리 
 * 그걸 합산해서 반환
 * 배열.reduce((누적값, 현잿값, 인덱스, 요소) => { return 결과 }, 초깃값);
 * result = [1, 2, 3].reduce((acc, cur, i) => {
 * console.log(acc, cur, i);
 * return acc + cur;
 * }, 0);
*/
function solution(name, yearning, photo) {
    return photo.map((v)=> v.reduce((acc, cur)=> acc += yearning[name.indexOf(cur)] ?? 0, 0));
}

let name = ["may", "kein", "kain", "radi"];
let yearning = [5, 10, 1, 3];
let photo = [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]];
// tobe : let result = [19, 15, 6];

const ans = solution(name, yearning, photo);
console.log(ans);