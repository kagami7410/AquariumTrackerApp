package com.aquatics.aqarium_tracker.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class FishTank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;
    @ManyToOne
    User user;

    @OneToMany(mappedBy = "fishTank")
    List<Parameter> paramerters;

    public FishTank(String name, User user, List<Parameter> paramerters) {
        this.name = name;
        this.user = user;
        this.paramerters = paramerters;
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

    public List<Parameter> getParamerters() {
        return paramerters;
    }

    public void setParamerters(List<Parameter> paramerters) {
        this.paramerters = paramerters;
    }
}
