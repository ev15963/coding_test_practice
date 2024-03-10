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

// task 3. O(log n)
// 이진 탐색 함수 (빅오 시간 복잡도: O(log n))
function binarySearch(arr, target) {
    let left = 0;
    let right = arr.length - 1;

    while (left <= right) {
        const mid = Math.floor((left + right) / 2);

        if (arr[mid] === target) {
                return mid;
        } else if (arr[mid] < target) {
                left = mid + 1;
        } else {
                right = mid - 1;
        }
    }

    return -1; // 찾지 못한 경우
}

// task 4. O(n2)
function O_quadratic_algorithm(n) {
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            // do something for 1 second
        }
    }
}

function another_O_quadratic_algorithm(n) {
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            for (let k = 0; k < n; k++) {
              // do something for 1 second
            }
        }
    }
}

// task 5. O(2n)
function fibonacci(n) {
    if (n <= 1) return 1;
    
    return fibonacci(n-1) + fibonacci(n-2);
}

// 시간복잡도 예시
// URL : https://hanamon.kr/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-time-complexity-%EC%8B%9C%EA%B0%84-%EB%B3%B5%EC%9E%A1%EB%8F%84/
// https://insight-bgh.tistory.com/505