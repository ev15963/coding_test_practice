// name : ["may", "kein", "kain", "radi"]
// yearning : [5, 10, 1, 3]
// photo : [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]
// result : [19, 15, 6]

/** 
 * 배열.reduce((누적값, 현잿값, 인덱스, 요소) => { return 결과 }, 초깃값);
 * acc : [ 'may', 'may', 'kon' ]
 * cur : 
*/
function solution(name, yearning, photo) {
    return photo.map((v)=> v.reduce((acc, cur, i)=> cur))
}

let name = ["may", "kein", "kain", "radi"];
let yearning = [5, 10, 1, 3];
let photo = [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]];
// tobe : let result = [19, 15, 6];

const ans = solution(name, yearning, photo);
console.log(ans);