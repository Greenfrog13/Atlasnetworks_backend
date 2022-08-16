// 테이블과 매핑이 되는 Member라는 클래스를 생성
package hellojpa;

import javax.persistence.*;
// import java.util.Date;

@Entity // 객체와 테이블 매핑
// 매핑이란, 해당 값이 다른 값을 가리키도록 하는 것
// 가장 중요한 것은 @Entity이다.
// @Entity Annotation이 있어야 JPA가 처음 로딩될 때 JPA를 사용한다고 인식하고 관리해준다.
// @Table(name = "MBR")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    @Column(name = "name", nullable = false)
    private String username;

    public Member() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    @Id // 기본 키 매핑
//    private Long id;

//    @Column(name="name", updateable = false)
//    private String username;

//    private int age;

//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;

    // 최신 버전쓰면 따로 annotation 안 써도 된다
//    private LocalDate testLocalDate;
//    private LocalDateTime testLocalDateTime;

//    @Lob
//    private String description;

//    public Member() {
//    }

    //public Member(Long id, String name) {
       // this.id = id;
       // this.name = name;
   // }

    // 객체 지향 프로그래밍에서는 메서드를 통해 데이터를 변경하는 방법을 선호
    // 접근 제한자 : public
    // Setter : 외부에서 메서드를 통해 데이터에 접근하도록 유도한다.
    // Getter : 외부에서 객체의 데이터를 읽을 때도 메서드를 사용하는 것이 좋다
    //public Long getId() {
        //return id;
    //}

    //public void setId(Long id) {
        //this.id = id;
   // }

    //public String getName() {
        //return name;
   // }

    //public void setName(String name) {
      //  this.name = name;
   // }
}
