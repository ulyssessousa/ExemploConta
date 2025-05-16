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
        ContaCorrente conta1 = new ContaCorrente("2345-0",
                            "Banco Ludovicense", "1234", 150);
        
        System.out.println("Conta n. " + conta1.getNumero());
        System.out.println("Saldo: " + conta1.getSaldo());
        
        conta1.creditar(300);
        System.out.println("Após creditar 300 reais");
        System.out.println("Saldo: " + conta1.getSaldo());
    }
}
