/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.as;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Notas {
    private int cod;
    private Double nota;
    private Materia materia;
    private Aluno aluno;
    private ArrayList<String> historico = new ArrayList();

    public Notas() {
    }

    public Notas(int cod, Double nota, Materia materia, Aluno aluno, String hist) {
        this.cod = cod;
        this.nota = nota;
        this.materia = materia;
        this.aluno = aluno;
        historico.add("Nota ("+ nota +") adicionada pelo professor "+hist);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota, String hist) {
        this.nota = nota;
        historico.add("Nota ("+ nota +") alterada pelo professor "+hist);
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }
    
    @Override
    public String toString() {
        return "Nota{" + "cod = " + cod + ", nota = " + nota + ", materia = " + materia.getNome() + ", aluno = " + aluno.getNome() + '}';
    }
    
    public boolean isaprovado(){
        return this.getNota() >= 7;
        } 
    
}
