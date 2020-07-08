package com.distribuidos.formulario.controllers;

import com.distribuidos.formulario.models.Formulary;
import com.distribuidos.formulario.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormController {

    @Autowired
    FormService formService;

    @GetMapping(value="/all")
    public List<Formulary> view(){
        return this.formService.listForms();
    }

    @PostMapping(value="/create")
    public void create(@RequestBody Formulary form){
        this.formService.newForm(form);
    }

    @GetMapping(value="/view/{id}")
    public Formulary view(@RequestParam("id") String id){
        return this.formService.viewForm(id);
    }
}
