// 자바 ORM 표준 JPA 프로그램 - 요구사항 분석과 기본 매핑
package jpabook.jpashop.domain;

import javax.persistence.*;

// 기본 키 매핑 annotation 종류
// @Id
// @GeneratedValue
// @SequenceGenerator
// @TableGenerator
// 기본키 매핑은 직접할당과 자동할당 방법으로 나뉜다


@Entity
// 데이터베이스의 테이블과 일대일로 매칭되는 객체 단위
// Entity 객체의 인스턴스 하나가 테이블에서 하나의 레코드 값을 의미
// 그래서 객체의 인스턴스를 구분하기 위한 유일한 키값을 가지는데
// 이것을 테이블 상의 Primary Key 와 같은 의미를 가지고
// @Id annotation 표기된다


public class Item {


    // 기본키를 자동으로 생성할 때는 @Id와 @GeneratedValue annotation이 함께 사용되어야 한다
    @Id
    // 기본키 직접할당
    // 엔티티의 기본키 필드에 값을 직접 넣어 등록한다
    // 데이터베이스의 테이블은 기본적으로 유일한 값을 가진다. 이를 PK(Primary Key)라고 한다.
    // 데이터베이스는 이 유일한 키값을 기준으로 질의한 데이터를 추출해 결과셋으로 반환한다
    // JPA에서도 Entity 클래스 상에 해당 PK를 명시적으로 표시해야하는데 그것을 @Id annotation을 이용해
    // 이것이 PK임을 지정한다

    @GeneratedValue
    // 생략하면 AUTO 속성으로 지정된다
    // 기본키 자동할당
    // 기본 설정 값으로 각 데이터베이스에 따라 기본키를 자동으로 생성
    // PK 칼럼의 데이터 형식은 정해져 있지는 않으나 구분이 가능한 유일한 값을 가지고 있어야 하고
    // 데이터 경합으로 인해 발생되는 데드락 같은 현상을 방지하기 위해 대부분 Java의 Long을 주로 사용한다
    // 기본키의 제약조건
    // 1. null 이면 안된다.
    // 2. 유일하게 식별할 수 있어야 한다
    // 3. 변하지 않는 값이어야 한다


    @Column(name = "ITEM_ID")
    // @Column annotation은 객체 필드와 DB 테이블 컬럼을 매핑한다
    // @Column의 속성
    // name : 매핑할 테이블의 컬럼 이름을 지정

    private Long Id;

    private String name;
    private int price;
    private int stockQuantity;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
