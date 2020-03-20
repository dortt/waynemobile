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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.Size;

/**
 * Model para controle de Clientes
 * @version 1.0
 * @author Willians J. Dortt
 */
@Entity
public class client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Size(max=11)
    @Column(nullable = false, unique = true)
    private String cpf;

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Getters
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Setters
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
