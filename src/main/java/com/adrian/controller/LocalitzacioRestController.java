package com.adrian.controller;

import com.adrian.model.Ciudad;
import com.adrian.model.franquicia;
import com.adrian.model.pais;
import com.adrian.model.provincia;
import com.adrian.repositoris.CiudadRepository;
import com.adrian.repositoris.FranquiciaRepository;
import com.adrian.repositoris.PaisRepository;
import com.adrian.repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/ciudads")
public class LocalitzacioRestController {

    @Autowired
    CiudadRepository ciudadRepository;

    @Autowired
    FranquiciaRepository franquiciaRepository;

    @Autowired
    PaisRepository paisRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;


    @GetMapping("/ciudades")
    public List<Ciudad> getCiudades() {
        return ciudadRepository.findAll();
    }


    @PostMapping("/ciudades")
    public void createCiudad(@RequestBody Ciudad ciudad) {
        ciudadRepository.save(ciudad);
    }

    @DeleteMapping("/ciudades/{id}")
    public String deleteCiudad(@PathVariable Long id) {
        ciudadRepository.deleteById(id);
        return "borrada";
    }

    @GetMapping("/provincias")
    public List<provincia> getProvincias() {
        return provinciaRepository.findAll();
    }


    @PostMapping("/provincias")
    public void createProvincia(@RequestBody provincia provincia) {
        provinciaRepository.save(provincia);
    }

    @DeleteMapping("/provincias/{id}")
    public String deleteProvincias(@PathVariable Long id) {
        provinciaRepository.deleteById(id);
        return "borrada";
    }

    @GetMapping("/paises")
    public List<pais> getPaises() {
        return paisRepository.findAll();
    }


    @PostMapping("/paises")
    public void createPais(@RequestBody pais pais) {
        paisRepository.save(pais);
    }

    @DeleteMapping("/paises/{id}")
    public String deletePais(@PathVariable Long id) {
        paisRepository.deleteById(id);
        return " borrada";
    }


    @GetMapping("/franquicias")
    public List<franquicia> getFranquicia() {
        return franquiciaRepository.findAll();
    }

    @PostMapping("/franquicias")
    public void createFranquicia(@RequestBody franquicia franquicia) {
        franquiciaRepository.save(franquicia);
    }

    @DeleteMapping("/franquicias/{id}")
    public String deleteFranquicias(@PathVariable Long id) {
        ciudadRepository.deleteById(id);
        return "borrada";
    }



}