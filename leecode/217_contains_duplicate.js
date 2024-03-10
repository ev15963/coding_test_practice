// 중복된 값이 존재할 경우 true, 중복된 값이 없으면 false를 반환하는 문제
// 정렬 후 이전값과 비교해서 같은 값이면 true를 return 하도록 했다.
// 시간 복잡도는 O(n)이다.
// 정렬은 퀵소트로 이루어진 Arrays.sort 메서드를 사용했다 [O(NlogN)]

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true


// Example 2:

// Input: nums = [1,2,3,4]
// Output: false


// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true


// JAVA 예시
// Set<Integer> duplicate = new HashSet<>();

// for (int num : nums) {
//     if (duplicate.contains(num)) {
//         return true;
//     }
//     duplicate.add(num);
// }
// return false;

// TODO 1 자바스크립트로 set 사용
// URL : https://www.daleseo.com/js-set/
// const set = new Set();
// const numSet = new Set([1, 2, 3]);

function solution() {

    const duplicate = new Set();

    const nums = [1, 2, 3, 1];

    for (let i = 0; i < nums.length; i++) {
        if (duplicate.has(nums[i])) {
            
            return true;
        }
        duplicate.add(nums[i]);
        duplicate;
    };

    return false;
}

const ans = solution();

console.log(ans);