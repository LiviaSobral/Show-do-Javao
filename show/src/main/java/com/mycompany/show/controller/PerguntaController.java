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
    private static ArrayList<Pergunta> perguntas;
    
    public static Pergunta adicionar(String pergunta, String[] respostas, int correta){
        Pergunta perg = new Pergunta(correta,pergunta,respostas);
        perguntas.add(perg);
        return perg;
    }
    
    public static Pergunta selecionar(){
        int num = (int)(Math.random() * 10);
        Pergunta pergunta = perguntas.get(num);
        perguntas.remove(num);
        return pergunta;
    }
}
