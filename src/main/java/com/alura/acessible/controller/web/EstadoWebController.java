package com.alura.acessible.controller.web;


import com.alura.acessible.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/estado")
public class EstadoWebController {
    @Autowired
    EstadoService services;

    @GetMapping
    public ModelAndView index(){
        ModelAndView mv =  new ModelAndView("/estado/index");
        mv.addObject("estado",services.listAll());
        return mv;
    }
}
