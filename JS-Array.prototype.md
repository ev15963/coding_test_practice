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
  Array.prototype.at() : 정숫값을 받아 해당 인덱스에 있는 항목을 반환 양수 음수 가능
  Array.prototype.concat() : 두 개 이상의 배열을 병합하는 데 사용. 이 메서드는 기존 배열을 변경하지 않고, 새 배열을 반환
  Array.prototype.copyWithin() : 배열의 일부를 같은 배열의 다른 위치로 얕게 복사하며, 배열의 길이를 수정하지 않고 해당 배열을 반환
  ex) copyWithin(target, start, end)
      const array1 = ['a', 'b', 'c', 'd', 'e'];
      console.log(array1.copyWithin(0, 2, 4));
      // Expected output: Array ["d", "b", "c", "d", "e"]
  Array.prototype.entries() : 배열의 각 인덱스에 대한 키/값 쌍을 포함하는 새 배열 반복자 객체를 반환
  ex) const array1 = ['a', 'b', 'c'];
      const iterator1 = array1.entries();
      console.log(iterator1.next().value);
      // Expected output: Array [0, "a"]
      console.log(iterator1.next().value);
      // Expected output: Array [1, "b"]
      console.log(iterator1.next().value);
      // Expected output: Array [2, "c"]
      console.log(iterator1.next().value);
      // Expected output: undefined
  Array.prototype.every() : 배열의 모든 요소가 제공된 함수로 구현된 테스트를 통과하는지 테스트. 이 메서드는 불리언 값을 반환.
  ex) const array1 = [1, 30, 39, 29, 10, 13];
      console.log(array1.every((currentValue) => currentValue < 40));
      // Expected output: true
  Array.prototype.fill() : 배열의 인덱스 범위 내에 있는 모든 요소를 정적 값으로 변경. 그리고 수정된 배열을 반환.
  ex) const array1 = [1, 2, 3, 4];
      // 0으로 채움 2번째 인덱스 부터 4번째 미만까지 채우기
      console.log(array1.fill(0, 2, 4));
      // Expected output: Array [1, 2, 0, 0]
      console.log(array1.fill(6));
      // Expected output: Array [6, 6, 6, 6]
  Array.prototype.filter() :  주어진 배열의 일부에 대한 얕은 복사본을 생성하고, 주어진 배열에서 제공된 함수에 의해 구현된 테스트를 통과한 요소로만 필터링. 현재 처리하는 요소가 참인 요소가 true 인것만 모아서 새로운 배열을 만든다. 출처 : https://soft91.tistory.com/84
  ex) const words = ['spray', 'elite', 'exuberant', 'destruction', 'present'];
      const result = words.filter((word) => word.length > 6);
      console.log(result);
      // Expected output: Array ["exuberant", "destruction", "present"]
  Array.prototype.find() : 제공된 배열에서 제공된 테스트 함수를 만족하는 `첫 번째 요소`를 반환합니다. 테스트 함수를 만족하는 값이 없으면 undefined가 반환. 순회하면서 조건에 해당되는 값을 먼저 찾은 원소를 반환.
  ex) const array1 = [5, 12, 8, 130, 44];
      const found = array1.find((element) => element > 10);
      console.log(found);
      // Expected output: 12
  Array.prototype.findIndex() : 주어진 판별 함수를 만족하는 배열의 `첫 번째 요소`에 대한 인덱스를 반환. 만족하는 요소가 없으면 -1을 반환.
  ex) const array1 = [5, 12, 8, 130, 44];
      const isLargeNumber = (element) => element > 13;
      console.log(array1.findIndex(isLargeNumber));
      // Expected output: 3
  Array.prototype.findLast() : 배열을 역순으로 순회하며 제공된 테스트 함수를 만족하는 첫 번째 요소의 값을 반환합니다. 테스트 함수를 만족하는 요소가 없으면 undefined가 반환.
  ex) const array1 = [5, 12, 50, 130, 44];
      const found = array1.findLast((element) => element > 45);
      console.log(found);
      // Expected output: 130
  Array.prototype.findLastIndex() : 배열을 역순으로 순회하며 주어진 판별 함수를 만족하는 만족하는 배열의 첫번째 요소의 인덱스를 반환. 만족하는 요소가 없으면 -1을 반환.
  ex) const array1 = [5, 12, 50, 130, 44];
      const isLargeNumber = (element) => element > 45;
      console.log(array1.findLastIndex(isLargeNumber));
      // Expected output: 3
      // Index of element with value: 130
  Array.prototype.flat() : 모든 하위 배열 요소가 지정된 깊이까지 재귀적으로 연결된 새 배열을 생성.
  ex) const arr1 = [0, 1, 2, [3, 4]];
      console.log(arr1.flat());
      // expected output: Array [0, 1, 2, 3, 4]
      console.log(arr2.flat(Infinity));
      // expected output: Array [0, 1, 2, 3, 4, 5]
      arr1.flat(depth) : depth default는 1
  Array.prototype.flatMap() : 배열의 각 요소에 주어진 콜백 함수를 적용한 다음 그 결과를 한 단계씩 평탄화하여 형성된 새 배열을 반환.  map() 뒤에 깊이 1의 flat()을 붙이는 것(arr.map(...args).flat())과 동일하지만, 두 메서드를 따로 호출하는 것보다 약간 더 효율적. (flat + map)
  Array.prototype.forEach() : 각 배열 요소에 대해 제공된 함수를 한 번씩 실행.
  ex) const array1 = ['a', 'b', 'c'];
      array1.forEach((element) => console.log(element));
      // Expected output: "a"
      // Expected output: "b"
      // Expected output: "c"
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
