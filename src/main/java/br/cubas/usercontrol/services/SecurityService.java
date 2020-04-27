/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cubas.usercontrol.services;

import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Mateus
 */
public interface SecurityService {
    
   String findLoggedInUsername();
   UserDetails findLoggedInUser();
   void login(String username, String password);

}
