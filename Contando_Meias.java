/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contando_meias;

import java.util.Scanner;


public class Contando_Meias {

    public static void main(String[] args) {
        System.out.println("Olá!");
        
       Scanner sc = new Scanner(System.in);

        int[] gavetas = new int[5];
        int total = 0;

        for(int i = 0; i < gavetas.length; i++) {
            System.out.print("Digite a quantidade de meias da gaveta " + (i+1) + ": ");
            gavetas[i] = sc.nextInt();
        }
        for(int i = 0; i < gavetas.length; i++) {
            total = total + gavetas[i];
        }
        System.out.println("Total de meias: " + total);
    }
}
