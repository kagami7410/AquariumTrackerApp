package com.aquatics.aqarium_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="fish_tanks")
public class FishTank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name  = "fishTanks")
    @JsonIgnoreProperties({"fishTanks"})
    User user;

    @OneToMany(mappedBy = "fishTank")
    @JsonIgnoreProperties({"fishTank"})
    private List<Parameter> parameters;

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public FishTank(String name, User myuser) {
        this.name = name;
        this.user = user;
    }

    public FishTank() {
    }


}
