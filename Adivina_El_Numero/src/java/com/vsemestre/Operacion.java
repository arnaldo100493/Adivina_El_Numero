/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vsemestre;

/**
 *
 * @author FABAME
 */
public class Operacion {

    int a = 0;
    String cantidad;
    String palabra;

    public Operacion() {

    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String sumar(String x) {
        String cadena1 = x;
        String[] Palabras = cadena1.split(" ");
        for (int i = 0; i < x.length(); i++) {
            if (i == 0) {
                if (x.charAt(i) != ' ') {
                    a++;
                }
            } else if (x.charAt(i - 1) == ' ') {
                if (x.charAt(i) != ' ') {
                    a++;
                }
            }
        }
        this.setCantidad(a + "");
        this.setPalabra(Palabras[1]);
        return null;
    }

}
