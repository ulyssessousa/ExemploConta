/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma307.exemploconta;

/**
 *
 * @author ulyss
 */
public class ContaCorrente {
    //atributos
    private String numero;
    private String banco;
    private String agencia;
    private double saldo;
    
    public ContaCorrente(String numero, String banco,
                            String agencia, double saldo){
        this.numero = numero;
        this.banco = banco;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getBanco(){
        return banco;
    }
    
    public String getAgencia(){
        return agencia;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }
    
    public void creditar(double valor){
        saldo = saldo + valor;
    }
    
    public void debitar(double valor){
        saldo = saldo - valor;
    }
}
