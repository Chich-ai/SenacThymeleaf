package com.senac.SenacTeste;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController {

    @GetMapping("/")
    public String inicial(Model model){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Niko"));
        pessoas.add(new Pessoa("Tramontina"));
        pessoas.add(new Pessoa("Avila"));
        pessoas.add(new Pessoa("Chai"));
        pessoas.add(new Pessoa("Alysson"));

        model.addAttribute("pessoas", model)
        return "index";
    }

    public String adicionaPessoas(String nome){
        if (nome != null && !nome.isEmpty()){

        }

        return "";
    }
}
