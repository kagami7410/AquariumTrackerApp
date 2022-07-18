package com.aquatics.aqarium_tracker.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties({"user"})
     private List<FishTank> fishTanks;



    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.fishTanks = new ArrayList<>();

    }

    public List<FishTank> getFishTanks() {
        return fishTanks;
    }

    public void setFishTanks(List<FishTank> fishTanks) {
        this.fishTanks = fishTanks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
