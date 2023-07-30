/**
 * 숫자 문자열과 영단어
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

const s = "one4seveneight";

function solution(s) {

    // 참고
    // let str = 'Hello world, Java';
    // str = str.replace('Java', 'JavaScript');
    // console.log(str);
    // Output: Hello world, JavaScript
    // URL : https://codechacha.com/ko/javascript-replace-in-string/
    
    let num = s.replace('zero', 0).replace('one', 1).replace('two', 2).replace('three', 3).replace('four', 4).replace('five', 5).replace('six', 6).replace('seven', 7).replace('eight', 8).replace('nine', 9);
    console.log(num);
    return num;
}

const ans = solution(s);
// to be : 1478
console.log(ans);
