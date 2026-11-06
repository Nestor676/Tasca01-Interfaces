/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasca01.dto;

import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class Joc {
    private String nom;
    private String genero;
    private ArrayList<Plataforma> plataformas;
    
    public Joc(String nom, String genero, ArrayList<Plataforma> plataformas){
        this.nom = nom;
        this.genero = genero;
        this.plataformas = plataformas;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(ArrayList<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }
    
    @Override
    public String toString() {
        return nom;
    }
}
