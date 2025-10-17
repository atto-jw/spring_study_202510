package com.spring.springcore.chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 호텔 테스트
class HotelTest {

    @Test // @Test는 테스트지정, -> hotelTest는 테스트 메서드
    void hotelTest(){
        // 테스트 로직
        Hotel hotel = new Hotel();
        hotel.inform();
    }
}