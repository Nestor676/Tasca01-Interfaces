package com.mycompany.tasca01.gestion;

import com.mycompany.tasca01.dto.*;
import java.util.ArrayList;

public class GestionDatos {

    public static ArrayList<Usuari> usuaris = new ArrayList<>();
    public static ArrayList<Joc> jocs = new ArrayList<>();
    public static ArrayList<Lloguer> lloguers = new ArrayList<>();

    private static int numeroRegistre = 1;

    public static int getNumeroRegistre() {
        return numeroRegistre++;
    }

    public static void inicialitzarDades() {

        Usuari u1 = new Usuari(
                "Marc", "Rosselló", "Garcia",
                "12345678A", "678901234", new java.util.Date()
        );

        Usuari u2 = new Usuari(
                "Laura", "García", "Martínez",
                "87654321B", "678123456", new java.util.Date()
        );

        usuaris.add(u1);
        usuaris.add(u2);

        ArrayList<Plataforma> plataformas1 = new ArrayList<>();

        plataformas1.add(new Plataforma("PS5", 5));
        plataformas1.add(new Plataforma("Switch 2", 3));

        Joc joc1 = new Joc(
                "The Legend of Zelda",
                "Aventura",
                plataformas1
        );

        ArrayList<Plataforma> plataformas2 = new ArrayList<>();

        plataformas2.add(new Plataforma("Xbox", 4));
        plataformas2.add(new Plataforma("PC", 3));

        Joc joc2 = new Joc(
                "Cyberpunk 2077",
                "Acció",
                plataformas2
        );

        jocs.add(joc1);
        jocs.add(joc2);
    }

    public static boolean registrarLloguer(Usuari usuari, Joc joc, Plataforma plataforma) {

        if (plataforma.getUnidades() <= 0) {
            return false;
        }

        java.util.Date inicio = new java.util.Date();

        java.util.Calendar calendar
                = java.util.Calendar.getInstance();

        calendar.setTime(inicio);
        calendar.add(java.util.Calendar.DAY_OF_MONTH, 7);

        java.util.Date devolucion = calendar.getTime();

        Lloguer nuevo = new Lloguer(
                getNumeroRegistre(),
                usuari,
                joc,
                inicio,
                devolucion,
                plataforma
        );

        lloguers.add(nuevo);

        plataforma.setUnidades(
                plataforma.getUnidades() - 1
        );

        return true;
    }

    public static boolean retornarLloguer(Lloguer lloguer) {

        if (lloguer.isRetornat()) {
            return false;
        }

        lloguer.setRetornat(true);

        Plataforma plataforma = lloguer.getPlataforma();

        plataforma.setUnidades(
                plataforma.getUnidades() + 1
        );

        return true;
    }
}
