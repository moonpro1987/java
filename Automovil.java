/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.automovil;

import java.security.AuthProvider;

/**
 *
 * @author PATICO
 */
public class Automovil {
    
    private String marca;
    private int modelo;
    private int kilometros;
    private String color;

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
    public Automovil(String marca){
        this.marca = marca;
        this.color = "negro";
        this.kilometros = 0;
        this.modelo = 1900;
    }
    public Automovil(String marca, int mod){
        this.marca=marca;
        this.modelo = mod;
        this.color= "negro";
        this.kilometros=0;
    }
    public Automovil(String marca,String color, int km,int mod){
        
    }

    public Automovil(String marca, int modelo, int kilometros, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.color = color;
    }
    
        
    }

