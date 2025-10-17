package com.spring.springcore.chap04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("western")
public class WesternRestaurant implements Restaurant {

    private Chef chef;

    private Course course;

    public WesternRestaurant(@Qualifier("john") Chef chef,
                             @Qualifier("wc") Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요. 서양 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }
}
