package com.repartidout0;

/**
 * EJERCICIO 1
 */
public class App 
{
    public static void main( String[] args )
    {
        PruebaAtributos prueba = new PruebaAtributos(10, true, "Hola Mundo", 'A');
        System.out.println("Texto: " + prueba.texto);
        System.out.println("Letra: " + prueba.letra);
    }
}
