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

import org.springframework.data.jpa.repository.JpaRepository;
import com.vivo.waynemobile.cdr;

/**
 * CDR: Bean de persistência do Spring
 * @version 1.0
 * @author Willians Joseph Dortt
 */
public interface cdrRepository extends JpaRepository<cdr, Long> {

}