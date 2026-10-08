/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudpersona;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Alumno {
    private String nombre;
    private int edad;
    private double notaAD;
    private boolean repetidor;

    public Alumno(String nombre, int edad, double notaAD, boolean repetidor) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaAD = notaAD;
        this.repetidor = repetidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaAD() {
        return notaAD;
    }

    public void setNotaAD(double notaAD) {
        this.notaAD = notaAD;
    }

    public boolean isRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notaAD=" + notaAD + ", repetidor=" + repetidor + '}';
    }
    
    
    
}
