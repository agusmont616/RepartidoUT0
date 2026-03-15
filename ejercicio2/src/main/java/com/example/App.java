package com.example;

class ArithmeticDemo {
    public static void main(String[] args) {
    int result = 1 + 2;

    // Asignaciones simples reemplazadas por asignaciones compuestas (result = result - 1 → result -= 1)
                 // CONVERSIONES USADAS
    result -= 1; // result = result - 1 → result -= 1
    result *= 2; // result = result * 2 → result *= 2
    result /= 2; // result = result / 2 → result /= 2
    result += 8; // result = result + 8 → result += 8
    result %= 7; // result = result % 7 → result %= 7
    

    // Valores iniciales para a e i
    int a = 5;
    int i = 3;
    
    // Incremento de i antes de usarlo en la asignación compuesta (a = a + (++i) → ++i = i + 1 = 4, por lo tanto a = 5 + 4 = 9)
    a += ++i;
    
    // Para correr el siguiente script correctamente: java -cp target/classes com.example.ArithmeticDemo x y
    // Donde x e y son los valores enteros que deseas usar para p y q respectivamente
    int p = Integer.parseInt(args[0]);
    int q = Integer.parseInt(args[1]);

    System.out.println("Suma: " + (p + q));
    System.out.println("Resta: " + (p - q));
    System.out.println("Multiplicación: " + (p * q));
    System.out.println("División: " + (p / q));
    System.out.println("Módulo: " + (p % q));
    }
}
