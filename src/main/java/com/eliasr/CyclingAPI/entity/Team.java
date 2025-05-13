package com.eliasr.CyclingAPI.entity;

import jakarta.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id")
    private Long id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "brand_bikes")
    private String brandBike;

    public Team(){

    }

    public Team(String teamName, String brandBike) {
        this.teamName = teamName;
        this.brandBike = brandBike;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getBrandBike() {
        return brandBike;
    }

    public void setBrandBike(String brandBike) {
        this.brandBike = brandBike;
    }
}
