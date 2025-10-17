package com.spring.springcore.chap03;

public class AsianRestaurant implements Restaurant {

    private Chef chef;

    private Course course;

    // 의존 객체를 직접 생성하는 것이 아닌, 외부에서 생성자를 통해 전달할 예정 (AppConfig 이용)
    public AsianRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요. 아시안 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }
}
