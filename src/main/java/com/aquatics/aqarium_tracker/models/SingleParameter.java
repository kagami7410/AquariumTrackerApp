package com.aquatics.aqarium_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "singleParameter")
public class SingleParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column
    private String title;

    @Column
    private float measurement;

    @Column
    private Date measurement_date;

    @Column
    private String unit;

    @ManyToOne
    @JoinColumn(name = "parameterlist_id")
    @JsonIgnoreProperties({"parameter"})
    ParametersList parameterList;


    public SingleParameter(String title, float measurement, Date measurement_date, String unit) {
        this.title = title;
        this.measurement = measurement;
        this.measurement_date = measurement_date;
        this.unit = unit;
    }

    public SingleParameter() {
    }

    public void setParameterList(ParametersList parametersList){
        this.parameterList = parametersList;
    }
}
