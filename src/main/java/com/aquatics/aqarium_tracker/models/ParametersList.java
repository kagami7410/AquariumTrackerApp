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

    @Column
    private Date measurement_date;

    @ManyToOne
    @JoinColumn(name = "fishTanks_id ")
    @JsonIgnoreProperties({"parameters"})
    FishTank fishTank;

    @OneToMany(mappedBy = "parameter")
    @JsonIgnoreProperties("parameter")
    List<SingleParameter> singleParameters;

    public ParametersList(Date measurement_date, FishTank fishTank) {

        this.measurement_date = measurement_date;
        this.fishTank = fishTank;
        this.singleParameters = new ArrayList<>();
    }

    public ParametersList() {
    }

}
