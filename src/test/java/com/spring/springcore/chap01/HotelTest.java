package com.spring.springcore.chap01;

import com.spring.springcore.chap03.Hotel;
import com.spring.springcore.config.AppConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 호텔 테스트
class HotelTest {

    @Test // @Test는 테스트지정, -> hotelTest는 테스트 메서드
    void hotelTest(){
        // 테스트 로직
        AppConfig config = new AppConfig();
        // 전달받은 호텔 객쳋 안에는 이미 의존 객체들이 주입되어 있는 상태
        Hotel hotel = config.hotel();
        hotel.inform();
    }
}