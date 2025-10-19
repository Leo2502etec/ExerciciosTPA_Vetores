/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sabores_de_suco;

import java.util.Scanner;

public class Sabores_De_Suco {

    public static void main(String[] args) {
        System.out.println("Olá!");
        
        Scanner sc = new Scanner(System.in);

        String[] sabores = new String[3];

        for(int i = 0; i < 3; i++) {
            System.out.print("Digite o sabor " + (i+1) + ": ");
            sabores[i] = sc.next();
        }

        System.out.println("Sabores de suco preferidos");
        for(int i = 0; i < 3; i++) {
            System.out.println(sabores[i]);
        }
    }
}

   
   
