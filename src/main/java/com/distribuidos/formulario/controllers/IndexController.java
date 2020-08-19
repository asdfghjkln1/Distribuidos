package com.distribuidos.formulario.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping(value = "/")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        //model.addObject("title", "Formulario");
        return model;
    }

    @GetMapping(value = "/nuevo")
    public ModelAndView formPage() {
        ModelAndView model = new ModelAndView("formulario");
        //model.addObject("title", "Formulario");
        return model;
    }

}

