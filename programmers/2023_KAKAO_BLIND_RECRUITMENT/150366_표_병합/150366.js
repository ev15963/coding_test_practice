/**
 * 표 병합
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/150366
 */

const commands = 'UNMERGE 2 2';
function solution(commands) {
    // TODO 1. 50x50 크기의 표 null로 초기화
    const table = new Array(50).fill(null).map(() => new Array(50).fill(null));
    table;

    // TODO 2. 특정 셀이 속한 그래프의 루트를 찾는 함수
    function findRoot(r, c) {
        r;
        c;
        console.log(table[r][c]);
        if (table[r][c] === null) {
            console.log(table[r][c], 'herereee');
            // console.log([r, c]);
            return [r, c];
        }
        console.log('dddd');
        console.log(...table[r][c]);
        // const [rootR, rootC] = findRoot(...table[r][c]);
        rootR;
        rootC;
        table[r][c] = [rootR, rootC];
        console.log(table[r][c]);
        return [rootR, rootC];
    }
    // const test = findRoot(r, c);
    // test;
    // TODO 3. 두 셀을 병합하는 함수
    function mergeCells(r1, r2, c1, c2) {
        const [root1R, root1C] = findRoot(r1, c1);
        const [root2R, root2C] = findRoot(r2, c2);
        console.log(root1R, 'root1R');

        if(root1R !== root2R || root1C !== root2C) {
            table[root1R][root1C] = table[root2R][root2C];
            console.log(table[root1R][root1C], 'table[root1R][root1C]');
            console.log(table, 'table');
        }
    }

    // TODO 4. 특정 셀의 병합을 해제하는 함수
    function unmergeCell(r, c) {
        const [rootR, rootC] = findRoot(r,c);
        for (let i=0; i< 50; i++) {
            for (let j=0; j< 50; j++) {
                if (findRoot(i, j)[0] === rootR && findRoot(i, j)[1] === rootC) {
                    table[i][j] = null;
                }
            }
        }
    }

    const answer = [];
    let output ='';
    for (const command of commands) {

        let [action, ...args] = commands.split(' ');
        console.log(action);
        console.log(...args);


        switch (action) {
            case 'UPDATE':
                table
                let [r, c, value] = args;
                let positionR = Number(r);
                let positonC = Number(c);
                positionR;
                positonC;
                value;
                
                table[r-1][c-1] = null;
                table[r-1][c-1] = value;
                output = table[r-1][c-1];
                break;

            case 'MERGE':
                let [r1, r2, c1, c2] = args.map(Number);
                output = mergeCells(r1-1, r2-1, c1-1, c2-1);
                
                break;

            case 'UNMERGE':
                const [ur, uc] = args.map(Number);
                ur;
                uc;
                output = unmergeCell(ur-1, uc-1);
                break;

            case 'PRINT':
                let [pr, pc] = args.map(Number);
                pr;
                pc;
                const [rootR, rootC] = findRoot(pr-1, pc-1);
                console.log(rootR, 'rootR');
                console.log(rootC, 'rootC');
                // 출력 시 null이면 EMPTY
                if(table[rootR][rootC] == null) {
                    table[rootR][rootC] = 'EMPTY';
                }
                table[rootR][rootC];
                console.log(table[rootR][rootC]);
                table;
                rootR;
                rootC;
                output = table[rootR][rootC];
                
                return output;
            default:
                break;
        }
        return null;
    
    }

    answer.push(output);


}

const ans = solution(commands);
console.log(ans);
// to be : (1,1)에 "menu" 입력