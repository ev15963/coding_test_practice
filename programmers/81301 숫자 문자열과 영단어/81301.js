/**
 * 숫자 문자열과 영단어
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

const s = "1zerotwozero3";

function solution(s) {

    // 참고
    // let str = 'Hello world, Java';
    // str = str.replace('Java', 'JavaScript');
    // console.log(str);
    // Output: Hello world, JavaScript
    // URL : https://codechacha.com/ko/javascript-replace-in-string/


    // .replace(/seven/gi)
    // replace 정규표현식 gi는 무엇을 의미할까?
    // URL : https://webruden.tistory.com/980
    // https://school.programmers.co.kr/learn/courses/30/lessons/81301/solution_groups?language=javascript

    let num = s.replace(/zero/gi, 0).replace(/one/gi, 1).replace(/two/gi, 2).replace(/three/gi, 3).replace(/four/gi, 4).replace(/five/gi, 5).replace(/six/gi, 6).replace(/seven/gi, 7).replace(/eight/gi, 8).replace(/nine/gi, 9);
    console.log(num); // 10203
    return Number(num);
}

const ans = solution(s);
// to be : 1478
console.log(ans); //10203

// 