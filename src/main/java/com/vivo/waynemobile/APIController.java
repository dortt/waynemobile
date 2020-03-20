/*
 -----------------------------------------------------------------------------------------

 8b      db      d8 ,adPPYYba, 8b       d8 8b,dPPYba,   ,adPPYba,   |   88,dPYba,,adPYba,
 `8b    d88b    d8' ""     `Y8 `8b     d8' 88P'   `"8a a8P_____88   |   88P'   "88"    "8a
  `8b  d8'`8b  d8'  ,adPPPPP88  `8b   d8'  88       88 8PP"""""""   |   88      88      88
   `8bd8'  `8bd8'   88,    ,88   `8b,d8'   88       88 "8b,   ,aa   |   88      88      88
     YP      YP     `"8bbdP"Y8     Y88'    88       88  `"Ybbd8"'   |   88      88      88
                                   d8'
                                  d8'

 -----------------------------------------------------------------------------------------
                                                                              Wayne Mobile
 -----------------------------------------------------------------------------------------
 */

package com.vivo.waynemobile;

import utilities.CPF;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * API para gestão de CDR e cadastro de Clientes
 * @version 1.0
 * @author Willians Joseph Dortt
 */
@RestController
@RequestMapping(path = "/api")
public class APIController {

    @Autowired
    private cdrRepository cdrRepository;

    @Autowired
    private clientRepository clientRepository;

    @PostMapping(path = "/cdr/create")
    public cdr createCDR(@Valid @RequestBody cdr cdr) {
        return cdrRepository.save(cdr);
    }

    @ResponseBody
    @DeleteMapping(path = "/cdr/delete/{id}", produces = "application/json")
    public String deleteCDR(@PathVariable Long id) {
        cdrRepository.deleteById(id);
        return "{\"deleted\": true}";
    }

    @PostMapping(path = "/client/create")
    public client createClient(@Valid @RequestBody client client) {
        if (CPF.validate(client.getCpf())) {
            return clientRepository.save(client);
        } else {
            throw new IllegalArgumentException("Número de CPF inválido");
        }
    }
}
