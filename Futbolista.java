package com.mycompany.futbol;

/**
 *
 * @author jos05
 */
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
    }
    
    
    @Override
    public void viajar() {
        System.out.println("Furbolista viajando");
    }

    @Override
    public void concentrarse() {
        System.out.println("Futbolista en la concentración");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Futbolista entrenando");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Futbolista jugando partido");
    }
    
}
