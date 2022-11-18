// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

const A = [4,2,5,8,7,3,7];
// console.log(A);
console.log(A);
function solution(A) {
    // write your code in JavaScript (Node.js 14)
    // 합이 짝수인경우
    const arr = [];
    for (let i = 0; i < A.length; i=i+2) {
        console.log( A.slice(i, i + 1), 'dfdd');
        arr.push(A.slice(i, i + 2));
        if (arr[i].length == 2) {
            if ((arr[0][0] + arr[0][1]) % 2 == 0) {
                console.log('dd');
            }
            
        }
    }
    console.log(arr, 'arr');
    //     if ((A[i] + A[i+1])%2==0) {
    //         console.log(A[i], A[i+1]);
    //     } else {
            
    //     }

    // }
}

solution(A);
