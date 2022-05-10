package com.ufro.pa_mk.repository;


import com.ufro.pa_mk.model.usuarioCuenta;
import org.springframework.data.repository.CrudRepository;

public interface usuarioCuentaRepository extends CrudRepository<usuarioCuenta, Long> {

    Iterable<usuarioCuenta> findAllByIdOrderByFechaNacimientoAsc(int idUsuarioCuenta);
}
