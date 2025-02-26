package com.adrian.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PAIS")

public class pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String nom;

    @JsonIgnoreProperties("pais_id")
    @OneToMany(mappedBy = "pais_id", cascade = CascadeType.ALL)
    private List<provincia> provincia;


    public pais(long id, String nom, List<provincia> provincias) {
        this.id = id;
        this.nom = nom;
        this.provincia=  provincias;
    }

    public pais() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        nom = nom;
    }

    public List<com.adrian.model.provincia> getProvincia() {
        return provincia;
    }

    public void setProvincia(List<provincia> provincia) {
        this.provincia = provincia;
    }
}
