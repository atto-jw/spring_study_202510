package com.spring.springcore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// 요청과 응답을 수행하는 계층
@Controller // 컨트롤러 역할 (클래스 객체를 Bean으로 만들어 컨테이너에 저장)
public class HomeController {

    // 응답
    public HomeController() {
        System.out.println("HomeController 생성됨! 내가 생성한 거 아님"); // Spring boot에서 Bean으로 생성
    }

    // 요청 메서드
    // /hello 이름은 프론트엔드와 소통하여 지정 (기획 단계)
    @GetMapping("/hello") // 만약 /hello라는 요청이 들어오면, 객체 안에 home 메서드 호출 해줘.
    public String home() {
        System.out.println("서버에 요청이 들어옴!");
        return "home"; //"home"은 내가 열고자 하는 파일명, home -> templates (home.html) return;
    }
}
