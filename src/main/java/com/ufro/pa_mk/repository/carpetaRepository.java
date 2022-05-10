package com.ufro.pa_mk.repository;

import com.ufro.pa_mk.model.carpeta;
import org.springframework.data.repository.CrudRepository;

public interface carpetaRepository extends CrudRepository<carpeta,Long>{


    carpeta findCarpetaByNombreCarpeta(String nombreCarpeta);


}
