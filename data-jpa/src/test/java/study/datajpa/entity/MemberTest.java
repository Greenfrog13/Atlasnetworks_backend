package study.datajpa.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
@Rollback(false)

class MemberTest {

    @PersistenceContext
    EntityManager em;

    @Test
    public void testEntity() {
        Team teamA = new Team("teamA");
        Team teamB = new Team("teamB");
        em.persist(teamA);
        em.persist(teamB);

        Member memebr1 = new Member("member1", 10, teamA);
        Member memebr2 = new Member("member2", 20, teamA);
        Member memebr3 = new Member("member3", 30, teamB);
        Member memebr4 = new Member("member4", 40, teamB);

        em.persist(memebr1);
        em.persist(memebr2);
        em.persist(memebr3);
        em.persist(memebr4);

        // 초기화
        em.flush();
        em.clear();

        // 확인
        List<Member> members= em.createQuery("select m from Member m", Member.class).
                getResultList();

        for (Member member : members) {
            System.out.println("member = " + member);
            System.out.println("-> member.team = " + member.getTeam());
        }
    }

}