/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vsemestre;

import java.util.Random;

/**
 *
 * @author FABAME
 */
public class Number {

    int este;
    boolean encontrado;
    String pista;
    int inicio;

    public Number() {
        este = 0;
        encontrado = false;

    }

    public void setNumero(int numero, int real) {

        int x, y;
        x = numero;
        y = real;
        if (x == y) {
            pista = "**************Campeon Ganaste*************";
            encontrado = true;
        }
        if (x < y) {
            pista = "subele";
        }
        if (x > y) {
            pista = "bajale";
        }
        if (x == y - 1) {
            pista = "muy caliente subele un poquitico";
        }
        if (x == y + 1) {
            pista = "muy caliente bajale un poquitico";
        }
    }

    public boolean getEncontrado() {
        return encontrado;
    }

    public String getPista() {

        return "" + pista;
    }

    public int inicio(int x) {
        Random p = new Random();

        x = p.nextInt(x) + 1;
        este = x;
        return este;

    }

}
