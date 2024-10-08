-- [SQL] 문제 #5. 부서별 최근 공지사항
-- 아래 테이블은 A 회사의 공지사항 테이블입니다.
-- 이 테이블에서 부서별 최신 공지사항의 제목, 조회수, 게시일을 가져오는 SQL문을 작성해주세요.

-- 🚩 [제한사항]

-- - 모든 데이터는 null 값이 허용되지 않습니다.
-- 🚩 [테이블]

-- idx (고유번호)	title (제목)	                notice_dept (부서)	post_date (게시일)	view_count (조회수)
-- 1	            개발팀 전체 공지	            개발팀	            2023-01-05 00:00:00	205
-- 2	            기획팀 전체 공지	            기획팀	            2023-01-20 00:00:00	98
-- 3	            디자인팀 공유 사이트 공지	    디자인팀	        2023-01-29 00:00:00	150
-- 4	            회계팀 Q 컨퍼런스 정리 공지	    회게팀	            2023-02-05 00:00:00	135
-- 5	            개발팀 Y 프로젝트 미팅 공지	    개발팀	            2023-02-06 00:00:00	86
-- 6	            디자인팀 X 프로젝트 미팅 공지	디자인팀	        2023-02-06 00:00:00	52

CREATE TABLE problem2(  
    `idx` int(6) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '고유번호',
    `title` VARCHAR(30) NOT NULL COMMENT '제목', 
    `notice_dept` VARCHAR(6) NOT NULL COMMENT '부서',  
    `post_date` DATETIME NOT NULL COMMENT '게시일', 
    `view_count` int(6) NOT NULL COMMENT '조회수'
) COMMENT '문제2';

INSERT INTO `problem2` (`title`, `notice_dept`, `post_date`, `view_count`) VALUES
('개발팀 전체 공지', '개발팀', '2023-01-05 00:00:00', 205),
('기획팀 전체 공지', '기획팀', '2023-01-20 00:00:00', 98),
('디자인팀 공유 사이트 공지', '디자인팀', '2023-01-29 00:00:00', 150),
('회계팀 Q 컨퍼런스 정리 공지', '회계팀', '2023-02-05 00:00:00', 135),
('개발팀 Y 프로젝트 미팅 공지', '개발팀', '2023-02-06 00:00:00', 86),
('디자인팀 X 프로젝트 미팅 공지', '디자인팀', '2023-02-06 00:00:00', 52);

-- task 1. 제목, 조회수, 게시일 가져오는 테이블 쿼리
SELECT title, view_count, post_date 
from problem2;

-- task 2. 부서별 최신 공지사항
select notice_dept, max(post_date) from problem2 GROUP BY notice_dept;

-- task 3. 합치기
SELECT title, view_count, post_date 
from problem2
where post_date in (select max(post_date) from problem2 GROUP BY notice_dept);
