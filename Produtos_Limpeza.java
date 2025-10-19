/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produtos_limpeza;

import java.util.Scanner;


public class Produtos_Limpeza {

    public static void main(String[] args) {
        System.out.println("Olá!");
        
       Scanner sc = new Scanner(System.in);

        double[] precos = new double[4];
        double total = 0;

        for(int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i+1) + ": ");
            precos[i] = sc.nextDouble();
        }

        for(int i = 0; i < precos.length; i++) {
            total = total + precos[i];
        }

        System.out.println("Total da compra: R$ " + total);
    }
}
