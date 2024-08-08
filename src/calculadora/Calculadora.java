/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author yursd
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        // Bucle principal para repetir las operaciones
        while (true) {
            // Muestra el menú de opciones al usuario
            System.out.println("Calculadora Java:");
            System.out.println("Selecciona una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");

            // La opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Si el usuario elige salir, se termina el bucle
            if (opcion == 7) {
                break;
            }

            // El primer número
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();

            // Si la operación es raíz cuadrada, solo se necesita un número
            if (opcion == 6) {
                double resultado = Math.sqrt(num1);
                System.out.println("La raíz cuadrada de " + num1 + " es: " + resultado);
            } else {
                // El segundo número para las demás operaciones
                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();

                // Realiza la operación según la opción seleccionada
                switch (opcion) {
                    case 1:
                        double suma = num1 + num2;
                        System.out.println("La suma es: " + suma);
                        break;
                    case 2:
                        double resta = num1 - num2;
                        System.out.println("La resta es: " + resta);
                        break;
                    case 3:
                        double multiplicacion = num1 * num2;
                        System.out.println("La multiplicación es: " + multiplicacion);
                        break;
                    case 4:
                        // Evita la división por cero
                        if (num2 == 0) {
                            System.out.println("Error: División entre cero");
                        } else {
                            double division = num1 / num2;
                            System.out.println("La división es: " + division);
                        }
                        break;
                    case 5:
                        double potencia = Math.pow(num1, num2);
                        System.out.println(num1 + " elevado a la " + num2 + " es: " + potencia);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            }
        }

        System.out.println("¡Hasta luego!");
    }
}
