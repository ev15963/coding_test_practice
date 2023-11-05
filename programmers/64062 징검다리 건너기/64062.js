/**
 * 징검다리 건너기
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/64062
 */

// stone : 디딤돌의 건널 수 있는 허용 수
// k : 디딤돌의 최대 칸 수
// result : 징검다리를 건널 수 있는 인원 수

function solution(stones, k) {
    // TODO 1. 이진 탐색 트리로 진행
    // Math.max(...array) : https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Math/max
    // Math.max(값0, 값1, ... , 값N)
    
    let left = 1;
    let right = Math.max(...stones);
    console.log(right, 'right');  // 5

    // TODO 2. 디딤돌 배열 순회
    // 주어진 mid 값을 사용하여 디딤돌 배열을 순회
    // consecutiveZeros 변수를 사용하여 연속적인 0 값의 개수를 추적
    // maxZeros 변수를 사용하여 가장 큰 연속적인 0 값의 개수를 기록
    while(left <= right) {
        let mid = Math.floor((left + right) / 2);
        console.log(mid); // 3
        let consecutiveZeros = 0;
        let maxZeros = 0;

    // TODO 3. 0 값 개수 확인
    // 각 디딤돌을 검사하면서 디딤돌의 값이 mid보다 작으면 consecutiveZeros를 증가.
    // 그렇지 않으면 maxZeros를 갱신하고 consecutiveZeros를 0으로 재설정
        for (const stone of stones) {
            console.log(stone, 'stone');
            if (stone < mid) {
                consecutiveZeros++;
            } else {
                maxZeros = Math.max(maxZeros, consecutiveZeros);
                consecutiveZeros = 0; 
            }
        }
        console.log(maxZeros, 'maxZeros');
        console.log(consecutiveZeros, 'consecutiveZeros');
        maxZeros = Math.max(maxZeros, consecutiveZeros);

    // TODO 4. k 값과 비교
    // maxZeros 값이 k 이상인 경우, right를 mid - 1로 업데이트하여 가능한 더 작은 mid 값으로 이진 탐색 범위를 조정
    // 그렇지 않으면 left를 mid + 1로 업데이트하여 mid 값을 키우고 다시 이진 탐색
    if(maxZeros >= k) {
        right = mid - 1;
    } else {
        left = mid + 1;
    }

    // TODO 5. 최종 결과
    // 이진 탐색 루프가 완료되면 left 값이 최대 친구 수를 나타냄
    // 이 값을 반환
        return left;
    }
}

const stones = [2, 4, 5, 3, 2, 1, 4, 2, 5, 1];
const k = 3

const ans = solution(stones, k);
console.log(ans);
// to be : 3