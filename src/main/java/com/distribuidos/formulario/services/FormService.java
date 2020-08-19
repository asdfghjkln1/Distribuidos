package com.distribuidos.formulario.services;

import com.distribuidos.formulario.models.Formulary;
import com.distribuidos.formulario.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    @Autowired
    FormRepository formRepository;

    public List<Formulary> listForms(){
        return formRepository.findAll();
    }

    public void newForm(Formulary form){  this.formRepository.save(form); }

    public Formulary viewForm(String id){
        return this.formRepository.findById(id).get();
    }


}
