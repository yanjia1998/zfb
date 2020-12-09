package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String type;

    private String pic;
    private String pic1;
    private String pic2;
    private String pic3;

    private Double price;

    private Integer discount;

    private String desc;

    private Integer number;

}
