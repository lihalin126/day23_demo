package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get 、set
@AllArgsConstructor //所有参数的有参数构造函数
@NoArgsConstructor //无参数构造函数
public class Car {

    private Integer id;
    private String name;
    private Float price;

}
