package com.adrian.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "PROVINCIA")

public class provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String Nom;
    @JsonIgnoreProperties("provincias")
    @ManyToOne
    @JoinColumn(name = "pais_id", nullable = false)
    pais pais_id;

    @JsonIgnoreProperties("provincia_id")
    @OneToMany(mappedBy = "provincia_id", cascade = CascadeType.ALL)
    private List<Ciudad> ciudades;

    public provincia(long id, String nom, pais pais_id, List<Ciudad> ciudades) {
        this.id = id;
        Nom = nom;
        this.pais_id = pais_id;
        this.ciudades=ciudades;
    }

    public provincia() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public pais getPais_id() {
        return pais_id;
    }

    public void setPais_id(pais pais_id) {
        this.pais_id = pais_id;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
