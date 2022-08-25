/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase4sabado;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Clase4sabado {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el numero N de la serie");
        int n = sc.nextInt();
        double suma=0;//acumulador
        for(double i=1;i<=n;i++){
            if(i% 2 ==0){
                suma=suma-(1/i);                                             
            }
            else{
                suma=suma+(1/i);
            }
            
        }
        System.out.println("La suma de la serie es: "+suma);
    }
}
