USE rentbookdb;
use footprintdb;
CREATE DATABASE imageDB;
select * from tb_snsPost;

-- 전체 데이터 중에서 5페이지에서 10개를 보고 싶다
-- 전체 데이터 중에서 1페이지에서 10개 : 0 ~ 9번까지 보여주기
-- 1페이지일 경우 시작값 1이 될려면 (Page - 1) * 10

-- 전체 데이터 중에서 2페이지에서 10개 : 10 ~ 19번까지
-- 2페이지 일경우 시작값이 10이 되려면 (Page - 1) * 10

-- 전체 데이터 중에서 3페이지에서 10개 : 20 ~ 29번까지
-- 3페이지 일경우 시작값이 10이 되려면 (Page - 1) * 10

-- 처음 시작에서 10개를 건너뛰고 : OFFSET 10
-- 그위치부터 10개를 SELECT 하라
SELECT * FROM tbl_books
ORDER BY B_CODE
LIMIT 10 OFFSET 1;


SELECT COUNT(*)
FROM tbl_books
WHERE b_name LIKE CONCAT('%','부자','%');