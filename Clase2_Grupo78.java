/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase2_grupo78;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Clase2_Grupo78 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su codigo");
        int codigo=sc.nextInt();
        System.out.println("ingrese su nota1");
        double n1=sc.nextDouble();
        System.out.println("ingrese su nota2");
        double n2=sc.nextDouble();
        System.out.println("ingrese su nota3");
        double n3=sc.nextDouble();
        System.out.println("ingrese su nota4");
        double n4=sc.nextDouble();
        System.out.println("ingrese su nota5");
        double n5=sc.nextDouble();
        
        double promedio=(n1+n2+n3+n4+n5)/5;
        System.out.println("el codigo del estudiante es: "+codigo);
        System.out.println("el promedio del estudiante es: "+promedio);
        
        
       
    }
}
