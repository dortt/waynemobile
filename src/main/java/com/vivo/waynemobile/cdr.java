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

/**
 * Model para controle de CDR
 * @version 1.0
 * @author Willians J. Dortt
 */
@Entity
public class cdr {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String action;

    @Column(nullable = false)
    private String address;

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Getters
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public Long getId() {
        return id;
    }

    public String getAction() {
        return action;
    }

    public String getAddress() {
        return address;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Setters
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public void setId(Long id) {
        this.id = id;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
