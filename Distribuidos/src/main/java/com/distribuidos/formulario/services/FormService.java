package com.distribuidos.formulario.services;

import com.distribuidos.formulario.models.Formulary;
import com.distribuidos.formulario.repositories.FormRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public String newForm(Formulary form){
        Formulary f = this.formRepository.save(form);
        System.out.println(f.getId());
        return f.getId();
    }

    public Formulary updateForm(Formulary form){
        return this.formRepository.save(form);
    }

    public Boolean validate(LocalDateTime formDate){
        OffsetDateTime dateOffset = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("-4"));
        LocalDateTime now = dateOffset.toLocalDateTime();
        return formDate.isAfter(now);
    }


    public Formulary viewForm(String id){
        return this.formRepository.findById(id).get();
    }


}
