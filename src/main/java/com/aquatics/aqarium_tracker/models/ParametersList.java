package com.aquatics.aqarium_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "parameters")
public class ParametersList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    @JoinColumn(name = "fishTanks_id ")
    @JsonIgnoreProperties({"parameters"})
    FishTank fishTank;

    @Column
    private String title;

    @OneToMany(mappedBy = "parameterList",cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("parameterList")
    List<SingleParameter> singleParameters;

    public ParametersList(String title, FishTank fishTank) {
        this.fishTank = fishTank;
        this.title = title;
        this.singleParameters = new ArrayList<>();
    }

    public ParametersList() {
    }

}
