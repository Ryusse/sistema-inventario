/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preproyecto;

/**
 *
 * @author Orlan
 */
public class Casa extends productoInmobiliarios{
     int nC, pisos, nB;
     String numero;

    public Casa() {
    }

    public int getnC() {
        return nC;
    }

    public void setnC(int nC) {
        this.nC = nC;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getnB() {
        return nB;
    }

    public void setnB(int nB) {
        this.nB = nB;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "Casa{" + "nC=" + nC + ", pisos=" + pisos + ", nB=" + nB + ", numero=" + numero + '}';
    }
     
     
     
}
