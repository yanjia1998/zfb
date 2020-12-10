package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Wang on 2020/12/9 20:46
 */
@Data
@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String img;
    private String p1;
    private String p2;
    private String p3;


}
