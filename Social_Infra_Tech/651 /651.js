const matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/fill
function solution(matrix) {
    const resultMatrix = [];

    // task 1. 빈 배열 만들기
    const numRows = matrix.length;
    const numCols = matrix[0].length;

    console.log(numRows);
    console.log(numCols);

    const rowSums = Array(numRows).fill(0);
    const colSums = Array(numCols).fill(0);
    
    console.log(rowSums);
    console.log(colSums);
    
    // task 2.  열과 합 계산 rowSums: 열의 값 합, colSums: 행의 값 합
    for (let i = 0; i < numRows; i++) {
        for (let j = 0; j < numCols; j++) {
            console.log(i);
            console.log(j);
            console.log(matrix[i][j]);
            rowSums[i] += matrix[i][j];
            console.log(rowSums[i]);
            colSums[j] += matrix[i][j];
            console.log(colSums[j]);
        }
    }
    console.log(rowSums);
    console.log(colSums);
    console.log(resultMatrix);

    // task 3. 새로운 행렬 생성
    const newMatrix = [];
    for (let i = 0; i < numRows; i++) {
        const newRow = [];
        for (let j = 0; j < numCols; j++) {
            newRow.push(rowSums[i] + colSums[j] - matrix[i][j])
        }
        newMatrix.push(newRow);
    }

    return newMatrix;
}

const ans = solution(matrix);
console.log(ans);
// to be : [[17, 19, 21], [23, 25, 27], [29, 31, 33]]