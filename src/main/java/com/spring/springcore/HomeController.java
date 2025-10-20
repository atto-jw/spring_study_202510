package com.spring.springcore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// 요청과 응답을 수행하는 계층
@Controller // 컨트롤러 역할 Bean을 등록하겠다. Component랑 같은데, 이름으로 역할을 구분
public class HomeController {

    // 응답
    public HomeController() {
        System.out.println("HomeController 생성됨! 내가 생성한 거 아님"); // Spring boot에서 Bean으로 생성
    }

    // 요청 메서드
    // /hello 이름은 프론트엔드와 소통하여 지정 (기획 단계)
    @GetMapping("/hello") // 만약 /hello라는 요청이 들어오면, 객체 안에 home 메서드 호출 해줘.
    @ResponseBody
    public String home() {
        System.out.println("서버에 요청이 들어옴!");
        return "home"; //직접 클라이언트 데이터 전달을 해줌.
        // SSR -> 서버쪽에서 렌더링한다. 프론트, 백엔드 -> 전부 처리
    }
}
