package com.crud_bigliettera.controller;


import com.crud_bigliettera.model.Utente;
import com.crud_bigliettera.repository.UtenteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/utente")
public class UtenteController {

    @GetMapping("/selezionaUtenti")
    public List<Utente> getUtenti(){
        return UtenteRepository.selezionaUtente();
    }

}
