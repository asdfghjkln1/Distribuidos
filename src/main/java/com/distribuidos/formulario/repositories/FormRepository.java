package com.distribuidos.formulario.repositories;

import com.distribuidos.formulario.models.Formulary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends MongoRepository<Formulary, String> {

    //@Override
    //public Formulary findById(Long id);
}
