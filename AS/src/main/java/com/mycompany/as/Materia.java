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
public class Materia {
    private int cod;
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList();

    public Materia() {
    }

    public Materia(int cod, String nome, Professor professor, Aluno aluno) {
        this.cod = cod;
        this.nome = nome;
        this.professor = professor;
        alunos.add(aluno);
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        alunos.add(aluno);        
    }

    @Override
    public String toString() {
        return "Materia{" + "cod = " + cod + ", nome = " + nome + ", professor = " + professor.getNome() + ", alunos = " + alunos + '}';
    }
    
    public int qtMateria(Materia m){        
        int qt=0;                
        for(Aluno a : m.getAlunos()){
            qt+=1;
        }      
        return qt;                
    }   
}
