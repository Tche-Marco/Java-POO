/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.as;

/**
 *
 * @author marco
 */
public class Professor extends Pessoa {

    public Professor() {
    }

    public Professor(int cod, String nome, boolean isAtivo) {
        super(cod, nome, isAtivo);
    }

    
    @Override
    public String situacao() {
        if(isIsAtivo()){return "O professor "+this.getNome()+" está trabalhando conosco atualmente";}
        return "O professor "+this.getNome()+" não trabalha mais conosco";
    }

    @Override
    public String toString() {
        return "Professor{" +super.toString()+ '}';
    }    
    
}
