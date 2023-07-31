/**
 * 실패율
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42889
 */

// ans : https://school.programmers.co.kr/learn/courses/30/lessons/42889/solution_groups?language=javascript

const N = 5;
const stages = [2, 1, 2, 6, 2, 4, 3, 3];
// task 1. 스테이지 실패율 구하기
function solution(N, stages) {
    console.log(stages);
    let fail_arr = [];
    for (let i=1; i<N+1; i++) {
        let fail_rate = stages.filter((v)=> v===i).length;
        let fail_rate2 = stages.filter((v)=> v>=i).length;
        fail_arr.push(fail_rate / fail_rate2);
        // console.log(fail_rate2);
    }
    console.log(fail_arr);

    var answer = [];
    return answer;
}

const ans = solution(N, stages);
console.log(ans);
// to be [3,4,2,1,5]