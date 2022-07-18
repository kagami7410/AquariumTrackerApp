package com.aquatics.aqarium_tracker.models;

import javax.persistence.*;

@Entity
@Table(name = "parameters")
public class Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String parameterName;

    @Column
    private Double measurement;

    @Column
    private String unit;


    public Parameter( String parameterName, Double measurement, String unit) {
        this.parameterName = parameterName;
        this.measurement = measurement;
        this.unit = unit;
    }

    public Parameter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Double measurement) {
        this.measurement = measurement;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
