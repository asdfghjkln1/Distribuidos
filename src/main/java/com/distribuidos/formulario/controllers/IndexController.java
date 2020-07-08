package com.distribuidos.formulario.controllers;
import org.springframework.web.bind.annotation.*;


@RestController
public class IndexController {

    @GetMapping(value = "/")
    public String test() {
        return "info";
    }

}

