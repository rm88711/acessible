package com.alura.acessible.controller.web;


import com.alura.acessible.model.LocalAcessilidade;
import com.alura.acessible.services.LocalAcessilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/localacessilidade")
public class LocalAcessilidadeWebController {
    @Autowired
    LocalAcessilidadeService services;

    @GetMapping()
    public String index(){
        return "localacessilidade/index";
    }
//    @RequestMapping()
//    public String home() {
//        return "Hello Docker World";
//    }
    @GetMapping("new")
    public String form(LocalAcessilidade localAcessilidade){
        return "localacessilidade/form";
    }

    @PostMapping
    public String create(LocalAcessilidade localAcessilidade, BindingResult binding, RedirectAttributes redirect){
        if(binding.hasErrors()) return "localacessilidade/form";
        String mensagem = (localAcessilidade.getIdLocal() == null) ? "Cadastro Realizado" : "Cadastro alterado";
        services.save(localAcessilidade);
        redirect.addFlashAttribute("message",mensagem);
        return "redirect:/localacessilidade";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect){
        services.deleteById(id);
        redirect.addFlashAttribute("message","Cadastro apagado com sucesso");
        return "redirect:/localacessilidade";
    }
    @GetMapping("{id}")
    public ModelAndView edit(@PathVariable Long id){
        var localAcessilidade = services.get(id);
        return new ModelAndView("localacessilidade/form").addObject("local", localAcessilidade.get());
    }

    @GetMapping("listalocais/{tipo}")
    public ModelAndView listaLocal(@PathVariable String tipo){
        System.out.println("LOLOLOLOLO "+ tipo);
        ModelAndView mv =  new ModelAndView("/localacessilidade/listalocais");


        mv.addObject("localacessilidade",services.listTips(tipo));

        return mv;
    }
}
