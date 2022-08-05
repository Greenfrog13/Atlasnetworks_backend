# 8.5(금) Notion

- [x]  일학습병행 일지 작성하기
- [x]  회사 이메일 계정으로 깃허브 가입하기

- [x]  <실전! 스프링 데이터 JPA> 인프런 강의보고 코드 작성
- [x]  스프링부트와 AWS로 혼자 구현하는 웹 서비스 & 스프링부트 웹 서비스 만들기 공부 및 예제 작성

+

- [x]  Git 공부하기

[https://backlog.com/git-tutorial/kr/](https://backlog.com/git-tutorial/kr/) 

- [ ]  과제 하다가 모르겠으면 질문하기

>> <Spring> Spring과 Spring Boot 

[https://monkey3199.github.io/develop/spring/2019/04/14/Spring-And-SpringBoot.html](https://monkey3199.github.io/develop/spring/2019/04/14/Spring-And-SpringBoot.html) 

>> IntelliJ로 스프링부트 시작하기 

[https://velog.io/@dsunni/Spring-Boot-01-IntelliJ로-스프링부트-시작하기](https://velog.io/@dsunni/Spring-Boot-01-IntelliJ%EB%A1%9C-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0) 

>> setter 사용법 

[https://velog.io/@backfox/setter-쓰지-말라고만-하고-가버리면-어떡해요](https://velog.io/@backfox/setter-%EC%93%B0%EC%A7%80-%EB%A7%90%EB%9D%BC%EA%B3%A0%EB%A7%8C-%ED%95%98%EA%B3%A0-%EA%B0%80%EB%B2%84%EB%A6%AC%EB%A9%B4-%EC%96%B4%EB%96%A1%ED%95%B4%EC%9A%94) 

>> Git의 기본 

변경을 기록하는 커밋

>> 인프런 

- 공통 인터페이스 기능 : 순수 JPA 기반 리포지토리 만들기

>> Mac에서 git과 Sourcetree 사용하기 

[https://soyoung-new-challenge.tistory.com/129](https://soyoung-new-challenge.tistory.com/129) 

>> Git 

[https://backlog.com/git-tutorial/kr/intro/intro2_4.html](https://backlog.com/git-tutorial/kr/intro/intro2_4.html) : txt 파일 만들고 git add sample.txt 했는데 파일이 없다고 나온다. 일단 처음부터 끝까지 다 읽어봤다 

>> 인프런 강의들으면서 정리 

- 프로젝트 생성
- 라이브러리 살펴보기

핵심 라이브러리 

1. 스프링 MVC
2. 스프링 ORM
3. JPA, 하이버네이트
4. 스프링 데이터 JPA
    
    

기타 라이브러리 

1. H2 데이터베이스 클라이언트 
2. 커넥션 풀 : 부트 기본은 HiKariCP
3. 로깅 SLF4J & LogBack 
4. 테스트 

- H2 데이터베이스 설치

h2.database 버전 확인하는 방법 : 

[spring.io](http://spring.io) → Project → Spring boot → learn → 최신 버전 reference doc. → dependency versions → h2.database 검색 

- 스프링 데이터 JPA와 DB 설정, 동작확인

실무에서는 setter를 사용하지 않는다. 

꼭 변경해야 되는 부분만 setter를 사용한다. 

- 예제 도메인 모델과 동작확인 (예제 도메인 모델)

예제 도메인 모델 

예제 도메인 모델과 동작확인

엔티티 클래스스 

ERD

Member 엔티티 

- [x]  MemberRepository 파일 만드는 강의가서 만들기

@ManyToOne의 반대는 @OneToMany이다. 

- [x]  코드가 안 돌아감. 앞에 있는 강의처럼 코드 작성했나 확인하기

- 순수 JPA 기반 리포지토리 만들기 (공통 인터페이스 기능)

공통 인터페이스 기능 

- 공통 인터페이스 설정 (공통 인터페이스 기능)

공통 인터페이스 설정 

인터페이스 구현체가 없다 

03:27 

>> 코드 오류 발생 

[https://velog.io/@maigumi/IntelliJ-실행-에러-해결하기](https://velog.io/@maigumi/IntelliJ-%EC%8B%A4%ED%96%89-%EC%97%90%EB%9F%AC-%ED%95%B4%EA%B2%B0%ED%95%98%EA%B8%B0) 

[https://do-study.tistory.com/77](https://do-study.tistory.com/77) 

<< 참고하기 

스프링부트와 AWS로 혼자 구현하는 웹 서비스 

Spring Framework란? 

[https://khj93.tistory.com/entry/Spring-Spring-Framework란-기본-개념-핵심-정리](https://khj93.tistory.com/entry/Spring-Spring-Framework%EB%9E%80-%EA%B8%B0%EB%B3%B8-%EA%B0%9C%EB%85%90-%ED%95%B5%EC%8B%AC-%EC%A0%95%EB%A6%AC) 

[https://github.com/kwj1270/TIL_SPRINGBOOT_WITH_AWS](https://github.com/kwj1270/TIL_SPRINGBOOT_WITH_AWS)

>> 책 내용을 정리해둔 깃헙 

- Optional Class에 대한 설명

[http://www.tcpschool.com/java/java_stream_optional](http://www.tcpschool.com/java/java_stream_optional) 

[https://mangkyu.tistory.com/70](https://mangkyu.tistory.com/70) 

- 스프링부트로 API 만들기

[https://jojoldu.tistory.com/251](https://jojoldu.tistory.com/251) 

[https://kplog.tistory.com/244](https://kplog.tistory.com/244) 

Spring initializr 

>> Dependencies 

- Lombok
- Spring Web
- Spring Data JPA
- H2 Database