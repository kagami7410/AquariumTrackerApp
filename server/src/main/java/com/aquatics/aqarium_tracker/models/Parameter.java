package com.aquatics.aqarium_tracker.models;

import javax.persistence.*;

@Entity
public class Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    FishTank fishTank;

    @Column
    String parameterName;

    @Column
    Double measurement;

    @Column
    String unit;


    public Parameter(FishTank fishTank, String parameterName, Double measurement, String unit) {
        this.fishTank = fishTank;
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

    public FishTank getFishTank() {
        return fishTank;
    }

    public void setFishTank(FishTank fishTank) {
        this.fishTank = fishTank;
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
