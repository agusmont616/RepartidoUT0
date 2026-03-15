package com.ejercicio3;

public class App 
{
    public static void main( String[] args )
    {
        
        Contador contador = new Contador();

        contador.elegirContador(1); // Contar usando while
        contador.elegirContador(2); // Contar usando do-while
        contador.elegirContador(3); // Contar usando for
    }
}
