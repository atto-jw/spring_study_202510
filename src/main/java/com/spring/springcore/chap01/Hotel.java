package com.spring.springcore.chap01;

/**
 Hotel 안에는 2개 레스토랑이 있다.(아시안, 서양)
 아시안 레스토링은 KimChef가 있고, 서양 레스토랑은 John이 있다.
 아시안 레스토랑엔 SushiCourse, 서양 레스토랑은 WesternCourse
 호텔은 2개 레스토랑 의존하고, 2개 레스토랑은 세프,코스 의존적이다.
*/

/**
 * @problem - 호텔 클래스에서 직접 객체를 생성하면
 *            나중에 의존객체(레스토랑, 헤드쉐프)를 변경해야 할 때
 *            직접 호텔 클래스를 수정해야 하므로 OCP를 위반하게 됨.
 *            그리고, headChef가 변경되면 레스토랑 안에 쉐프도
 *            같이 바뀌어야 할 때 2군데를 수정해야 함.
 *            문제 해결하기 위한 chap02로..
 */

public class Hotel {

    // 레스토랑
    private WesternRestaurant restaurant = new WesternRestaurant();

    // 쉐프
    private JohnChef headChef = new JohnChef();

    // 호텔을 소개하고, 레스토랑에 주문을 넣자
    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은 %s 입니다. 그리고 헤드 쉐프는 %s입니다.\n"
                ,restaurant.getClass().getSimpleName()
                ,headChef.getClass().getSimpleName());

        restaurant.order();
    }
}
