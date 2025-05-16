/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.turma307.exemploconta;

/**
 *
 * @author ulyss
 */
public class ExemploConta {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.numero = "2345-0";
        conta1.banco = "Banco Ludovicense";
        conta1.agencia = "1234";
        conta1.saldo = 150;
        System.out.println("Conta n. " + conta1.numero);
        System.out.println("Saldo: " + conta1.saldo);
        
        conta1.creditar(300);
        System.out.println("Após creditar 300 reais");
        System.out.println("Saldo: " + conta1.saldo);
    }
}
