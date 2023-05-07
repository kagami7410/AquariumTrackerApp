package com.aquatics.aqarium_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "singleParameter")
public class SingleParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long Id;

    @Column
    private String title;

    @Column
    private float measurement;

    @Column
    private String unit;

    @ManyToOne
    @JoinColumn(name = "singleParamerter_id")
    @JsonIgnoreProperties({"parameter"})
    ParametersList parameter;


    public SingleParameter(String title, float measurement, String unit) {
        this.title = title;
        this.measurement = measurement;
        this.unit = unit;
    }

    public SingleParameter() {
    }
}
