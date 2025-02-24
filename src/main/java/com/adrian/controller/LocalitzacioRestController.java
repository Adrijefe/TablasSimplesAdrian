package com.adrian.controller;

import com.adrian.model.Ciudad;
import com.adrian.model.FRANQUICIA;
import com.adrian.model.PAIS;
import com.adrian.model.PROVINCIA;
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
        return "Ciudad borrada";
    }

    @GetMapping("/provincias")
    public List<PROVINCIA> getProvincias() {
        return provinciaRepository.findAll();
    }


    @PostMapping("/provincias")
    public void createProvincia(@RequestBody PROVINCIA provincia) {
        provinciaRepository.save(provincia);
    }

    @DeleteMapping("/provincias/{id}")
    public String deleteProvincias(@PathVariable Long id) {
        provinciaRepository.deleteById(id);
        return "Provincia borrada";
    }

    @GetMapping("/paises")
    public List<PAIS> getPaises() {
        return paisRepository.findAll();
    }


    @PostMapping("/paises")
    public void createPais(@RequestBody PAIS pais) {
        paisRepository.save(pais);
    }

    @DeleteMapping("/paises/{id}")
    public String deletePais(@PathVariable Long id) {
        paisRepository.deleteById(id);
        return "Pais borrada";
    }


    @GetMapping("/franquicias")
    public List<FRANQUICIA> getFranquicia() {
        return franquiciaRepository.findAll();
    }

    @PostMapping("/franquicias")
    public void createFranquicia(@RequestBody FRANQUICIA franquicia) {
        franquiciaRepository.save(franquicia);
    }

    @DeleteMapping("/franquicias/{id}")
    public String deleteFranquicias(@PathVariable Long id) {
        ciudadRepository.deleteById(id);
        return "Franquicia borrada";
    }



}