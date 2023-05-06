package com.edufelizardo.api.maissaudepublica.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HealthEquipment implements Serializable {
    @Serial
    private static final long serialVersionUID = 2508686621968470395L;
    private Long id;
    private String name;
    private Adress adress;
    private Set<String> healthEquipmentTelephones = new HashSet<>();
    private TypeOfHealthEquipment typeOfHealthEquipment;
    private Integer bedNumber;
    private Set<Specialty> specialties = new HashSet<>();

    public HealthEquipment() {
    }

    public HealthEquipment(Long id, String name, Adress adress, Set<String> healthEquipmentTelephones,
                           TypeOfHealthEquipment typeOfHealthEquipment, Integer bedNumber) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.healthEquipmentTelephones = healthEquipmentTelephones;
        this.typeOfHealthEquipment = typeOfHealthEquipment;
        this.bedNumber = bedNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Set<String> getHealthEquipmentTelephones() {
        return healthEquipmentTelephones;
    }

    public void setHealthEquipmentTelephones(Set<String> healthEquipmentTelephones) {
        this.healthEquipmentTelephones = healthEquipmentTelephones;
    }

    public TypeOfHealthEquipment getTypeOfHealthEquipment() {
        return typeOfHealthEquipment;
    }

    public void setTypeOfHealthEquipment(TypeOfHealthEquipment typeOfHealthEquipment) {
        this.typeOfHealthEquipment = typeOfHealthEquipment;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HealthEquipment that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName())
                && Objects.equals(getAdress(), that.getAdress()) && Objects.equals(getHealthEquipmentTelephones(),
                that.getHealthEquipmentTelephones()) && Objects.equals(getTypeOfHealthEquipment(),
                that.getTypeOfHealthEquipment()) && Objects.equals(getBedNumber(), that.getBedNumber())
                && Objects.equals(getSpecialties(), that.getSpecialties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAdress(), getHealthEquipmentTelephones(), getTypeOfHealthEquipment(),
                getBedNumber(), getSpecialties());
    }

    @Override
    public String toString() {
        return "HealthEquipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                ", healthEquipmentTelephones=" + healthEquipmentTelephones +
                ", typeOfHealthEquipment=" + typeOfHealthEquipment +
                ", bedNumber=" + bedNumber +
                ", specialties=" + specialties +
                '}';
    }
}
