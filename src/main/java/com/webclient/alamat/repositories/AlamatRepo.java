package com.webclient.alamat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webclient.alamat.models.Alamat;

@Repository
public interface AlamatRepo extends JpaRepository<Alamat, Integer> {

}
