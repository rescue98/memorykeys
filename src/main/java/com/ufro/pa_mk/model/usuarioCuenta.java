package com.ufro.pa_mk.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class usuarioCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarioCuenta", nullable = false)
    private Long id;


    @Column(name = "correo", nullable = false, length = 20)
    private String correo;

    @Column(name = "contrasenia", nullable = false, length = 20)
    private String contrasenia;

    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 20)
    private String apellido;

    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;

    @Column(name = "fechaNacimiento", nullable = false, length = 10)
    private Date fechaNacimiento;


    public Long getIdUsuarioCuenta() {
        return id;
    }

    public void setIdUsuarioCuenta(Long idUsuarioCuenta) {
        this.id = idUsuarioCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public usuarioCuenta(){

    }
}
