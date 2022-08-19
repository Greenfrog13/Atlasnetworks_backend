package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Child child1 = new Child();
            Child child2 = new Child();

            Parent parent = new Parent();
            parent.addChild(child1);
            parent.addChild(child2);

            em.persist(parent);

            em.flush();
            em.clear();

            Parent findParent = em.find(Parent.class, parent.getId());
            findParent.getChildlist().remove(0);


            // Team team = new Team();
            // team.setName("teamA");
            // em.persist(team);

            // Team teamB = new Team();
            // team.setName("teamB");
            // em.persist(teamB);

            // Member member1 = new Member();
            // member1.setUsername("member1");
            // member1.setTeam(team);
            // em.persist(member1);

            // Member member2 = new Member();
            // member2.setUsername("member2");
            // member2.setTeam(team);
            // em.persist(member2);

            // em.flush();
            // em.clear(); // clear하면 서비스 처음 시작하는 것처럼 지워진다.

            // Member m = em.find(Member.class, member1.getId());

            //List<Member> members = em.createQuery("select m from Member m join fetch m.team", Member.class).getResultList();

            // SQL : select * from Member
            // SQL : select * from Team where TEAM_ID = xxx

            // System.out.println("m = " + m.getTeam().getClass());

            // System.out.println("================");
            // m.getTeam().getName(); // 초기화
            // System.out.println("teamName = " + m.getTeam().getName());
            // System.out.println("================");


            // Member refMember = em.getReference(Member.class, member1.getId());
            // System.out.println("refMember = " + refMember.getClass()); // Proxy
            // refMember.getUsername(); // 강제 초기화
            // System.out.println("isLoaded = " + emf.getPersistenceUnitUtil().isLoaded(refMember));

            // Hibernate.initialize(refMember); // 강제 초기화




            // em.detach(refMember); // 영속성 context 관리 안할거라는 뜻
            // em.close();
            // em.clear(); // 끈 것은 아니지만 아무것도 없는 상태

            // 실무에서 많이 만난다

            // refMember.getUsername();

            // System.out.println("refMember = " + refMember.getUsername());


            // Member findMember = em.find(Member.class, member1.getId());
            // System.out.println("findMember = " + findMember.getClass()); // Member

            // System.out.println("refMember == findMember: " + (refMember == findMember)); // JPA에서는 무조건 참으로 인정해줘야 한다
            // JPA에서는 어떻게든 true를 맞춘다


            // Member findMember = em.getReference(Member.class, member1.getId());

            // Member findMember = em.find(Member.class, member.getId());
            // Member findMember = em.getReference(Member.class, member.getId());
            // System.out.println("findMember.username = " + findMember.getUsername());
            // System.out.println("findMember.username = " + findMember.getUsername());


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        emf.close();
    }



}
