package com.qf.pojo;

import lombok.Data;

@Data
public class OrderDetail {

    private Integer id;

    private String gname;

    private Integer number;

    private  Integer gid;

    private Integer uid;

    private Double price;


    private Integer type;

    private String pic;

    private String pic1;

    private String pic2;

    private String pic3;

    private Integer discount;

    private String desc;
}
