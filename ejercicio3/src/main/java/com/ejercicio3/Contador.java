package com.ejercicio3;

public class Contador {

    private int contador = 0;
    private int incremento = 1;
    private final int MAX_CONT = 10;


    public void elegirContador(int opcion) {
        switch (opcion) {
            case 1:
                contarWhile();
                break;
            case 2:
                contarDoWhile();
                break;
            case 3:
                contarFor();
                break;
            default:
                System.out.println("Opción no válida, por favor elige 1, 2 o 3.");
        }
    }

    /*
     * Comparación de los tres métodos de conteo:
     * El while evalúa la condición antes de ejecutar el bloque, por lo que podría no iterarse si la condición es falsa.
     * El do-while ejecuta el bloque al menos una vez antes de evaluar la condición, lo que garantiza al menos una iteración.
     * El for es una estructura más compacta y clara para iteraciones con un número conocido de repeticiones, ya que integra la inicialización, la condición y el incremento en una sola línea.
     */

    private void contarWhile() {

        while (contador <= MAX_CONT) {
            System.out.print(contador + " ");
            contador += incremento;
        }
        System.out.println(); // Salto de línea después de contar
        contador = 0; // Reiniciar contador para la siguiente opción
    }

    private void contarDoWhile() {

        do {
            System.out.print(contador + " ");
            contador += incremento;
        } while (contador <= MAX_CONT);
        System.out.println(); // Salto de línea después de contar
        contador = 0; // Reiniciar contador para la siguiente opción
    }

    private void contarFor() {
        for (contador = 0; contador <= MAX_CONT; contador += incremento) {
            System.out.print(contador + " ");
        }
        System.out.println(); // Salto de línea después de contar
        contador = 0; // Reiniciar contador para la siguiente opción
    }
}