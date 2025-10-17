package com.spring.springcore.chap01;

import com.spring.springcore.chap04.Hotel;
import com.spring.springcore.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

// 호텔 테스트
class HotelTest {

    @Test // @Test는 테스트지정, -> hotelTest는 테스트 메서드
    void hotelTest(){

        // 스프링 컨테이너(등록한 Bean(객체)을 담아놓는 컨테이너)를 로딩하는 객체를 생성.
        // Appconfig 클래스에 지정한 형식을 사용
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);

        Hotel hotel = ctx.getBean(Hotel.class);
        hotel.inform();
    }
}