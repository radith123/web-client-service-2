package com.webclient.alamat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "alamat", schema = "address")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alamat {
    @Id
    @Column(name = "alamat_id")
    Integer alamatId;

    @Column(name = "provinsi")
    String provinsi;

    @Column(name = "kota_kab")
    String kotaKab;

    @Column(name = "jalan")
    String jalan;
}
