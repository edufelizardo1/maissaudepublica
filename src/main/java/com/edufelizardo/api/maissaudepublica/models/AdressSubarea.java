package com.edufelizardo.api.maissaudepublica.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class AdressSubarea implements Serializable {
    @Serial
    private static final long serialVersionUID = 8469154823179358707L;
    private Long id;
    private String publicPlace;
    private Integer inialNumber;
    private Integer finalNumber;
    private String zipCode;
    private Subarea subarea;

    public AdressSubarea() {
    }

    public AdressSubarea(Long id, String publicPlace, Integer inialNumber, Integer finalNumber, String zipCode,
                         Subarea subarea) {
        this.id = id;
        this.publicPlace = publicPlace;
        this.inialNumber = inialNumber;
        this.finalNumber = finalNumber;
        this.zipCode = zipCode;
        this.subarea = subarea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public Integer getInialNumber() {
        return inialNumber;
    }

    public void setInialNumber(Integer inialNumber) {
        this.inialNumber = inialNumber;
    }

    public Integer getFinalNumber() {
        return finalNumber;
    }

    public void setFinalNumber(Integer finalNumber) {
        this.finalNumber = finalNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Subarea getSubarea() {
        return subarea;
    }

    public void setSubarea(Subarea subarea) {
        this.subarea = subarea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdressSubarea that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPublicPlace(),
                that.getPublicPlace()) && Objects.equals(getInialNumber(),
                that.getInialNumber()) && Objects.equals(getFinalNumber(),
                that.getFinalNumber()) && Objects.equals(getZipCode(),
                that.getZipCode()) && Objects.equals(getSubarea(), that.getSubarea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPublicPlace(), getInialNumber(), getFinalNumber(), getZipCode(), getSubarea());
    }

    @Override
    public String toString() {
        return "AdressSubarea{" +
                "id=" + id +
                ", publicPlace='" + publicPlace + '\'' +
                ", inialNumber=" + inialNumber +
                ", finalNumber=" + finalNumber +
                ", zipCode='" + zipCode + '\'' +
                ", subarea=" + subarea +
                '}';
    }
}
