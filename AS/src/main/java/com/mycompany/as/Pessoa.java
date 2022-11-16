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
public abstract class Pessoa {
    private int cod;
    private String nome;
    private boolean isAtivo;

    public Pessoa() {
    }

    public Pessoa(int cod, String nome, boolean isAtivo) {
        this.cod = cod;
        this.nome = nome;
        this.isAtivo = isAtivo;
    }
    

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(boolean isAtivo) {
        this.isAtivo = isAtivo;
    }

    
    @Override
    public String toString() {
        return "cod=" + cod + ", nome=" + nome + ", isAtivo=" + isAtivo;
    }    
     
    public abstract String situacao();    
}
