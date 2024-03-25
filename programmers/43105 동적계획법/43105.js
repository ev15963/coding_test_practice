const triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]];

function solution(triangle) {
    var answer = 0;

    // todo 1. 경우의 수의 합을 나열하기
    // point. 7은 단일 길이라 제외하고 시작
    for (let i=1; i<triangle.length; i++) {
        for (let j=0; j<triangle[i].length; j++) {
            // 7에서 3이나 8로 이동
            console.log(triangle[i][j]);

            // sum += triangle[i];

            if(j==0) {
            // 시작 영역
                triangle[i][j] += triangle[i - 1][j];
                console.log(triangle[i][j], 'if');
            } else if(j==triangle[i].length-1) {
            // 끝  
                triangle[i][j] += triangle[i - 1][j - 1];
                console.log(triangle[i][j], 'elif');
            } else {
            // 중간 영역
                let max_num = Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                triangle[i][j] += max_num;
                console.log(triangle[i][j], 'else');
            }

        }
    }


    return answer;
}