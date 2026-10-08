/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherostextocoches;

import java.io.Serializable;

/**
 *
 * @author i5 nuevo
 */
public class Coche implements Serializable{
    private String marca;
    private String modelo;
    private int kms;

    public Coche(String marca, String modelo, int kms) {
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", kms=" + kms + '}';
    }
    
    
    
}
