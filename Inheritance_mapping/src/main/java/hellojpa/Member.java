package hellojpa;

import javax.persistence.*;

@Entity
public class Member extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @ManyToOne(fetch = FetchType.LAZY) // @ManyToOne은 다 LAZY로 받아야 한다. @OneToMany는 default가 LAZY라 따로 안 써도 된다
    // JPA에서 가장 많이 사용하는 관계가 N:1
    // @ManyToOne 속성은 다음과 같다
    // targetEntity, cascade, fetch, optional

    @JoinColumn
    private Team team;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public Team getTeam() { return team; }

    public void setTeam(Team team) { this.team = team; }
}
