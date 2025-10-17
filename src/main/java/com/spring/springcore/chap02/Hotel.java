package com.spring.springcore.chap02;

/**
 * 격일로 레스토랑이나 셰프 바꾸고 싶고, 동일한 기능을 사용을 위해서 인터페이스 제작
 * 추상적인 의존, 여전히 하지만 OCP를 위반하는 문제가 있다, 격일로 바꾸려면 직접적인 코드 수정이 있어야한다.
 */

/**
 * @solution
 * - 먼저 OCP와 DIP를 해결하기 위해 구체적인 객체 대신
 *  추상적인 역할에 의존하게끔 코드를 개선 (인터페이스 생성)
 *
 * @problem - 추상화를 했지만 여전히 의존 객체를 바꾸려면
 *            코드를 직접 변경해야 한다.
 */


public class Hotel {

    // 레스토랑
    private Restaurant restaurant = new WesternRestaurant();

    // 쉐프
    private Chef headChef = new KimChef();

    // 호텔을 소개하고, 레스토랑에 주문을 넣자
    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은 %s 입니다. 그리고 헤드 쉐프는 %s입니다.\n"
                ,restaurant.getClass().getSimpleName()
                ,headChef.getClass().getSimpleName());

        restaurant.order();
    }
}
