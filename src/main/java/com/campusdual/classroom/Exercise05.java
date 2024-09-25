package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        checkLessOrGreaterEqual(5, 10);  // Caso 5 < 10
        checkLessOrGreaterEqual(10, 5);  // Caso 10 >= 5
        checkMultiply(10, 2);            // Caso 10 es múltiplo de 2
        checkMultiply(10, 3);            // Caso 10 no es múltiplo de 3
        checkPositiveNegative(1);       // Caso número negativo
        checkPositiveNegative(0);        // Caso número cero
        checkPositiveNegative(-1);       // Caso número positivo
    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
    if (n1<n2) {
            System.out.println(n1 + " es menor que " + n2);
    }else{
            System.out.println(n1 + " es mayor o igual que " + n2);
        }
    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    public static void checkMultiply(int n1, int n2) {
    if (n2 != 0 && n1 % n2 == 0) {
        System.out.println(n1 + " es múltiplo de " + n2);
    }else{
        System.out.println(n1 + " no es múltiplo de " + n2);
    }
    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        if (num<0) {
            System.out.println(num + " es negativo. ");
        }else{
            System.out.println(num + " es positivo. ");
        }
        
    }
}
