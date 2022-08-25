package com.mycompany.futbol;

/**
 *
 * @author jos05
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int experiencia;

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Masajista(String titulacion, int experiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }
    
    
    
    @Override
    public void viajar() {
        System.out.println("Masajista viajando con el equipo");
    }

    @Override
    public void concentrarse() {
        System.out.println("Masajista en la concentración");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Masajista en ejercicios de estiramiento");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Masajista prestando asistencia");
    }
    
}
