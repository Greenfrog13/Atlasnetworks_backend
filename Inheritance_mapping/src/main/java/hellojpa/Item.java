package hellojpa;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// 객체는 상속을 지원하므로 모델링과 구현이 똑같지만 DB는 상속을 지원하지 않으므로 논리 모델을 물리 모델로 구현할 방법이 필요하다
// DB의 슈퍼타입 서브타입 논리 모델을 실제 물리 모델로 구현하는 방법은 3가지 있다
// 중요한 건 DB에서 세 가지로 구현하지만 JPA에서는 어떤 방식을 선택하던 매핑이 가능하다
// JPA가 이 세가지 방식과 매핑하려면
// @Inheritance(strategy = InheritanceType.XXX) 의 strategy를 설정해주면 된다
// default 전략은 SINGLE_TABLE (단일 테이블 전략)이다
// InheritanceType 종류
// JOINED
// SINGLE_TABLE
// TABLE_PER_CLASS


@DiscriminatorColumn
// 부모 클래스에 선언한다. 하위 클래스를 구분하는 용도의 컬럼이다. 관례는 default = DTYPE

public abstract class Item {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }
}
