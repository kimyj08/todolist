CREATE TABLE todolist(
	td_no		VARCHAR2(50)		primary key,  /* 투두번호 */
	td_content	VARCHAR2(2000)		not null, 	  /* 투두내용 */
	td_date		DATE	default		sysdate 	  /* 투두날짜 */
);

select * from TODOLIST order by td_no desc;

CREATE SEQUENCE td_seq /* 시퀀스 이름 td_seq */
INCREMENT BY 1		   /* 증감숫자 1 */
START WITH 1		   /* 시작숫자 1 */
MINVALUE 1			   /* 최소값 1 */
MAXVALUE 10000		   /* 최대값 1 */
NOCYCLE				   /* 순환하지 않음 */
NOCACHE				   /* 메모리에 시퀀스값 미리 할당 */
NOORDER;			   /* 요청 순서대로 값을 생성할지 여부 */

INSERT INTO TODOLIST (td_no, td_content) values (td_seq.NEXTVAL, '투두리스트 만들기');
INSERT INTO TODOLIST (td_no, td_content) values (td_seq.NEXTVAL, '꽃다발 예약하기');
INSERT INTO TODOLIST (td_no, td_content) values (td_seq.NEXTVAL, '식당 확인하기');

ALTER TABLE TODOLIST ADD complete VARCHAR2(2) default 'N' NOT NULL;
ALTER TABLE TODOLIST ADD user_id VARCHAR2(20);
ALTER TABLE TODOLIST ADD td_delete VARCHAR2(2) default '1';

/* 칼럼명 변경 */
ALTER TABLE TODOLIST RENAME COLUMN user_id TO user_seq;

/*
/* 외래키 지정 */
ALTER TABLE TODOLIST ADD CONSTRAINT FK_TUSERS_TO_TODOLIST
	FOREIGN KEY(seq) REFERENCES TUSERS(seq)
;
*/

UPDATE TODOLIST SET user_seq = 2 where td_no = 3;
UPDATE TODOLIST SET user_seq = 1 where td_no = 1 or td_no = 2;
UPDATE TODOLIST SET user_seq = 2 where td_no = 6;