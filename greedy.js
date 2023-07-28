var office = [[1,0,0,0], [0,0,0,1], [0,0,1,0], [0,1,1,0]];
var k = 2;
console.log(office.length, 'd')
function solution(office, k) {

    var k_sol = ()=> {
        for (var i = 0; i < k; i++) {
            for (var j = 0; j < k; j++) {
                console.log('ddd');
                sum += office[i][j];
                console.log(sum, 'sum');
            }
        }
    
    }
    console.log(k_sol(), 'k');

    for (var i = 0; i < office.length; i++) {
        for (var j = 0; j < office[i].length; j++){
           // console.log(office[i][j]);
       // console.log('ddd');
            k_sol();
            console.log(k_sol(), 'k_sol');
        }
    }
    var sum = 0;

    // var answer = office[k - 1][k - 1];
    var answer = sum;
    // office[i][j];
    // var answer = -1;
    return answer;
}

console.log(solution(office, k), 'console');