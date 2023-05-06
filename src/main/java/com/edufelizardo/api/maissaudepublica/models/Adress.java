package com.edufelizardo.api.maissaudepublica.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Adress implements Serializable {
    @Serial
    private static final long serialVersionUID = 4977860605320766475L;
    private Long id;
    private String zipCode;
    private String street;
    private int number;
    private String complement;
    private String neighborhood;
    private String locale;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Adress() {
    }

    public Adress(Long id, String zipCode, String street, int number, String complement, String neighborhood,
                  String locale, String uf, String ibge, String gia, String ddd, String siafi) {
        this.id = id;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.locale = locale;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress adress)) return false;
        return getNumber() == adress.getNumber() && Objects.equals(getId(),
                adress.getId()) && Objects.equals(getZipCode(), adress.getZipCode()) && Objects.equals(getStreet(),
                adress.getStreet()) && Objects.equals(getComplement(),
                adress.getComplement()) && Objects.equals(getNeighborhood(),
                adress.getNeighborhood()) && Objects.equals(getLocale(), adress.getLocale()) && Objects.equals(getUf(),
                adress.getUf()) && Objects.equals(getIbge(), adress.getIbge()) && Objects.equals(getGia(),
                adress.getGia()) && Objects.equals(getDdd(), adress.getDdd()) && Objects.equals(getSiafi(),
                adress.getSiafi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getZipCode(), getStreet(), getNumber(), getComplement(), getNeighborhood(),
                getLocale(), getUf(), getIbge(), getGia(), getDdd(), getSiafi());
    }

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", complement='" + complement + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", locale='" + locale + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }
}
