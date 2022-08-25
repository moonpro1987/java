/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasetres_masejerciciosanidado;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Clasetres_masejerciciosanidado {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Ingrese la variable debe ser un numero entero ");
        int X =sc.nextInt();
        int Y;
        
        if(X<0){
            Y=(100*X);
            System.out.println("la funcion y es igual a 100*x =;"+Y);
        }
        else if (X>=0 & X<3) {
            Y=(2*X + 5);
            System.out.println("la funcion y es iagual a 2*x+5 = "+Y);            
        }
        else if (X>=3 & X<=6) {
            Y=(100/X);
            System.out.println("la funcion Y es igual a 100/x ="+Y);          
        }
        else{
            System.out.println("la funcion Y es igual a 0");
        }
        
        
    }
}
