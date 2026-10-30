package com.mycompany.tasca01.dto;

import java.util.Date;


public class Lloguer {
    private int numeroRegistro;
    private Usuari usuari;
    private Joc joc;
    private Date inicio;
    private Date devolver;
    private Plataforma plataforma;
    
    public Lloguer(int numeroRegistro, Usuari usuari, Joc joc, Date inicio, Date devolver, Plataforma plataforma){
        this.numeroRegistro = numeroRegistro;
        this.usuari = usuari;
        this.joc = joc;
        this.inicio = inicio;
        this.devolver = devolver;
        this.plataforma = plataforma;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }

    public Joc getJoc() {
        return joc;
    }

    public void setJoc(Joc joc) {
        this.joc = joc;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getDevolver() {
        return devolver;
    }

    public void setDevolver(Date devolver) {
        this.devolver = devolver;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
}
