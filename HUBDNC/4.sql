-- [SQL] 문제 #4. 등급 매기기
-- 허브대학교 1학년 1학기 코딩테스트 점수가 모두 채점되어 아래 DataBase Table에 Insert 되어있습니다.


-- 이 때 , A등급은 90점 이상 , B등급은 80점 이상 , C등급은 70점 이상 , D등급은 60점 이상 
-- 이 외 모든 점수는 F등급으로 매겨질 때, 학생의 이름과 등급을 가져오는 SQL문을 작성해주세요.

-- 🚩 [제한사항]

-- - 단 , 결석 회수가 4회 이상인 학생은 무조건 F등급입니다.
-- - 모든 데이터는 null 값이 허용되지 않습니다.
-- - 코딩테스트 점수 테이블
-- 🚩 [테이블]

-- name(이름)	    score(성적)	    absent(결석회수)
-- 홍길동	        95	            1
-- 춘향이	        72	            0
-- 심청이	        85  	        3
-- 심봉사   	    90	            4
-- 콩쥐	            65	            0
-- 팥쥐	            52	            1

-- Active: 1691127560355@@127.0.0.1@3306@HUBDNC
CREATE TABLE problem1(  
    `id` int(6) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '',
    `name` VARCHAR(30) NOT NULL COMMENT '이름', 
    `score` int(6) NOT NULL COMMENT '성적',  
    `absent` int(6) COMMENT '결석횟수'
) COMMENT '문제1';

INSERT INTO `problem1` (`name`, `score`, `absent`) VALUES ('홍길동', 95, 1); 
INSERT INTO `problem1` (`name`, `score`, `absent`) VALUES ('춘향이', 72, 0); 
INSERT INTO `problem1` (`name`, `score`, `absent`) VALUES ('심청이', 85, 3); 
INSERT INTO `problem1` (`name`, `score`, `absent`) VALUES ('심봉사', 90, 4); 
INSERT INTO `problem1` (`name`, `score`, `absent`) VALUES ('콩쥐', 65, 0); 
INSERT INTO `problem1` (`name`, `score`, `absent`) VALUES ('팥쥐', 52, 1); 

select 
    name as '이름', 
    CASE 
        WHEN score >= 90 THEN 'A등급' 
        WHEN score >= 80 THEN 'B등급' 
        WHEN score >= 70 THEN 'C등급' 
        WHEN score >= 60 THEN 'D등급' 
        ELSE 'F등급' 
    END as '등급'
from problem1;