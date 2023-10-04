CREATE TABLE tusers(
	seq			VARCHAR2(20)	primary key,
	id			VARCHAR2(20)	unique not null,
	password	VARCHAR2(20),
	name		VARCHAR2(20)
);

CREATE sequence tusers_seq
increment by 1
start with 1
minvalue 1
maxvalue 10000
nocycle
nocache
noorder;

INSERT INTO tusers VALUES(tusers_seq.NEXTVAL, 'hongkd', '1234', '홍길동');

SELECT * FROM tusers;
