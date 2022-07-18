package com.aquatics.aqarium_tracker.models;


import javax.persistence.*;
import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String email;

    @Column
    String name;

    @Column
    String password;

    @OneToMany(mappedBy = "user")
    List<FishTank> fishTanks;

    public User(String email, String name, String password, List<FishTank> fishTanks) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.fishTanks = fishTanks;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
