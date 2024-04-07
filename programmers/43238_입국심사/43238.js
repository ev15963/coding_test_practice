const n = 6;
const times = [10, 7];
function solution(n, times) {
    // 함수를 넣어주면 숫자 순서대로 정렬
    // https://velog.io/@ansrjsdn/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-level3-%EC%9E%85%EA%B5%AD%EC%8B%AC%EC%82%AC
    times.sort((a, b) => a - b);
    let left = 1;
    let right = n * times[times.length -  1];
    var answer = right;
    console.log(right);
    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        console.log(mid, 'mid');
        let people = 0;
        times

        for (let i = 0; i < times.length; i++) {
            let value = times[i];
            people += Math.floor(mid / value); // 한 사람당 몇명 할 수 있는지
            people;
            if (people >= n) {
                console.log(people, n)
                answer = Math.min(mid, answer); // 최솟값
                break;
            };
        }

        if (people >= n) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        
    }

    return answer;
}

const ans = solution(n, times);

console.log(ans, 'ans');
// to be 28