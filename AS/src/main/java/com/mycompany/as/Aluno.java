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
public class Aluno extends Pessoa{

    public Aluno() {
    }

    public Aluno(int cod, String nome, boolean isAtivo) {
        super(cod, nome, isAtivo);
    }

    @Override
    public String situacao() {
        if(isIsAtivo()){return "O aluno "+this.getNome()+" está estudando conosco atualmente";}
        return "O aluno "+this.getNome()+" não estuda mais conosco";
    }

    @Override
    public String toString() {
        return "Aluno{" +super.toString()+ '}';
    }

    
    
}
