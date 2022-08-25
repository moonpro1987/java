/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Reto1 {

    public static void main(String[] args) {
        //crear objeto scanner para introducir variables por teclado
        Scanner sc=new Scanner (System.in);
        //declaracion de variables
        int N;
        long numeroCuenta;
        String fechaApertura;
        int tipoCuenta;
        double saldoCuenta;
        double valorInteres;
        double totalIntereses=0;
        double totalSaldos=0;
        
        System.out.println("Ingrese el numero de cuentas a consultar");
        N= sc.nextInt();
      
        
        for(int i=0;i<N;i++){
            System.out.println("Ingrese el numero de la cuenta");
            numeroCuenta=sc.nextLong();
            
            System.out.println("Ingrese la fecha de apertura");
            fechaApertura=sc.next();
            
            System.out.println("Ingrese el tipo de cuenta");
            tipoCuenta=sc.nextInt();
            
            System.out.println("Ingrese el saldo de la cuenta");
            saldoCuenta=sc.nextDouble();
            
            switch(tipoCuenta){
                case 1:valorInteres=saldoCuenta*1.5/100;break;
                case 2:valorInteres=saldoCuenta*1.7/100;break;
                case 3:valorInteres=saldoCuenta*1.6/100;break;  
                default:valorInteres=0;
                    
            }
            saldoCuenta+=valorInteres;
            totalIntereses+=valorInteres;
            totalSaldos+=saldoCuenta;
            
            System.out.println(numeroCuenta);
            System.out.println(valorInteres);
            System.out.println(saldoCuenta);
        }
        System.out.println(totalIntereses);
        System.out.println(totalSaldos);
        
    
        
        
        
        
        
    }
}
