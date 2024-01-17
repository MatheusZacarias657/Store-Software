/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooac2;

public class ClienteFisico extends Clientes {
    
    private int maxParcelas;

    public ClienteFisico(String nome, String email, String documento, int parcelas) {
        super(nome, email, documento);
        this.maxParcelas = parcelas;
    }
    
    public int getMaxParcelas() {
        return maxParcelas;
    }

    public void setMaxParcelas(int maxParcelas) {
        this.maxParcelas = maxParcelas;
    }
    
    public boolean verificaCPF (){
        if (super.getDocumento().length() != 11){
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
        System.out.println("CPF do Cliente: " + super.getDocumento());
        System.out.println("Máximo de Parcelas Permitidas: " + this.maxParcelas);
    }
}
