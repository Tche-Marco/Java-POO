/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre Alves e Marco Antonio Martins
 */
public class mercado {
    private int codigo, estoque;
    private String Produto, Categoria;
    private double ValorCompra;
    
    public mercado(){}

    public mercado(int codigo, int estoque, String Produto, String Categoria, double ValorCompra) {
        this.codigo = codigo;
        this.estoque = estoque;
        this.Produto = Produto;
        this.Categoria = Categoria;
        this.ValorCompra = ValorCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }
    
    
    
    public double CalculaVenda(){
        return ValorCompra*1.2;
        
    }        
}
