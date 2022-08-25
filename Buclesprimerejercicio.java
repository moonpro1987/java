/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buclesprimerejercicio;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Buclesprimerejercicio {
    
    //en el ciclo for sé cuantas veces se va a ejecutar algo

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        //for tiene tres parametros en la configuracion
        //1er valor inicial ;valor final;incremento
        //para esto debe existir una variable que controla el ciclo
        //variable de control siempre es i=0; valor finali<=10;incremento i++(i=i+1)
        System.out.println("ingrese el valor N debe ser entero positivo");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){            
            System.out.println(i);
            
            
        }
    }
}
