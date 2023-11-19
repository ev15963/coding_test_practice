/**
 * 표 병합
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/150366
 */

const commands = 'UPDATE 1 1 menu';
function solution(commands) {
    // TODO 1. 50x50 크기의 표 null로 초기화
    const table = new Array(50).fill(null).map(() => new Array(50).fill(null));
    table;

    // TODO 2. 특정 셀이 속한 그래프의 루트를 찾는 함수
    function findRoot(r, c) {
        if (table[r][c] === null) return [r, c];
    }
    // const test = findRoot(r, c);
    // test;
    // TODO 3. 두 셀을 병합하는 함수
    function mergeCells(r1, c1, r2, c2) {
    }

    // TODO 4. 특정 셀의 병합을 해제하는 함수
    function unmergeCell(r, c) {
    }

    let [action, ...args] = commands.split(' ');
    console.log(action);
    console.log(...args);

    switch (action) {
        case 'UPDATE':
            table
            let value 
            return value
        break;

        case 'MERGE':
        break;

        case 'UNMERGE':
        break;

        case 'PRINT':
        break;
    }

    return action;

    // const answer = [];


}

const ans = solution(commands);
console.log(ans);
// to be : (1,1)에 "menu" 입력