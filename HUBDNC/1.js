// [알고리즘] 문제 #1. 찍신 찾기
// { answer : 정답 번호 (1~5), score : number }로 이루어진 배열 arr이 정답지로 넘어갈 때,
// 가장 점수가 높은 수포자의 이름과 점수를 “이름 : 점수” 형태로 리턴해 주세요
// 시험 응시자는 1번으로 모두 찍은 a, 3번으로 모두 찍은 b, 5번으로 모두 찍은 c가 있습니다.

// 🚩 [입출력 예]

// [ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ] → a : 5
// [ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ] → a : 5, c : 5

// const arr = [ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ];
const arr = [ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ];

function solution(arr) {
    console.log(arr);
    // task 1. 시험 응시자는 answer 1 = a, 3 = b, 5 = c
    // task 1.1. 배열 중 가장 score이 큰 값 찾기
    const score_max = Math.max(...arr.map((v)=> v.score));
    console.log(score_max);
    // task 1.2. 큰 값을 비교해서 뽑기


    return answer;
}

const ans = solution(arr);
console.log(ans);
// to be : a : 5