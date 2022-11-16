/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre Alves e Marco Antonio Martins
 */
public class Vendas {
    private int codigo, quantidade;
    private String Produto;
    private double ValorItem;

    public Vendas() {
    }

    public Vendas(int codigo, int quantidade, String Produto, double ValorItem) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.Produto = Produto;
        this.ValorItem = ValorItem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public double getValorItem() {
        return ValorItem;
    }

    public void setValorItem(double ValorItem) {
        this.ValorItem = ValorItem;
    }

    public double CalculaItem(){
        return quantidade*ValorItem;
        
    }   
    
}
