package com.aquatics.aqarium_tracker.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.*;


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
    private String username;

    @Column
    private Boolean active;

    @Column
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties({"user"})
    private List<FishTank> fishTanks;

    @Column
    private String roles;
    public User() {
    }


    public User(String username) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.fishTanks = new ArrayList<>();
        this.username = username;

    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<FishTank> getFishTanks() {
        return fishTanks;
    }

    public void setFishTanks(List<FishTank> fishTanks) {
        this.fishTanks = fishTanks;
    }
}