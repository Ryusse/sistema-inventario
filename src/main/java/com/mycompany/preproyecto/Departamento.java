/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preproyecto;

/**
 *
 * @author Orlan
 */
public class Departamento extends productoInmobiliarios{
    int nC, piso, nB;
    String desc, numero;

    public Departamento() {
    }

    public int getnC() {
        return nC;
    }

    public void setnC(int nC) {
        this.nC = nC;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return super.toString() + "Departamento{" + "nC=" + nC + ", piso=" + piso + ", nB=" + nB + ", numero=" + numero + ", desc=" + desc + '}';
    }
    
    
    
}
