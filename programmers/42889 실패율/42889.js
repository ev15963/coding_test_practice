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
        fail_arr.push([i, fail_rate / fail_rate2]);
        // console.log(fail_rate2);
    }
    console.log(fail_arr);

    // task 2. 정렬
    // URL : https://hianna.tistory.com/409
    // https://carrotweb.tistory.com/185/
    //    숫자 배열 정렬

    // const number = [1, 5, 10, 15, 20, 25, 100];

    // 오름차순 정렬(Ascending Order, ASC)
    // number.sort(function(comp1, comp2) {
    // 	return comp1 - comp2; 
    // });

    // console.log(number);
    // --> [1, 5, 10, 15, 20, 25, 100]

    // 내림차순 정렬(Descending Order, DESC)
    // number.sort(function(comp1, comp2) {
    // 	return comp2 - comp1; 
    // });

    // console.log(number);
    // --> [100, 25, 20, 15, 10, 5, 1]
    let fail_arr_sort = fail_arr.sort((a, b)=> b[1] - a[1]);
    console.log(fail_arr_sort);
    return fail_arr_sort.map((v)=> v[0]);
}

const ans = solution(N, stages);
console.log(ans);
// to be [3,4,2,1,5]