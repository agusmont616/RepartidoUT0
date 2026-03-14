package com.repartidout0;

public class PruebaAtributos {

    public int entero;
    public Boolean booleano;
    public double decimal;
    public char caracter;
    public String cadena;

    public PruebaAtributos() {
        
    }

    public void imprimirAtributos() {
        System.out.println("Entero: " + entero);
        System.out.println("Booleano: " + booleano);
        System.out.println("Decimal: " + decimal);
        System.out.println("Caracter: " + caracter);
        System.out.println("Cadena: " + cadena);
    }
}
