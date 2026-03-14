package com.repartidout0;

import java.util.ArrayList;

public class PruebaAtributos {

    public int entero;
    public Boolean booleano;
    public double decimal;
    public char caracter;
    public String cadena;
    public ArrayList<Integer> lista = new ArrayList();

    public PruebaAtributos() {
        lista.add(1);
    }

    public void imprimirAtributos() {
        System.out.println("Entero: " + entero);
        System.out.println("Booleano: " + booleano);
        System.out.println("Decimal: " + decimal);
        System.out.println("Caracter: " + caracter);
        System.out.println("Cadena: " + cadena);
        System.out.println("Lista: " + lista);
    }
}
