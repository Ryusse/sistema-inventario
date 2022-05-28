/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Orlan
 */
public class Principal {
    public static void main(String[] args) {
        String tipo;
        tipo = JOptionPane.showInputDialog("Ingresa tipo de producto inmobiliairio: ");
        
        Ejecutivo eje = new Ejecutivo();
        eje.setCod(JOptionPane.showInputDialog("Ingresa tu cod"));
        eje.setNom(JOptionPane.showInputDialog("Ingresa nombre: "));
        eje.setX(JOptionPane.showInputDialog("Ingresa lo que sea: "));
        eje.setPass(JOptionPane.showInputDialog("Ingresa contra: "));
        if(eje.getPass().compareTo("1234")==0){
            todo(tipo);
        }

        
    }
    
    public static void todo(String tipo){
        if(tipo.compareTo("depa")==0){
            Departamento dp = new Departamento();
            dp.setDireccion(JOptionPane.showInputDialog("Ingresa direccion: "));
            dp.setId(JOptionPane.showInputDialog("Ingresa ID: "));
            dp.setAreaT(Double.parseDouble(JOptionPane.showInputDialog("Ingresa area total: ")));
            dp.setAreaC(Double.parseDouble(JOptionPane.showInputDialog("Ingresa area construida: ")));
            dp.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingresa precio: ")));
            dp.setnC(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero cuartos: ")));
            dp.setPiso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de piso: ")));
            dp.setnB(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero baños: ")));
            dp.setDesc(JOptionPane.showInputDialog("Ingresa descripcion: "));
            dp.setNumero(JOptionPane.showInputDialog("Ingresa numero: "));
            System.out.println(dp);
            
        }
    }
    
}
