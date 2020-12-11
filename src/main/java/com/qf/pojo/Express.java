package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name ="express")
public class Express {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String img;

    private String expressid;

    private String info;

    private String type;

}

