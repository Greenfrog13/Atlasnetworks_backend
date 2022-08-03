package test.test;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@Controller
public class QuestionController {
    // Jackson 라이브러리인 ObjectMapper를 생성
    private ObjectMapper mapper = new ObjectMapper();


    @PostMapping("/question-json-v2")
    public void requestBodyJsonV2(@RequestBody Question question) throws IOException {
        // helloData를 바로 사용할 수 있다
    }






}
