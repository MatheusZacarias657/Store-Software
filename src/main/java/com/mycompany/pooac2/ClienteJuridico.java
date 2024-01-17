/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooac2;

public class ClienteJuridico extends Clientes {
    
    private int faturamento;
    
    public ClienteJuridico(String nome, String email, String documento, int faturamento) {
        super(nome, email, documento);
        this.faturamento = faturamento;
    }

    public int getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(int faturamento) {
        this.faturamento = faturamento;
    }
    
    public boolean verificaCNPJ (){
        if (super.getDocumento().length() != 14){
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean verificaEmail (){
        if (super.getEmail().indexOf("@") == -1){
            return false;
        }
        else {
            return true;
        }
    }
    
    public void imprimeDados (){
        System.out.println("Nome do Cliente: " + super.getNome());
        System.out.println("Email do Cliente: " + super.getEmail());
        System.out.println("CNPJ do Cliente: " + super.getDocumento());
        System.out.println("Dias para Faturamento de Pedido: " + this.faturamento);
    }
    
}
