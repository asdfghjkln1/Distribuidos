package com.distribuidos.formulario.services;

import com.distribuidos.formulario.models.Formulary;
import com.distribuidos.formulario.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Service
public class FormService {

    @Autowired
    FormRepository formRepository;

    public List<Formulary> listForms(){
        return formRepository.findAll();
    }

    public Formulary newForm(Formulary form){
        return this.formRepository.save(form);
    }


}
