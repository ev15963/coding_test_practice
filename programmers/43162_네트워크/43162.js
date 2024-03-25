const n = 3;
const computers = [[1, 1, 0], [1, 1, 0], [0, 0, 1]];

function DFS (n, computers, com, visited) {
    visited[com] = true;
    for (let i=0; i<computers.length; i++) {
        console.log(computers[i], 'computers[i]');
    }
}

function solution(n, computers) {
    var answer = 0;
    let visited = new Array();
    
    for (let i=0; i< computers.length; i++) {
        visited[i] = false
    }
    
    for(let i=0; i< computers.length; i++) {
        if (visited[i] == false) {
            answer ++;
            DFS (n, computers, i, visited);
        }
    }
    return answer;
}