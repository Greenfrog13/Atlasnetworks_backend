package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue // GeneratedValue Strategy는 auto, 생략하면 auto
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    // 실무에서는 setter 안쓰지만 예제에서는 setter 사용
    // setter 사용하면 안 되는 이유
    // setter method를 사용하면 값을 변경할 의도를 파악하기 힘들다
    // setter를 나열하는 것만으로 어떤 의도로 데이터를 변경했는지 명확히 알 수 없다
    // 객체의 일관성을 유지하기 힘들다
    // 자바 빈 규약을 따르는 setter는 public으로 언제든지 변경할 수 있는 상태가 된다
    // 객체의 일관성을 유지하기 어렵다

    // setter 대신 다른 것을 사용하자
    // 생성자를 오버로딩
    // 멤버 변수가 많고 다양한 생성자를 가져야 한다면 코드가 길어지고 가독성이 떨어진다
    // 이를 해결하기 위해 Builder 패턴을 사용

    // Builder 패턴 사용
    // Builder 패턴은 요구사항에 맞게 필요한 데이터만 이용하여 유연한 클래스 생성이 가능하다
    // 때문에 다양한 생성자들이 사라지고 전체 생성자 하나만을 가지고 있는 형태로 변경되어 유지보수 및 가독성 향상
    // 또한 객체를 생성할 때 인자 값의 순서가 상관없다는 장점

    // 정적 팩토리 메소드
    // 정적 팩토리 메소드를 사용하면 이름을 가질 수 있기 때문에 반환될 데이터를 추측할 수 있다


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
