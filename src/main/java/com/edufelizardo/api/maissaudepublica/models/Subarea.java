package com.edufelizardo.api.maissaudepublica.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Subarea implements Serializable {
    @Serial
    private static final long serialVersionUID = -7404513527246407745L;
    private Long id;
    private Integer micro;
    private List<AdressSubarea> adressSubareas;
    private ConverageArea converageArea;

    public Subarea() {
    }

    public Subarea(Long id, Integer micro, ConverageArea converageArea) {
        this.id = id;
        this.micro = micro;
        this.converageArea = converageArea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMicro() {
        return micro;
    }

    public void setMicro(Integer micro) {
        this.micro = micro;
    }

    public List<AdressSubarea> getAdressSubareas() {
        return adressSubareas;
    }

    public void setAdressSubareas(List<AdressSubarea> adressSubareas) {
        this.adressSubareas = adressSubareas;
    }

    public ConverageArea getConverageArea() {
        return converageArea;
    }

    public void setConverageArea(ConverageArea converageArea) {
        this.converageArea = converageArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subarea subarea)) return false;
        return Objects.equals(getId(), subarea.getId()) && Objects.equals(getMicro(),
                subarea.getMicro()) && Objects.equals(getAdressSubareas(),
                subarea.getAdressSubareas()) && Objects.equals(getConverageArea(), subarea.getConverageArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMicro(), getAdressSubareas(), getConverageArea());
    }

    @Override
    public String toString() {
        return "Subarea{" +
                "id=" + id +
                ", micro=" + micro +
                ", adressSubareas=" + adressSubareas +
                ", converageArea=" + converageArea +
                '}';
    }
}
