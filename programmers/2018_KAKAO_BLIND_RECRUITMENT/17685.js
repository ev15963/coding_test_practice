//https://school.programmers.co.kr/learn/courses/30/lessons/17685/solution_groups?language=javascript

function solution(words) {
  var sortedWords = words.sort();
  return sortedWords.reduce((acc, word, idx, arr) => {
  var res = 1;
    if (idx > 0) {
        console.log('if (idx > 0) in');
        for (var i=0; i<word.length; i++) {
            if (word[i] !== arr[idx-1][i]) {
                i++;
                break;
            }
        }
        console.log(res, i, 'res', 'i');
        res = Math.max(res, i);
    }
    if (idx+1 < arr.length) {
        for (var i=0; i<word.length; i++) {
            if (word[i] !== arr[idx+1][i]) {
                i++;
                break;
            }
        }
        res = Math.max(res, i);
    }
    return acc + res;
  }, 0);
}
