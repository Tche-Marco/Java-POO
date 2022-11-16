/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reforcopoo;

/**
 *
 * @author Marco, Eduardo
 */
public class Quadro {
    private int codigo;
    private String artista, titulo, tecPint;
    private double valorArtistaRecebe;    
    
    public Quadro(int codigo, String artista, String titulo, String tecPint, double valorArtistaRecebe){ /*CRIAR UM NOVO QUADRO*/
        this.codigo = codigo;
        this.artista = artista;
        this.titulo = titulo;
        this.tecPint = tecPint;
        this.valorArtistaRecebe = valorArtistaRecebe;       
    }
    
    public int getCodigo(){
    return codigo;}
    
    public String getArtista(){
    return artista;}
    
    public String getTitulo(){
    return titulo;}
    
    public String getTecPint(){
    return tecPint;}
    
    public double getValorArtista(){
    return valorArtistaRecebe;}
    
    public void setCodigo(int cod){
        this.codigo = cod;}
    
    public void setArtista(String novoArt){
        this.artista = novoArt;}
    
   public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;}
   
   public void setTecPint(String novaTecPint){
       this.tecPint = novaTecPint;}
   
    public void setValorArtistaRecebe(double valor){
        this.valorArtistaRecebe = valor;}
   
    public double calculaValorVenda(double valorArtista){ /*QUAL O MELHOR? versão 1*/
        return valorArtista * 1.5;} 
    
    public double calculaValorVenda(){ /*QUAL O MELHOR? versão 2*/
        return this.valorArtistaRecebe * 1.5;}
}
