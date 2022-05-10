package com.ufro.pa_mk.model;


import javax.persistence.*;

@Entity

public class carpeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCarpeta", nullable = false)
    private Long id;


    @Column(name = "nombreCarpeta", nullable = false, length = 120)
    private String nombreCarpeta;

    @ManyToOne
    @JoinColumn(name = "idUsuarioCuenta")
    private usuarioCuenta usuarioCuenta;



    public Long getIdCarpeta() {
        return id;
    }

    public void setIdCarpeta(Long idCarpeta) {
        this.id = idCarpeta;
    }

    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }
}
