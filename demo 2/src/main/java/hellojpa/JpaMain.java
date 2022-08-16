package hellojpa;

import javax.persistence.EntityManager;
// 인터페이스. 객체에 대한 영속성 관리 작업. Query 인스턴스를 생성하는 팩토리처럼 작동한다.

// 인터페이스란, 구현된 것은 아무것도 없고 밑그림만 있는 기본 설계도. 일반 메서드 또는 멤버 변수를 가질 수 없고 오직 추상 메서드와 상수만을
// 멤버로 가질 수 있다.
// 추상 클래스보다 추상화가 더 높다.

// 추상 메소드란 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메서드
// 자바에서 추상 메서드를 선언하여 사용하는 목적은 추상 메서드가 포함된 클래스를 상속받는 자식 클래스가 반드시
// 추상 메서드를 구현하도록 하기 위함이다.

// 오버라이딩 : 부모 클래스로부터 상속받은 메서드의 내용을 변경하는 것

// 영속성 : 데이터를 생성한 프로그램의 실행이 종료되더라도 사라지지 않는 데이터의 특성

import javax.persistence.EntityManagerFactory;
// EntityManager 클래스의 팩토리 클래스. 이 클래스로 EntityManager 클래스의 인스턴스를 생성하고 관리할 수 있다.

import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;

public class JpaMain {
    // Jpa 동작을 확인하기 위해 JpaMain 클래스를 생성한다.
    // 이 클래스에서 Jpa가 실제로 동작하는 것을 확인한다.

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        // EntityManagerFactory에서 EntityManager를 꺼낸다.

        EntityTransaction tx = em.getTransaction();
        // Transaction은 데이터 처리의 단위
        // JPA에서는 transaction 이라는 단위가 굉장히 중요하다.
        // 반드시 transaction 안에서 작업해야 한다.
        // em.getTransaction() 으로 transaction을 가져온 후 transaction을 시작한다.
        // 하나의 transaction은 all-or-nothing 방식으로 처리된다
        // all-or-nothing 방식 : 여러 SQL문들의 집합 모두가 정상 처리되면 정상 종료시키고,
        // 하나의 SQL문이라도 오류가 있었다면 전체를 취소하는 방식

        tx.begin();

        try {

            Member member = new Member();
            member.setId("ID_A");
            member.setUsername("C");

            em.persist(member);


            //영속

            //Member member = new Member(200L, "member200");


            // Member member = em.find(Member.class, 150L);
            // member.setName("ZZZZ");
            // entity 변경하려면 이렇게 하면 된다
            // JPA는 값을 바꾸면 transaction이 commit되는 시점에 반영한다
            
            //if (member.getName().equals("ZZZZ")) {
            //    em.update(member);
            //}


            // em.detach(member);

            //em.persist(member);
            // JPA는 이 코드를 쓰면 안된다

            // member1, member2 생성
            // em.persist(member1);
            // em.persist(member2);
            // persist()에 member1, member2를 넣으며 저장한다.

            // System.out.println("====================");

            tx.commit();
            // 아직 저장되지 않은 데이터를 데이터베이스에 저장하고 transaction을 종료시키는 명령

        } catch (Exception e) {
            tx.rollback();
            // 저장되지 않은 데이터들의 변경을 모두 취소하고 transaction을 종료시키는 명령
            // 이전의 commit 상태 또는 지정된 savepoint로 복구시키는 명령어





        } finally {
            em.close();
        }
        // try-catch 문은 예외를 처리하기 위한 구문
        // try 문에서 exception 예외가 발생할 경우 catch (exception e)로 빠져서 그 안의 실행문을 실행
        // 마지막의 finally 블럭은 try-catch문과 함께 예외발생 여부와 관계없이 항상, 무조건 실행되어야 한다

        emf.close();
        // EntityManager가 내부적으로 데이터 connection을 가지고 동작하기 때문에 사용을 다하고 나면 꼭 닫아줘야 한다.
        // 하지만 실무에서는 이러한 코드는 스프링이 다 처리해준다.
    }
}
