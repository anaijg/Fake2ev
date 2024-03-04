package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Preguntamos la edad
        int edad = pedirEdad();
        // Obtenemos el tipo de entrada
        String tipo = devolverTipo(edad);
        // Calculamos el precio de la entrada
        int precio = calcularPrecio(tipo);
        // Imprimimos el ticket
        imprimirTicket(tipo, precio);
    }

    // pregunta la edad y devuelve la respuesta en años.
    public static int pedirEdad() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        return teclado.nextInt();
    }

    // recibe la edad en años y devuelve “Adulto” o “Niño “.
    public static String devolverTipo(int edad) {
        if (edad >= 18) {
            return "Adulto";
        } else {
            return "Niño";
        }
    }

    // recibe el tipo de entrada y devuelve el precio en euros.
    public static int calcularPrecio(String tipo) {
        if (tipo.equals("Adulto")) {
            return 4;
        } else {
            return 2;
        }
    }

    public static void imprimirTicket(String tipo, int precio) {
        System.out.println("----------------------------");
        System.out.println("|      TICKET DE ENTRADA    |");
        System.out.println("| " + tipo + "\t\tPrecio: " + precio + " € |");
        System.out.println("----------------------------");
    }
}
