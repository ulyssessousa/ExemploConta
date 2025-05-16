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
    String numero;
    String banco;
    String agencia;
    double saldo;
    
    void creditar(double valor){
        saldo = saldo + valor;
    }
    
    void debitar(double valor){
        saldo = saldo - valor;
    }
}
