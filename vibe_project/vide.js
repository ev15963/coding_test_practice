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