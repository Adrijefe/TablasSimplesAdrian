package com.adrian.controller;

import com.adrian.model.Ciudad;
import com.adrian.model.PAIS;
import com.adrian.model.PROVINCIA;
import com.adrian.repositoris.CiudadRepository;
import com.adrian.repositoris.FranquiciaRepository;
import com.adrian.repositoris.PaisRepository;
import com.adrian.repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ControllerVue {

    @Autowired
    CiudadRepository ciudadRepository;

    @Autowired
    FranquiciaRepository franquiciaRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;

    @Autowired
    PaisRepository paisRepository;


    @GetMapping("/ciudades")
    public List<Ciudad> listaciudades(){
        return ciudadRepository.findAll();
    }

    @GetMapping("/provincias")
    public List<PROVINCIA> listaprovincias(){
        return provinciaRepository.findAll();
    }

    @GetMapping("/pais")
    public List<PAIS> listapais(){
        return paisRepository.findAll();
    }









}
