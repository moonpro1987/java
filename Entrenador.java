package com.mycompany.futbol;

/**
 *
 * @author jos05
 */
public class Entrenador extends SeleccionFutbol {

    private int id_federacion;

    public int getId_federacion() {
        return id_federacion;
    }

    public void setId_federacion(int id_federacion) {
        this.id_federacion = id_federacion;
    }

    public Entrenador(int id_federacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.id_federacion = id_federacion;
    }
    
    @Override
    public void viajar() {
        System.out.println("Entrenador viajando");
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador en concentración");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Entrenador orientando un entrenamiento");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Entrenador orientando un partido de futbol");
    }
    
}
