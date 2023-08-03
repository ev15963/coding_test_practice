// [알고리즘] 문제 #8.
// 순열 (permutation)의 개수를 구하는 코드를 작성해 주세요.

// 🚩 [제한사항]

// - 모든 데이터는 null 값이 허용되지 않습니다.

// task 1. 팩토리얼 함수 구하기
const n = 5;

function factorial(n) {
    if (n == 1) return 1;
    return n * factorial(n-1);
}

const ans = factorial(n);
console.log(ans);