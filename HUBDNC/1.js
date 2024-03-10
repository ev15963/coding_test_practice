// [알고리즘] 문제 #1. 찍신 찾기
// { answer : 정답 번호 (1~5), score : number }로 이루어진 배열 arr이 정답지로 넘어갈 때,
// 가장 점수가 높은 수포자의 이름과 점수를 “이름 : 점수” 형태로 리턴해 주세요
// 시험 응시자는 1번으로 모두 찍은 a, 3번으로 모두 찍은 b, 5번으로 모두 찍은 c가 있습니다.

// 🚩 [입출력 예]

// [ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ] → a : 5
// [ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ] → a : 5, c : 5

// const arr = [ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ];
const arr = [ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ];

function solution(arr) {
    console.log(arr);
    // task 1. 배열 중 가장 score이 큰 값 찾기
    // const array1 = [1, 3, 2];
    // console.log(Math.max(...array1));
    // 참고 URL : https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Math/max
    const score_max = Math.max(...arr.map((v)=> v.score));
    console.log(score_max);
    // task 2. 큰 값을 비교해서 뽑기
    const score_max_arr = arr.filter((v)=> v.score == score_max);
    console.log(score_max_arr);

    // task 3. 시험 응시자는 answer 1 = a, 3 = b, 5 = c
    // push object
    // Json Data Push 방법

    // let data1 = {}; // object
    // let data2 = []; // array 

    // data1.test1 = "테스트1";
    // data1 >> {"test1" : "테스트1"}

    // data1["test2"] = "테스트2";
    // data1 >> {"test1" : "테스트1", "test2" : "테스트2"}

    // data2.push({"test3" : "테스트3"})
    // data2 >> [{"test3" : "테스트3"}]

    // data2.push(data1)
    // data2 >> [{"test3" : "테스트3"}, {"test1" : "테스트1", "test2" : "테스트2"}]

    // URL : https://grandj.tistory.com/244
    const answer = score_max_arr.map((v)=> {
        const arr_return = {};
        switch(v.answer) {
            case 1:
                arr_return['a'] = score_max;
                break;
            case 3:
                arr_return['b'] = score_max;
                break;
            case 5:
                arr_return['c'] = score_max;
                break;
            default:
                console.log('배열값이 없습니다.')
        }
        
        return arr_return;
    });
    console.log(answer);
    return answer;
}

const ans = solution(arr);
console.log(ans);
// to be : a : 5