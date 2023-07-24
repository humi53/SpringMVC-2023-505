-- RentBook root 접속
CREATE DATABASE rentBookDB;
USE rentBookDB;

CREATE TABLE tbl_books (
b_code	VARCHAR(13)		PRIMARY KEY,
b_name	VARCHAR(125)	NOT NULL,	
b_auther	VARCHAR(125)	NOT NULL,
b_comp	VARCHAR(125),		
b_year	INT	NOT NULL,	
b_iprice	INT,	
b_rprice	INT	NOT NULL	
);
DESC tbl_books;
DROP TABLE tbl_books;
SHOW TABLES;


INSERT INTO tbl_books(
b_code,
b_name,
b_auther,
b_comp,
b_year,
b_iprice,
b_rprice
) VALUES (
	'001','자바야 놀자', '야놀자', '놀자출판', 2010, 20000, 2000
);
SELECT * FROM tbl_books;