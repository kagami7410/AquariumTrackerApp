package com.aquatics.aqarium_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name ="fish_tanks")
public class FishTank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name  = "user_id")
    @JsonIgnoreProperties({"fishTanks"})
    User user;

    @OneToOne(mappedBy = "fishTank")
    @JsonIgnoreProperties({"fishTank"})
    private ParametersList parameters;


    public FishTank(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public FishTank() {
    }


}
