package com.distribuidos.formulario.controllers;

import com.distribuidos.formulario.models.Formulary;
import com.distribuidos.formulario.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class FormController {

    @Autowired
    FormService formService;

    @GetMapping(value="/all")
    public List<Formulary> view(){
        return this.formService.listForms();
    }

    @PostMapping(value="/create")
    public void create(@RequestBody Formulary form){
        OffsetDateTime date = OffsetDateTime.of(LocalDateTime.now(),ZoneOffset.of("-4"));
        LocalDateTime startDate = date.toLocalDateTime();
        LocalDateTime endDate = startDate.plusMinutes(30);
        form.setRequestTime(startDate);
        form.setExpirationTime(endDate);
        System.out.println("Data is: \n");
        System.out.println(form.toString());
        this.formService.newForm(form);
    }

    @GetMapping(value="/view/{id}")
    public Formulary view(@RequestParam("id") String id){
        return this.formService.viewForm(id);
    }
}
