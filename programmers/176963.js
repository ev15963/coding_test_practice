// name : ["may", "kein", "kain", "radi"]
// yearning : [5, 10, 1, 3]
// photo : [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]
// result : [19, 15, 6]


function solution(name, yearning, photo) {
    return photo.map((v)=> v.reduce((a, c)=> a += yearning[name.indexOf(c)]))
}

let name = ["may", "kein", "kain", "radi"];
let yearning = [5, 10, 1, 3];
let photo = [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]];
let result = [19, 15, 6];

const ans = solution(name, yearning, photo);
console.log(ans);