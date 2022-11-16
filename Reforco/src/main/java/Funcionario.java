/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
import java.util.ArrayList;

public abstract class Funcionario {
    private int codigo;
    private String cpf, nome;
    private ArrayList<Dependente> dependentes;

    public Funcionario() {
        dependentes = new ArrayList();
    }

    public Funcionario(int codigo, String cpf, String nome, ArrayList<Dependente> dependentes) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        dependentes = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void addDependente(Dependente dependente) {
    dependentes.add(dependente);
    
   /* @Override
    public String toString() {
    return "Funcionario{" + "codigo=" + codigo + ", cpf=" + cpf + ", nome="
    + nome + ", dependentes=" + dependentes + '}';
    }*/
    abstract double calculaSalario();
    }    
}
