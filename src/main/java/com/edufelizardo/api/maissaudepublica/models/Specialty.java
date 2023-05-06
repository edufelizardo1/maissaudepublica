package com.edufelizardo.api.maissaudepublica.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Specialty implements Serializable {
    @Serial
    private static final long serialVersionUID = 7582872820215023028L;
    private Long id;
    private String professional;
    List<HealthEquipment> healthEquipments;

    public Specialty() {
    }

    public Specialty(Long id, String professional) {
        this.id = id;
        this.professional = professional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public List<HealthEquipment> getHealthEquipments() {
        return healthEquipments;
    }

    public void setHealthEquipments(List<HealthEquipment> healthEquipments) {
        this.healthEquipments = healthEquipments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specialty specialty)) return false;
        return Objects.equals(getId(), specialty.getId()) && Objects.equals(getProfessional(),
                specialty.getProfessional()) && Objects.equals(getHealthEquipments(), specialty.getHealthEquipments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProfessional(), getHealthEquipments());
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", professional='" + professional + '\'' +
                ", healthEquipments=" + healthEquipments +
                '}';
    }
}
