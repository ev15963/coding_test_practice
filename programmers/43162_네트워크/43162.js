// URL: https://velog.io/@longroadhome/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-LV.3-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC

const n = 3;
const computers = [
    [1, 1, 0],
    [1, 1, 0],
    [0, 0, 1],
];

function DFS(computers, node, visited) {
    console.log(node, "node");
    visited[node] = true;
    console.log(visited[node], `visited[${node}]`);
    for (let i = 0; i < computers.length; i++) {
        console.log("in");
        console.log(i, "i");
        // todo. 연결되는 노드가 있고 방문하지 않았다면 dfs로 진행
        console.log(computers[node][i], `computers[${node}][${i}]`);
        console.log(visited[i], `visited[${i}]`);
        
        if (computers[node][i] == 1 && !visited[i]) {
            console.log(computers[node][i], `computers[${node}][${i}]`);
            // console.log(!visited[i], '!visited[i]');
            // console.log(visited[i]==false, 'visited[i]==false');
            // console.log("in222");
            DFS(computers, i, visited);
        }
    }
}

function solution(n, computers) {
    var answer = 0;
    //console.log(n, "n");
    let visited = new Array();
    console.log(computers.length, "computers.length");
    for (let i = 0; i < n; i++) {
        visited[i] = false;
        console.log(visited[i], "visited[i]");
    }

    for (let i = 0; i < n; i++) {
        if (!visited[i]) {
            // console.log('computers', computers);
            console.log('i', i);
            console.log('visited', visited);
            DFS(computers, i, visited);
            answer++;
            console.log(answer, 'answer counting');
        }
    }
    return answer;
}

const ans = solution(n, computers);
console.log(ans, "ans");
