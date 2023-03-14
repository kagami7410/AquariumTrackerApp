package com.aquatics.aqarium_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "parameters")
public class Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private int magnesium;

    @Column
    private String unit;

    @Column
    private int calcium;

    @Column
    private int dKh;

    @Column
    private int nitrate;

    @Column
    private int phosphate;

    @Column
    private double salinity;

    @Column
    private Date measurement_date;

    @ManyToOne
    @JoinColumn(name = "parameters")
    @JsonIgnoreProperties({"parameters"})
    FishTank fishTank;

    public Parameter(int magnesium, String unit, int calcium, int dKh, int nitrate, int phosphate, double salinity, Date measurement_date, FishTank fishTank) {
        this.magnesium = magnesium;
        this.unit = unit;
        this.calcium = calcium;
        this.dKh = dKh;
        this.nitrate = nitrate;
        this.phosphate = phosphate;
        this.salinity = salinity;
        this.measurement_date = measurement_date;
        this.fishTank = fishTank;
    }

    public Parameter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(int magnesium) {
        this.magnesium = magnesium;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getCalcium() {
        return calcium;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public int getdKh() {
        return dKh;
    }

    public void setdKh(int dKh) {
        this.dKh = dKh;
    }

    public int getNitrate() {
        return nitrate;
    }

    public void setNitrate(int nitrate) {
        this.nitrate = nitrate;
    }

    public int getPhosphate() {
        return phosphate;
    }

    public void setPhosphate(int phosphate) {
        this.phosphate = phosphate;
    }

    public double getSalinity() {
        return salinity;
    }

    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }

    public Date getDate() {
        return measurement_date;
    }

    public void setDate(Date date) {
        this.measurement_date = date;
    }

    public FishTank getFishTank() {
        return fishTank;
    }

    public void setFishTank(FishTank fishTank) {
        this.fishTank = fishTank;
    }
}
