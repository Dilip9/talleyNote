package com.notes.domain;

import javax.persistence.*;

@Entity
@Table(name = "rationdata")
public class RationData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "rice", nullable = false)
    private String rice;
    @Column(name = "daal", nullable = false)
    private String daal;
    @Column(name = "turmeric", nullable = false)
    private String turmeric;
    @Column(name = "chilli", nullable = false)
    private String chilli;
    @Column(name = "wheat", nullable = false)
    private String wheat;

    @Column(name = "sugarcane", nullable = false)
    private String sugarcane;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getDaal() {
        return daal;
    }

    public void setDaal(String daal) {
        this.daal = daal;
    }

    public String getTurmeric() {
        return turmeric;
    }

    public void setTurmeric(String turmeric) {
        this.turmeric = turmeric;
    }

    public String getChilli() {
        return chilli;
    }

    public void setChilli(String chilli) {
        this.chilli = chilli;
    }

    public String getWheat() {
        return wheat;
    }

    public void setWheat(String wheat) {
        this.wheat = wheat;
    }

    public String getSugarcane() {
        return sugarcane;
    }

    public void setSugarcane(String sugarcane) {
        this.sugarcane = sugarcane;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RationData() {
    }

    @Override
    public String toString() {
        return "RationData{" +
                "id=" + id +
                ", rice='" + rice + '\'' +
                ", daal='" + daal + '\'' +
                ", turmeric='" + turmeric + '\'' +
                ", chilli='" + chilli + '\'' +
                ", wheat='" + wheat + '\'' +
                ", sugarcane='" + sugarcane + '\'' +
                '}';
    }



}
