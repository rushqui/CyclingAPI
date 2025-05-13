package com.eliasr.CyclingAPI.entity;

import jakarta.persistence.*;

@Entity(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id")
    private Long id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "brand_bikes")
    private String brandBike;

    private String country;

    public Team(){

    }

    public Team(String teamName, String brandBike, String country) {
        this.teamName = teamName;
        this.brandBike = brandBike;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", brandBike='" + brandBike + '\'' +
                ", country='" + country + '\'' +
                '}';
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
