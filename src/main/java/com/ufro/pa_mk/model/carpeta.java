package com.ufro.pa_mk.model;


import javax.persistence.*;

@Entity
@Table(name = "carpeta")

public class carpeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCarpeta", nullable = false)
    private Long idCarpeta;

    @Column(name = "nombreCarpeta", nullable = false, length = 120)
    private String nombreCarpeta;


    public Long getIdCarpeta() {
        return idCarpeta;
    }

    public void setIdCarpeta(Long idCarpeta) {
        this.idCarpeta = idCarpeta;
    }

    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }
}
