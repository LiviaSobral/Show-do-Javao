/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show.controller;

import com.mycompany.show.model.User;



/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class UserController {
    
    
    
  public static void adicionarPontos(User user){
        user.setPontos(user.getPontos() + 10);        
    }
    public static void derrota(User user){
        user.setErro(true);        
    }
    
}
