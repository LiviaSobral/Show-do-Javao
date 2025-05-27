/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show.controller;

import com.mycompany.show.model.Pergunta;
import java.util.ArrayList;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class PerguntaController {
    public static ArrayList<Pergunta> perguntas;
    
    public static Pergunta adicionar(String pergunta, String[] respostas, int correta){
        Pergunta perg = new Pergunta(correta,pergunta,respostas);
        perguntas.add(perg);
        return perg;
    }
}
