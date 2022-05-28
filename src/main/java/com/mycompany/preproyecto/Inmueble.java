/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preproyecto;

/**
 *
 * @author Orlan
 */
public class Inmueble {
    private String id, ciudad, distrito, descripcion;
    private double areaT, precio;
    private int cDormitorios;

    public Inmueble() {
    }
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getAreaT() {
        return areaT;
    }

    public void setAreaT(double areaT) {
        this.areaT = areaT;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getcDormitorios() {
        return cDormitorios;
    }

    public void setcDormitorios(int cDormitorios) {
        this.cDormitorios = cDormitorios;
    }

    
    
    
}
