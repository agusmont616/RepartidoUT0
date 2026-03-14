package com.repartidout0;

/**
 * EJERCICIO 1
 */
public class App 
{
    public static void main( String[] args )
    {
        // *** Variable con nombre válido ***
        PruebaAtributos prueba = new PruebaAtributos();
        // Imprimir los atributos con sus valores por defecto (variables no inicializadas)
        prueba.imprimirAtributos();

        // *** Variable con nombre inválido (comentada para evitar error de compilación) ***

        // PruebaAtributos static = new PruebaAtributos(); //
        // static.imprimirAtributos();

        /*
        DEVUELVE:   Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
                      PruebaAtributos cannot be resolved to a variable
                      Syntax error on token "static", delete this token
                      Syntax error on token "static", invalid Expression 
                      */
        



        // *** Imprimir variables locales sin inicializar ***

        //int numero;
        // System.out.println("Número: " + numero);

        /*
        DEVUELVE:   Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
                      The local variable numero may not have been initialized
                        */
         


    
    }
}
