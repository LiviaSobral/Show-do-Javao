/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show.controller;

import com.mycompany.show.model.Pergunta;
import com.mycompany.show.model.User;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class PerguntaController {
    private static ArrayList<Pergunta> perguntas = new ArrayList<>();
    private static int numero = 0;
    
    public static Pergunta adicionar(String pergunta, String[] respostas, int correta){
        Pergunta perg = new Pergunta(correta,pergunta,respostas);
        perguntas.add(perg);
        return perg;
    }
    
    public static Pergunta selecionar(){   
        Pergunta pergunta = perguntas.get(numero);
        if(numero < 10){            
            numero ++;
        }else{
            return null;
        }        
        return pergunta;
    }
}
