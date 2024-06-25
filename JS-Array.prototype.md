표준 내장 객체
  Array
생성자
  Array() 생성자 : 새로운 Array 객체를 생성할 때 사용
  ex) new Array()
정적 메서드
  Array.from() : 순회 가능 또는 유사 배열 객체에서 얕게 복사된 새로운 Array 인스턴스를 생성
  ex) console.log(Array.from('foo'));
      // Expected output: Array ["f", "o", "o"]
      console.log(Array.from([1, 2, 3], (x) => x + x));
      // Expected output: Array [2, 4, 6]
  Array.fromAsync() 
  Array.isArray() : 전달된 값이 Array인지 판단
  Array.of() : 인자의 수나 유형에 관계없이 가변 인자를 갖는 새 Array 인스턴스 생
정적 속성
  Array[@@species]
인스턴스 메서드
  Array.prototype[@@iterator]()
  Array.prototype.at()
  Array.prototype.concat()
  Array.prototype.copyWithin()
  Array.prototype.entries()
  Array.prototype.every()
  Array.prototype.fill()
  Array.prototype.filter()
  Array.prototype.find()
  Array.prototype.findIndex()
  Array.prototype.findLast()
  Array.prototype.findLastIndex()
  Array.prototype.flat()
  Array.prototype.flatMap()
  Array.prototype.forEach()
  Array.prototype.includes()
  Array.prototype.indexOf()
  Array.prototype.join()
  Array.prototype.keys()
  Array.prototype.lastIndexOf()
  Array.prototype.map()
  Array.prototype.pop()
  Array.prototype.push()
  Array.prototype.reduce()
  Array.prototype.reduceRight()
  Array.prototype.reverse()
  Array.prototype.shift()
  Array.prototype.slice()
  Array.prototype.some()
  Array.prototype.sort()
  Array.prototype.splice()
  Array.prototype.toLocaleString()
  Array.prototype.toReversed()
  Array.prototype.toSorted()
  Array.prototype.toSpliced()
  Array.prototype.toString()
  Array.prototype.unshift()
  Array.prototype.values()
  Array.prototype.with()
인스턴스 속성
  Array.prototype[@@unscopables]
  Array.length
