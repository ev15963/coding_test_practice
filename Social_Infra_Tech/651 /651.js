const matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/fill
function solution(matrix) {
    const resultMatrix = [];

    // task 1. 빈 배열 만들기
    const numRows = matrix.length;
    const numCols = matrix[0].length;

    const rowSums = Array(numRows).fill(0);
    const colSums = Array(numCols).fill(0);
    
    console.log(rowSums);
    console.log(colSums);
    
    

    // for (let i = 0; i < matrix.length; i++) {
    // const row = [];
    //     for (let j = 0; j < matrix[i].length; j++) {
    //         row.push(matrix[i][j]);
    //     }
    //     resultMatrix.push(row);
    // }
    // console.log(resultMatrix)

    var answer = [[]];

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
    console.log('Hello Javascript')

    return answer;
}

const ans = solution(matrix);
console.log(ans);
// to be : [[17, 19, 21], [23, 25, 27], [29, 31, 33]]