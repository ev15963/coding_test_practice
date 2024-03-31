const n = 6;
const times = [7, 10];

function solution(n, times) {
    var answer = 0;
    
    let left = 0;
    let right = times.length - 1;
    
    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        
        // TODO 1. 탐색값을 찾으면 멈춤
        // TODO 2. 탐색값 < 중앙값 -> 끝점 갱신
        // TODO 3. 중앙값 > 탐색값 -> 시작점 갱신
        if (times[mid] == n) {
            answer += mid;
            console.log(n, 'n');
            break;
        } else if (n < times[mid]) {
            right = mid - 1;
        } else if (n > times[mid]) {
            left = mid + 1;
        }
        
        
    }

    return answer;
}

const ans = solution(n, times);

console.log(ans, 'ans');
// to be 28