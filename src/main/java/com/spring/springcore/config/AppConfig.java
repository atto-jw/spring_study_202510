package com.spring.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스는 Bean(객체)을 등록하는 위한 설정 클래스
// 지정한 패키지 내에 있는 @Component가 붙은 객체들을 모두 스캔해서 Bean으로 등록
@ComponentScan(basePackages = "com.spring.springcore.chap04")
public class AppConfig {

    // 추가적으로 등록할 Bean이 있다면 메서드의 return 방식으로 Bean 등록 가능.

}
