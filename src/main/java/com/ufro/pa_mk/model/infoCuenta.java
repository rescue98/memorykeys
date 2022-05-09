package com.ufro.pa_mk.model;

import javax.persistence.*;


@Entity
@Table(name = "infodeCuenta")
public class infoCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInfoCuenta", nullable = false)
    private Long idInfoCuenta;

    @Column(name = "nombreCuenta", nullable = false, length = 120)
    private String nombreCuenta;

    @Column(name = "correoCuenta", nullable = false, length = 255)
    private String correoCuenta;

    @Column(name = "infoAdicional", nullable = false, length = 400)
    private String infoAdicional;

    @Column(name = "infoContrasena", nullable = false, length = 255)
    private String infoContrasena;


    public infoCuenta(){

    }

    public Long getIdInfoCuenta() {
        return idInfoCuenta;
    }

    public void setIdInfoCuenta(Long idInfoCuenta) {
        this.idInfoCuenta = idInfoCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getCorreoCuenta() {
        return correoCuenta;
    }

    public void setCorreoCuenta(String correoCuenta) {
        this.correoCuenta = correoCuenta;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public String getInfoContrasena() {
        return infoContrasena;
    }

    public void setInfoContrasena(String infoContrasena) {
        this.infoContrasena = infoContrasena;
    }
}

