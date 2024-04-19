package com.webclient.alamat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.alamat.models.Alamat;
import com.webclient.alamat.services.AlamatService;

@RestController
@RequestMapping("/alamat")
public class AlamatController {
    AlamatService alamatService;

    @Autowired
    public AlamatController(AlamatService alamatService) {
        this.alamatService = alamatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alamat> getById(@PathVariable("id") Integer alamatId) {
        return ResponseEntity.ok(alamatService.getAlamat(alamatId));
    }

    @PostMapping
    public ResponseEntity<Alamat> addData(@RequestBody Alamat alamat) {
        return ResponseEntity.ok(alamatService.addAlamat(alamat));
    }
}
