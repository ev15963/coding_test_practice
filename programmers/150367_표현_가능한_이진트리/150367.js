/**
 * 표현 가능한 이진트리
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/150367
 * @param {const} numbers - 입출력 예
 * @returns {const}
 */

// TODO 3. 이진트리 설계하기 (재귀사용)
function check_tree(numbers) {
    // task 1. 만약 n의 길이가 1 이하이면 항상 참을 반환
    if(numbers.length <= 1)
        return true;
    // task 2. n을 가운데에서 나눠 두 부분으로 만듦
    const mid = Math.floor(numbers.length / 2);
    const sub = [numbers.slice(0, mid), numbers.slice(mid+1)];
    console.log(sub);
    // task 3. 만약 가운데 값이 '1'이면, 두 부분 모두가 check_tree 함수의 결과가 참이어야 함
    numbers;
    if (numbers[mid] == '1') 
        return sub.every(check_tree);
    // task 4. 만약 가운데 값이 '0'이면, 두 부분 중 어느 하나도 '1'을 포함하면 안 됨
    else
        // !+0 true, !+1 false
        return sub.every(numbers => !+numbers);
    
}

function solution(numbers) {
    // 더미노드 : 문자열 뒤에 0을 추가
    // 더미노드 아닐 시 : 문자열 뒤에 1추가
    // 문자열에 저장된 이진수를 십진수로 변환
    // 리프 노드가 아닌 노드는 자신의 왼쪽 자식이 루트인 서브트리의 노드들보다 오른쪽에 있고 자신의 오른쪽 자식이 루트인 서브트리의 노드들보다 왼쪽에 있다고 가정합니다.
    // 부연설명 : 노드 자체는 최대 2개
    // if(노드 != 리프 노드) 일 경우 이 기준으로 왼쪽 오른쪽 노드가 있다
    // 현재 노드 기준 왼쪽 노드에 있으면 얘가 기준
    // 오른쪽에 있는애로 배치가 되면 얘가 기준
    // 그 기준을 가지고 서브트리를 생성
    // 말그대로 자식들이 부모를 기준으로 배치를 어떻게 할것인가
    // TODO 1. 이진트리로 표현이 가능한 부분인지를 먼저 판별
    numbers
    // 0111010이 58이 되는 이유??
    // 6543210 2^5+2^4+2^3+2^1 = 32+16+8+2 = 58
    


    const binary_arr = [];
    for (let number of numbers) {
        // TODO 2. 이진수를 바꾸게 되면 그걸 기준으로 이진트리 생성

        // 이진트리로 표현된다 1, 안된다 0
        // 배열의 원소를 이진수로 표현
        // js 이진수 표현하기
        // let 십진수 = 125;
        // console.log(`1. 10진수(${십진수}) -> 2진수(${십진수.toString(2)})`); // 1111101
        // 출처 : https://ithub.tistory.com/290
        let binary = number.toString(2);
        console.log(binary);
        // 이진수로 변환된 값이 홀수 갯수라면 가운데 자리 구하고, 짝수 갯수라면 앞에 0붙여서 가운데 자리 구한다.
        // let test = 0;
        if (binary.length % 2 == 0) {
            // 3의 가운뎃값 2, 7의 가운뎃값 4를 구해야 함
            binary = binary.padStart(binary.length+1, "0");
        }
        binary
        const check_tree1 = check_tree(binary);
        console.log(check_tree1);

        // let median = Math.floor(binary.length / 2) + 1;
        // console.log(Number(binary[median-1]));
        // binary_arr.push(Number(binary[median-1]));
        binary_arr.push(check_tree1);
    }

    console.log(binary_arr);

    return binary_arr.map(Number);
}

const numbers = [63, 111, 95];//[7, 42, 5];
const ans = solution(numbers);
console.log(ans); // to be : [1, 1, 0]