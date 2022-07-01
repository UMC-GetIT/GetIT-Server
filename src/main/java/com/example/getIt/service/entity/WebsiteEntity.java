package com.example.getIt.service.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "Website")
public class WebsiteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long webIdx;

    @Column(name = "price", nullable = false, length = 20)
    private String price;

    @Column(name = "url", nullable = false, length = 100)
    private String url;

}
