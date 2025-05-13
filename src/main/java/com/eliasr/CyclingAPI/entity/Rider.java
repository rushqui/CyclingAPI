package com.eliasr.CyclingAPI.entity;

import jakarta.persistence.*;

@Entity(name = "rider")
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rider_id")
    private Long id;

    private int age;

    private int ranking;

    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "team_id")
    private Team team;


}
