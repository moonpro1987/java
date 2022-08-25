/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.erejerciciosabadoclase4;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el capital a consultar");
        double cap =sc.nextInt();
        int mes=0;
        double x=cap*3;
        double interes=cap*0.06;
        while (cap<x) {
            mes=mes+1;
            cap=cap+interes;
            
        }
        System.err.println("los meses para triplicar el capital son: "+mes);
    }
}
