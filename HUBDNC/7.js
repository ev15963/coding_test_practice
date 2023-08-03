// [알고리즘] 문제 #7.
// 시간 복잡도를 빅오로 표현할 수 있는 코드를 작성해 주세요.

// 🚩 [제한사항]

// - 모든 데이터는 null 값이 허용되지 않습니다.

// task 1. O(1)
function O_1_algorithm(arr, index) {
    return arr[index];
}

let arr = [1, 2, 3, 4, 5];
let index = 1;
let result = O_1_algorithm(arr, index);

console.log(result); // 2

// task 2. O(n)
function O_n_algorithm(n) {
    for (let i = 0; i < n; i++) {
      // do something for 1 second
    }
}

function another_O_n_algorithm(n) {
    for (let i = 0; i < 2n; i++) {
      // do something for 1 second
    }
}
