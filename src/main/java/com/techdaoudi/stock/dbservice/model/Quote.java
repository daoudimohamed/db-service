package com.techdaoudi.stock.dbservice.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="quotes", catalog = "test")
public class Quote {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="user_name")
    private String UserName;

    @Column(name="quote")
    private String quote;

}
