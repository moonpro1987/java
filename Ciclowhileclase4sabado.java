/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ciclowhileclase4sabado;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Ciclowhileclase4sabado {
    //el ciclo while depende de una condicion en el parentesis
    //mientras la condicion se cumpla repita
    //solo termina el ciclo co¿uando la condicion ya no se cumple
    //debemos asegurarnos de que haya un momento en el que no se cumpla 
    //la condicion para romper el ciclo

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("ingrese el monto del gasto");
        int num=sc.nextInt();
        int suma=0;
        //el programa debe registrar todos los gastos de un viaje(acumular)
        //debe terminarse cuando el usuario ingrese 0 y debe decir 
        //cual fue el gasto total
        
        while(num>0){
            suma=suma+num;  
            System.out.println("Ingrese el monto del gasto");
            num=sc.nextInt();
            
        }
        System.out.println("el total de gastos es: "+suma);
    }
}
