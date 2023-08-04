const converter = require("xml-js");

console.log('hello world');

let test = `<?xml version="1.0" encoding="UTF-8"?>

<shop city="서울" type="마트">

    <food>

        <name>귤</name>

        <sort>과일</sort>

        <cost>3000</cost>

    </food>

    <food>

        <name>상추</name>

        <sort>야채</sort>

        <cost>2000</cost>

    </food>

</shop>

`;

console.log(test);

// 분석하기 (분석하는 라이브러리 필요)

console.log(converter);

const ans = converter.xml2json(test);

console.log(ans);
console.log(typeof ans);
// string으로 된 json을 js object로 바꾸는 함수? json.parse();
const ans2 = JSON.parse(ans);
// ans2의 타입 알기
console.log(typeof ans2); // to be.
// console.log
// task 3. shop에 있는 첫번째 food의 name 가져오기
// before
// const task3 = ans.elements[0].type;
// const task3 = ans.elements[0].elements[0].elements[0].elements[0].text;
// const task3 = ans.elements;
// console.log(task3);