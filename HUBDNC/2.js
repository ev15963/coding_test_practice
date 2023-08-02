// [알고리즘] 문제 #2. 최소 공배수의 합
// 양의 정수의 배열 arr이 주어질 때 모든 원소들이 둘 씩 짝지어 생기는 최소공배수를 합한 값을 리턴하는 solution 함수를 작성해주세요.

// 🚩 [제한사항]

// - arr 내 원소들은 중복되지 않습니다.
// - arr 배열의 길이는 최소 3입니다.
// - 입출력 예 : [ 1 , 2 , 3 ] → ( {1 | 2} → 2 + { 1 | 3 } → 3 + { 2 | 3 } → 6 ) = 11

const arr = [ 1 , 2 , 3 ];

function solution(arr) {
    // task 1. 모든 원소들을 짝 짓기
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            console.log(i, j);

        }
    }

    // task 2. 최대공약수, 최소공배수
    // 자바스크립트 최소공배수
    // const solutuon = (n, m) => {
    //     const gcd = (a, b) => {
    //       if (b === 0) return a; // 나누어지면 a 리턴
    //       return gcd(b, a % b); // 나누어지지 않는다면 b와 a%b를 다시 나눈다
    //     };
    //     const lcm = (a, b) => (a * b) / gcd(a, b); // 두 수의 곱을 최대공약수로 나눈다.
    //     return console.log(
    //       `최대 공약수는? ${gcd(n, m)}, 최대 공배수는? ${lcm(n, m)}`
    //     );
    //   };
    //   console.log(solutuon(6, 12));
    // 출처 URL : https://haerim95.tistory.com/36

    // 최소공배수 gcd
    const gcd = (a, b) => {
        console.log(a, b);
        if (b === 0) return a;
        return gcd(b, a % b);
    }
    console.log(gcd(12, 8));

    // 최대공약수 lcm = (a * b) / 최소공배수 gcd
    const lcm = (a, b) => {
        return (a * b) / gcd(12, 8);
    }
    console.log(lcm(12, 8));
    return answer;
}

const ans = solution(arr);
console.log(ans);
// to be : 11