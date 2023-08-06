-- [SQL] 문제 #9.
-- 수많은 공룡들이 화산을 피해 도망을 가고 있었습니다.
-- 단 한 마리의 공룡을 제외하고는 모든 공룡들이 동굴로 피신을 했습니다.
-- 동굴로 이동했던 공룡들의 이름이 담긴 배열 participant와 안전하게 피신온 공룡들의 이름이 담긴 배열 completion이 주어질 때, 피신을 오지 -- 못한 공룡의 이름을 return 하도록 코드를 작성해 주세요.

-- 🚩 [제한사항]

-- - 동굴로 피신하는 공룡들의 수는 1명 이상 100,000명 이하입니다.
-- - 공룡의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
-- - 공룡 중에는 같은 종이 있을 수 있습니다.
-- 🚩 [테이블]

-- participant	                                                            completion	                        return
-- [’트리케라톱스’, ‘티라노사우루스’, ‘바리오닉스’]	                            [’바리오닉스’, ‘티라노사우루스’]	‘트리케라톱스’
-- [’티라노사우루스’, ‘파키케팔로사우루스’, ‘티라노사우루스’, ‘스테고사우루스’]	    [’파키케팔로사우루스,‘스테고사우루스’, ‘티라노사우루스’’]	‘티라노사우루스’

CREATE TABLE problem3(  
    `idx` int(6) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '고유번호',
    `participant` VARCHAR(60) NOT NULL COMMENT '동굴로 이동했던 공룡들의 이름이 담긴 배열', 
    `completion` VARCHAR(6) NOT NULL COMMENT '안전하게 피신온 공룡들의 이름이 담긴 배열'
) COMMENT '문제3';

INSERT INTO `problem3` (`participant`, `completion`) VALUES 
('[’트리케라톱스’, ‘티라노사우루스’, ‘바리오닉스’]', '[’바리오닉스’, ‘티라노사우루스’]'), 
('[’티라노사우루스’, ‘파키케팔로사우루스’, ‘티라노사우루스’, ‘스테고사우루스’]', '[’파키케팔로사우루스,‘스테고사우루스’, ‘티라노사우루스’’]');

-- task 0. varchar(60)에서 json으로 변경하기
-- task 0.1. json용 컬럼 생성 및 기존 컬럼에서 업데이트
ALTER TABLE problem3	ADD COLUMN participant_json JSON NOT NULL COMMENT '동굴로 이동했던 공룡들의 이름이 담긴 배열';

UPDATE problem3
SET participant_json = JSON_OBJECT('key', participant);

ALTER TABLE problem3 ADD COLUMN completion_json JSON NOT NULL COMMENT '안전하게 피신온 공룡들의 이름이 담긴 배열';

UPDATE problem3
SET  completion_json = JSON_OBJECT('key',  completion);

-- task 0.2. 기존 컬럼 삭제
ALTER TABLE problem3
DROP COLUMN participant;

ALTER TABLE problem3
DROP COLUMN completion;

-- task 0.3. 이름 바꾸기
ALTER TABLE problem3 
	CHANGE participant_json participant json NOT NULL COMMENT '동굴로 이동했던 공룡들의 이름이 담긴 배열';

ALTER TABLE problem3 
	CHANGE completion_json completion json NOT NULL COMMENT '안전하게 피신온 공룡들의 이름이 담긴 배열';

-- task 1. ‘트리케라톱스’
select participant from problem3 WHERE idx = '1';

-- task 2. ‘티라노사우루스’

SELECT participant
FROM problem3
WHERE completion is null;


SELECT name
FROM problem3
LEFT JOIN problem3 ON problem3 = completion
WHERE completion IS NULL;

-- array 배열 중 하나만 뽑아보기
-- select * from tblDataTest where `data`->"$.id" = 1;
SELECT participant FROM problem3 where `participant`->"$[0]"= JSON_QUOTE('트리케라톱스') LIMIT 1;

SELECT * from problem3;
SELECT *, `participant`->"$[1]" FROM problem3;
-- json_extract(jsoncol, '$.a') = "A";
-- "트리케라톱스"
SELECT JSON_UNQUOTE(JSON_EXTRACT(participant, '$.key[0]')) FROM problem3;

SELECT JSON_UNQUOTE(JSON_EXTRACT('{"key": "['트리케라톱스', '티라노사우루스', '바리오닉스']"}', '$.key[0]'));

SELECT JSON_EXTRACT('{"key": ["트리케라톱스", "티라노사우루스", "바리오닉스"]}', '$.key[0]');
SELECT JSON_EXTRACT('["트리케라톱스", "티라노사우루스", "바리오닉스"]', '$[1]');

-- JSON_EXTRACT 존재하면 원소 출력
SELECT *, JSON_EXTRACT(participant, '$[0]') FROM problem3;

SELECT JSON_EXTRACT(completion) FROM problem3
WHERE JSON_CONTAINS(completion, '파키케팔로사우루스', '$.key[0]');

-- JSON_REMOVE 사용법
SELECT 
  JSON_REMOVE('["트리케라톱스", "티라노사우루스", "바리오닉스"]', "$[0]", "$[1]") AS `return`; -- 결과: '트리케라톱스'
SELECT * FROM problem3;

-- JSON_SEARCH 사용법
SELECT JSON_SEARCH(participant, 'all', '바리오닉스') from problem3; -- "$[2]"

-- JSON_CONTAINS 사용법
SELECT JSON_CONTAINS('["트리케라톱스", "티라노사우루스", "바리오닉스"]', '["바리오닉스"]');
