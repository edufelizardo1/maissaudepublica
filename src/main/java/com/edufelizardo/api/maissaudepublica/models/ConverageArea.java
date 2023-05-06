package com.edufelizardo.api.maissaudepublica.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ConverageArea implements Serializable {
    @Serial
    private static final long serialVersionUID = -613089457284878604L;
    private Long id;
    private Integer area;
    private List<Subarea> subareas;
    private HealthEquipment healthEquipment;

    public ConverageArea() {
    }

    public ConverageArea(Long id, Integer area, HealthEquipment healthEquipment) {
        this.id = id;
        this.area = area;
        this.healthEquipment = healthEquipment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public List<Subarea> getSubareas() {
        return subareas;
    }

    public void setSubareas(List<Subarea> subareas) {
        this.subareas = subareas;
    }

    public HealthEquipment getHealthEquipment() {
        return healthEquipment;
    }

    public void setHealthEquipment(HealthEquipment healthEquipment) {
        this.healthEquipment = healthEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConverageArea that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getArea(),
                that.getArea()) && Objects.equals(getSubareas(), that.getSubareas())
                && Objects.equals(getHealthEquipment(), that.getHealthEquipment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getArea(), getSubareas(), getHealthEquipment());
    }

    @Override
    public String toString() {
        return "ConverageArea{" +
                "id=" + id +
                ", area=" + area +
                ", subareas=" + subareas +
                ", healthEquipment=" + healthEquipment +
                '}';
    }
}
