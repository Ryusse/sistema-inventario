/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preproyecto;

/**
 *
 * @author Orlan
 */
public class Terreno extends productoInmobiliarios implements anyfunctions{

    public Terreno() {
    }
    
    public double descuento(){
        return getPrecio()*2;
    }

}
