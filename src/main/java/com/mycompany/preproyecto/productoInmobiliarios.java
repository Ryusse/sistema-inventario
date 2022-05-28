
package com.mycompany.preproyecto;


public abstract class productoInmobiliarios {
    private String  direccion, id;
    private double areaT, areaC, precio;

    public productoInmobiliarios() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAreaT() {
        return areaT;
    }

    public void setAreaT(double areaT) {
        this.areaT = areaT;
    }

    public double getAreaC() {
        return areaC;
    }

    public void setAreaC(double areaC) {
        this.areaC = areaC;
    }

    @Override
    public String toString() {
        return "productoInmobiliarios{" + "direccion=" + direccion + ", id=" + id + ", areaT=" + areaT + ", areaC=" + areaC + ", precio=" + precio + '}';
    }

    
    
    
    
    
}
