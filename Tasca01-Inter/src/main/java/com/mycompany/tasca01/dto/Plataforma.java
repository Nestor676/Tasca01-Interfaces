/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasca01.dto;

/**
 *
 * @author Alumne
 */
public class Plataforma {
    private String nom;
    private int unidades;
    
    public Plataforma(String nom, int unidades){
        this.nom = nom;
        this.unidades = unidades;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
