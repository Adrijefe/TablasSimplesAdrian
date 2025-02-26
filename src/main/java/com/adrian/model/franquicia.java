package com.adrian.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FRANQUICIA")

public class franquicia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String nom;
    @JsonIgnoreProperties("franquicia")
    @ManyToMany
    @JoinTable(
            name = "CIUDAD_FRANQUICIA",
            joinColumns =  @JoinColumn(name = "franquicia_id"),
            inverseJoinColumns = @JoinColumn(name = "ciudad_id")
    )
    List<Ciudad> ciudad;

    public franquicia(){}

    public franquicia(long id, String nom, List<Ciudad> list) {
        this.id = id;
        this.nom = nom;
        this.ciudad = list;
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
        this.nom = nom;
    }

    public List<Ciudad> getCiudad() {
        return ciudad;
    }

    public void setCiudad(List<Ciudad> ciudadList) {
        this.ciudad = ciudadList;
    }
}
