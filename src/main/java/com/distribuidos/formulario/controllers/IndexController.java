package com.distribuidos.formulario.controllers;
import com.distribuidos.formulario.models.Formulary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired ValidationController validationController;

    @GetMapping(value = "/")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        //model.addObject("title", "Formulario");
        return model;
    }

    @GetMapping(value = "/validar/{id}")
    public ModelAndView validate(@PathVariable("id") String id) {
        System.out.println("Validando folio id: " + id);
        Formulary f = validationController.validateFormById(id);
        ModelAndView model = new ModelAndView("validacion");
        model.addObject("folio", id);
        model.addObject("form", f);
        return model;
    }

    @GetMapping(value = "/nuevo")
    public ModelAndView formPage() {
        ModelAndView model = new ModelAndView("formulario");
        //model.addObject("title", "Formulario");
        return model;
    }

}

