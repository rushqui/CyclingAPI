package com.eliasr.CyclingAPI.entity;

import com.eliasr.CyclingAPI.dto.rider.RiderRQ;
import jakarta.persistence.*;

@Entity(name = "rider")
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rider_id")
    private Long id;

    private String name;

    private int age;

    private int ranking;

    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "team_id")
    private Team team;

    public Rider(RiderRQ riderRQ, Team team) {
        this.name = riderRQ.getName();
        this.age = riderRQ.getAge();
        this.ranking = riderRQ.getRanking();
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
