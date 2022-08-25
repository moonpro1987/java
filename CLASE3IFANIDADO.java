/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase3ifanidado;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class CLASE3IFANIDADO {

    public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
        System.out.println("Ingrese el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int n3 = sc.nextInt();

        if(n1==n2){
            if(n2==n3){
                System.out.println("Los numeros son iguales");
            }
        }else if(n1>n2){
            if(n1>n3){
                System.out.println("El numero mayor es "+n1);
            }else{
                System.out.println("El numero mayor es "+n3);
            }
        }else if(n2>n3){
            System.out.println("El numero mayor es "+n2);
        }else{
            System.out.println("El numero mayor es "+n3);
        }
        
        
            
        }
    }
