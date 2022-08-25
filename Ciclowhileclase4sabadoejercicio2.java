/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ciclowhileclase4sabadoejercicio2;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Ciclowhileclase4sabadoejercicio2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el numero par");
        int num=sc.nextInt();
        int suma=0;
        //el programa debe recibir numeros pares y los vaya sumando
        //pero si el usuario ingresa un numero impar el programa 
        //termina y me dice la suma de los numeros ingresados es: 
        while(num%2==0){
            suma=suma+num;  
            System.out.println("Ingrese el numero par");
            num=sc.nextInt();
            
        }
        System.out.println("la suma de los numeros pares es: "+suma);
    }
}
