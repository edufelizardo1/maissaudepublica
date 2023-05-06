package com.edufelizardo.api.maissaudepublica.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class TypeOfHealthEquipment implements Serializable {
    @Serial
    private static final long serialVersionUID = -7835261823227780799L;
    private Long id;
    private String type;
    private List<HealthEquipment> healthEquipments;

    public TypeOfHealthEquipment() {
    }

    public TypeOfHealthEquipment(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if (!(o instanceof TypeOfHealthEquipment that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getType(), that.getType())
                && Objects.equals(getHealthEquipments(), that.getHealthEquipments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getHealthEquipments());
    }

    @Override
    public String toString() {
        return "TypeOfHealthEquipment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", healthEquipments=" + healthEquipments +
                '}';
    }
}
