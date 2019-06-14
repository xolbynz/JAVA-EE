book_member 테이블을 여기에 만드시오

drop table book_member;

CREATE TABLE BOOK_MEMBER(
ID VARCHAR2(50) PRIMARY KEY,  
PW VARCHAR2(50) NOT NULL, 
NICK VARCHAR2(50), 
EMAIL VARCHAR2(50), 
TEL VARCHAR2(50));

INSERT INTO BOOK_MEMBER VALUES ('admin', '123', 'admin', 'cc', 'cc');

