package com.mycompany.futbol;

import java.util.Scanner;

public class Futbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Selección de futbol");
        
        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("Ingrese el id");
        int id = sc.nextInt();
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su apellido");
        String apellido = sc.next();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        
        System.out.println("Que desea crear");
        System.out.println("1. Futbolista");
        System.out.println("2. Entrenador");
        System.out.println("3. masajista");
        int opc = sc.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Ingrese numero dorsal");
                int num = sc.nextInt();
                System.out.println("Ingrese demarcación");
                String zona = sc.next();
                Futbolista f1 = new Futbolista(num,zona,id,nombre,apellido,edad);
                f1.concentrarse();
                f1.entrenamiento();
                f1.viajar();
                f1.partidoFutbol();
                break;
            case 2:
                System.out.println("Ingrese su id de la federación");
                int fed = sc.nextInt();
                Entrenador e1 = new Entrenador(fed,id,nombre,apellido,edad);
                e1.concentrarse();
                e1.entrenamiento();
                e1.viajar();
                e1.partidoFutbol();
                break;
            case 3:
                System.out.println("ingrese titulación");
                String titulo = sc.next();
                System.out.println("Ingrese los años de experiencia");
                int exp = sc.nextInt();
                Masajista m1 = new Masajista(titulo,exp,id,nombre,apellido,edad);
                m1.concentrarse();
                m1.entrenamiento();
                m1.viajar();
                m1.partidoFutbol();
                break;
            default:
                System.out.println("Opcion invalida");    
                break;
        }
    }
}
