package com.webclient.alamat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.webclient.alamat.models.Alamat;
import com.webclient.alamat.repositories.AlamatRepo;

@Service
public class AlamatService {
    AlamatRepo alamatRepo;

    @Autowired
    public AlamatService(AlamatRepo alamatRepo) {
        this.alamatRepo = alamatRepo;
    }

    public Alamat getAlamat(Integer id) {
        return alamatRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "not found"));
    }

    public Alamat addAlamat(Alamat alamat) {
        return alamatRepo.save(alamat);
    }
}
