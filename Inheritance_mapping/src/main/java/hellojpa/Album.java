// 자바 ORM 표준 JPA 프로그래밍 - 기본편
// 상속관계 매핑

// 객체는 상속관계가 존재하지만 관계형 데이터베이스는 대부분 상속 관계가 없다
// 상속관계 매핑이라는 것은 객체의 상속 구조와 DB의 슈퍼타입 서브타입 관계를 매핑하는 것

package hellojpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
// Entity 저장 시 구분 컬럼에 입력할 값을 지정
// Entity를 저장할 때 부모 클래스의 DTYPE에 A가 저장된다

public class Album extends Item {

    private String artist;


}
