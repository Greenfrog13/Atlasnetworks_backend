// 실제로 JPA를 사용하는 애플리케이션 만들기
// 에러 발생 이유 : dependencies 설치하는 과정에서 오류

package ex1hellojpa.demo;

// Springboot initializr 를 사용해 maven 파일을 생성
// Springboot initializr 를 사용했기 때문에 자동으로 import 되었다
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 내장 WAS (Web Application Server)란 별도로 외부에 WAS 를 두지 않고 내부에서 WAS 를 실행하는 것을 말한다.
// 이렇게하면 항상 서버에 톰캣을 설치할 필요가 없게 되고, 스프링 부트로 만들어진 jar 파일로 실행하면 된다.


public class NameApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameApplication.class, args);
	}

}
