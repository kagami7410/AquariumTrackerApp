package com.aquatics.aqarium_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name ="fishTanks")
public class FishTank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name = "fishTanks")
    @JsonIgnoreProperties({"fishTanks"})
    User user;

    public FishTank(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public FishTank() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
