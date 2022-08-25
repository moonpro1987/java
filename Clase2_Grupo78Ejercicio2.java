/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase2_grupo78ejercicio2;

import java.util.Scanner;

/**
 *
 * @author PATICO
 */
public class Clase2_Grupo78Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Por favor ingrese la base del rectangulo");
        double base = sc.nextDouble();
        System.out.println("Por favor ingrese la altura del rectangulo");
        double altura = sc.nextDouble();
        double perimetro = (base*2)+(altura*2);
        double area = (base*altura);
        System.out.println("el perimetro del rectangulo es "+perimetro);
        System.out.println("el area del rectangulo es "+area);
        
    }
}
