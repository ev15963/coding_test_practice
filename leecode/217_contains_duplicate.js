// 중복된 값이 존재할 경우 true, 중복된 값이 없으면 false를 반환하는 문제
// 정렬 후 이전값과 비교해서 같은 값이면 true를 return 하도록 했다.
// 시간 복잡도는 O(n)이다.
// 정렬은 퀵소트로 이루어진 Arrays.sort 메서드를 사용했다 [O(NlogN)]

// JAVA 예시
// Set<Integer> duplicate = new HashSet<>();

// for (int num : nums) {
//     if (duplicate.contains(num)) {
//         return true;
//     }
//     duplicate.add(num);
// }
// return false;
