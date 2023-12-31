-- RentBook root 접속
CREATE DATABASE rentBookDB;
USE rentBookDb;
CREATE TABLE tbl_books (
	B_CODE	VARCHAR(13)	NOT NULL	PRIMARY KEY,
	B_NAME	VARCHAR(125)	NOT NULL,	
	B_AUTHER	VARCHAR(125)	NOT NULL,	
	B_COMP	VARCHAR(125),		
	B_YEAR	INT	NOT NULL,	
	B_IPRICE	INT,		
	B_RPRICE	INT	NOT NULL	
);
DESC tbl_books;
DROP TABLE tbl_books;
SHOW TABLES;
DESC tbl_books;

INSERT INTO tbl_books(
	B_CODE,B_NAME,B_AUTHER,B_COMP,B_YEAR,B_IPRICE,B_RPRICE
) VALUES (
	'001','자바야 놀자','야놀자','놀자출판',2010,20000,2000
);
SELECT * FROM tbl_books;
USE rentbookDB;
CREATE TABLE tbl_members (
	M_CODE	VARCHAR(6)	NOT NULL	PRIMARY KEY,
	M_NAME	VARCHAR(125)	NOT NULL,	
	M_TEL	VARCHAR(15)	NOT NULL,	
	M_ADDR	VARCHAR(125)		
);

SELECT COUNT(*) FROM tbl_books;
SELECT * FROM tbl_books LIMIT 10;
SELECT COUNT(*) FROM tbl_members;

CREATE TABLE tbl_rent_book(
	rent_seq	BIGINT		PRIMARY KEY	AUTO_INCREMENT,
	rent_date	VARCHAR(10)	NOT NULL,		
	rent_return_date	VARCHAR(10)	NOT NULL,		
	rent_bcode	VARCHAR(13)	NOT NULL,		
	rent_mcode	VARCHAR(6)	NOT NULL,		
	rent_return_yn	VARCHAR(1),			
	rent_point	INT,			
	rent_price	INT			
);
SELECT * FROM tbl_rent_book R
LEFT JOIN tbl_members M
	ON R.rent_mcode = M.m_code
LEFT JOIN tbl_books B
	ON R.rent_bcode = B.b_code;


