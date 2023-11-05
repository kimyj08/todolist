# todolist
투두리스트와 로그인/로그아웃 기능이 구현된 토이프로젝트 입니다.

(프로젝트 로고나 이미지 넣기)

---

#### 프로젝트 정보
- 개발기간 : 2023.09 ~ 2023.10
- 배포 주소 :
- 개발 팀원 소개

#### 프로젝트 소개
토이프로젝트로 개인 프로젝트 입니다.
주 서비스는 투두리스트 이며, 로그인/로그아웃 기능을 추가로 구현하였습니다.
##### 개발 투두리스트
[ DB ]
- [x] 테이블 생성
- [x] 최소 필요 칼럼 생성
- [x] 임의 데이터 insert
- [x] '달성/완료' 기능을 위해 칼럼 추가하기
- [x] 시퀀스 적용
- [ ] 날짜 칼럼 추가하기
- [x] 로그인/로그아웃을 위한 새 테이블 생성

[ 기능 ]
- [x] 투두리스트 CRUD 구현
- [x] 로그인/로그아웃 구현
- [x] 회원가입 구현
- [ ] UPDATE에 API 적용해보기 : 수정에서 PATCH 사용해보기
- [x] 검색기능 구현
- [ ] 검색을 "날짜" 기준으로 검색할 수 있도록 적용해보기
- [ ] 투두리스트 달성/완료 기능 구현
- [ ] 예외처리(에러처리) 구현
- [ ] '날짜' 형식 지정해서 변형해보기
- [ ] '날짜' 형식 변형한 것으로 디데이 구현 : 덧셈, 뺄셈 연산 가능하도록 구현
- [ ] 투두리스트 삭제 처리 구현
- [x] 투두리스트 수정 처리 구현
- [ ] 프로젝트 완성 후 배포해보기

---

#### 시작 가이드
(1) 요구 사항(프로젝트 설정 내용)
- JAVA version : 11
- Spring version : 5.2.22
- RDMBS : Oracle Database 사용 - Oracle version : 11(xe)
- Web Module : 4.0

--- Maven ---
- Servlet-api : 4.0.1
- ojdbc6 : 11.2.0.4
- AspectJ Weaver : 1.9.7
- Spring JDBC : 5.2.22 RELEASE
- Commons DBCD : 1.4
- MyBatis : 3.5.6
- MyBatis Spring : 2.0.6

#### 기술 스택
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">

<img src="https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"> <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">

#### 화면 구성
구현한 화면 캡쳐 넣기

#### 주요 기능
프로젝트의 주요 기능 소개

#### 아키텍쳐
프로젝트의 아키텍쳐와 디렉토리 구조에 대해 작성.
디렉토리의 구조는 tree를 이용하여 그려주기.

---

## commit message convention
### commit type
- feat : 새로운 기능 추가
- fix : 버그 수정
- docs : 문서 수정
- style : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
- refactor : 코드 리펙토링
- test : 테스트 코드, 리펙토링 테스트 코드 추가
- chore : 빌드 업무 수정, 패키지 매니저 수정

---

#### 기타 추가 사항들
부족한 점, 개선하고 싶은 점 등 프로젝트 진행 시 느낀 점 정리해서 적어두기.
