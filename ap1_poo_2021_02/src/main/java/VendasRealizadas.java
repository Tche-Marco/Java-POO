/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre Alves e Marco Antonio Martins
 */
public class VendasRealizadas {
    private int cupom;
    private double ValorCupom;
    private String FormaPagamento;

    public VendasRealizadas(){
    
    }

    public VendasRealizadas(int cupom, double ValorCupom, String FormaPagamento) {
        this.cupom = cupom;
        this.ValorCupom = ValorCupom;
        this.FormaPagamento = FormaPagamento;
    }

    public int getCupom() {
        return cupom;
    }

    public void setCupom(int cupom) {
        this.cupom = cupom;
    }

    public double getValorCupom() {
        return ValorCupom;
    }

    public void setValorCupom(double ValorCupom) {
        this.ValorCupom = ValorCupom;
    }

    public String getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(String FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
    }
    
    
}



