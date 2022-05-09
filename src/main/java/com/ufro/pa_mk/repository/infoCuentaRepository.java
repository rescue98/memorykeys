package com.ufro.pa_mk.repository;

import com.ufro.pa_mk.model.infoCuenta;
import org.springframework.data.repository.CrudRepository;


public interface infoCuentaRepository extends CrudRepository<infoCuenta, Integer>{

    Iterable<infoCuenta> findAllByIdOrderByDateAsc(int idInfoCuenta);

}
