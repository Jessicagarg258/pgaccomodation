package com.pgaccommodation.controller;

import com.pgaccommodation.entity.PgPlace;
import com.pgaccommodation.service.PgService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pg")
public class PgController {

    @Autowired
    private PgService service;

    @GetMapping("/{city}")
    public List<PgPlace> getByCity(@PathVariable("city") String city) {
        return service.getAvailableByCity(city);
    }

    @GetMapping("/locality/{locality}")
    public List<PgPlace> getByLocality(@PathVariable("locality") String locality) {
        return service.getAvailableByLocality(locality);
    }

    @GetMapping("/details/{id}")
    public PgPlace getDetails(@PathVariable Long id) {
        return service.getPgDetails(id);
    }

    @PostMapping("/add")
    public PgPlace addPg(@RequestBody PgPlace place) {
        return service.addPgPlace(place);
    }

    @PutMapping("/status/{id}")
    public PgPlace updateStatus(@PathVariable Long id, @RequestParam Boolean available) {
        return service.updateStatus(id, available);
    }
}