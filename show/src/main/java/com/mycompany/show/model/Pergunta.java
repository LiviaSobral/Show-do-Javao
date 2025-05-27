/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.show.model;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Pergunta {
    int opção;
    String pergunta;
    String[] respostas;

    public Pergunta(int opção, String pergunta, String[] respostas) {
        this.opção = opção;
        this.pergunta = pergunta;
        this.respostas = respostas;
    }

    public int getOpção() {
        return opção;
    }

    public void setOpção(int opção) {
        this.opção = opção;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }
    
}
