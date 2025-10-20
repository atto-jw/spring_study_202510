package com.spring.springcore.rest;

import lombok.*;

import java.util.List;

//lombok 사용
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Person {

    // 필드는 직접 선언
    private String name;
    private int age;
    private List<String> hobbies;


}
