//[알고리즘] 문제 #3. 소수의 합
// 양의 정수인 a값이 주어질 때 1부터 a값 이하에 존재하는 모든 소수의 합을 리턴하는
// solution 함수를 작성해주세요.

// 🚩 [제한사항]

// - 소수란 1과 자기 자신으로만 나눠지는 수 입니다. ( 1인 소수가 아닙니다. )
// - a는 최소 4부터 주어집니다.
// 🚩 [입출력 예]

// a : 5 → 10
// a : 10 → 17
// a : 30 → 129

const a = 5;

// task 1. 소수 판별하기
// function isPrime(N) {
//     // 1은 소수가 아니다.
//     if (N === 1) return false;
//     // 2부터 N제곱근까지의 수로 N을 나눴을 때
//     for (let i = 2; i <= Math.sqrt(N); i++) {
//       // 나누어 떨어지는 경우가 한 번이라도 있으면 N은 소수가 아니다.
//       if (N % i === 0) return false;
//     }
//     // 모두 나누어 떨어지지 않으면 N은 소수이다.
//     return true;
//   }
function isPrime(num) {
    if (num < 2) return false;
    for (let i=2; i<= Math.sqrt(num); i++) {
        console.log(Math.sqrt(num));
        if (num % i === 0) return false;
    }
    return true;
}

function solution(a) {
    if (a < 4) throw new Error('소수의 값이 최솟값이 아닙니다.');
    console.log(a);

    // task 2. 2부터 a까지 소수의 합
    let primeSum = 0;

    for (let i = 2; i <= a; i++) {
        if (isPrime(i)) {
            primeSum += i;
        }
    }

    return primeSum;
}
const ans = solution(a);
console.log(ans);

// to be : 10