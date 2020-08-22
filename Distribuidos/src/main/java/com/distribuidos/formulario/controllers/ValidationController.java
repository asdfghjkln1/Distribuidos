package com.distribuidos.formulario.controllers;

import com.distribuidos.formulario.models.Formulary;
import com.distribuidos.formulario.services.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ValidationController {

    @Autowired
    ValidateService validateService;

    @GetMapping(value = "/validate/{id}")
    public Formulary validateFormById(@RequestParam("id") String id){
        Formulary f = this.validateService.viewForm(id);
        //Get current datetime
        LocalDateTime formExpirationDate = f.getExpirationTime();
        Boolean hasExpired = this.validateService.validate(formExpirationDate);
        if(hasExpired != f.getIs_valid()){
            f.setIs_valid(hasExpired);
            return this.validateService.updateForm(f);
        }else{
            return f;
        }
    }

    @GetMapping(value="/view/{id}")
    public Formulary view(@RequestParam("id") String id) {
        return this.validateService.viewForm(id);
    }
}
