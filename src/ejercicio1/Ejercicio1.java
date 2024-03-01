package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String swift = "";
        String salir = "";
        do {
            System.out.println("Introduce un código: ");
            swift = teclado.nextLine();
            mostrarDatos(swift);
            System.out.println("¿Quieres salir? (s/n)");
            salir = teclado.nextLine().substring(0, 1);
        } while (!salir.equalsIgnoreCase("s"));
    }

    public static boolean comprobarDigitos(String codigo) {
        if (codigo.length() == 8 || codigo.length() == 11) {
            return true;
        } else  {
            System.out.println("El número de caracteres introducidos (" + codigo.length()+ ") no es correcto.");
            return false;
        }
    }

    public static void mostrarDatos(String codigo) {
        if (comprobarDigitos(codigo)) {
            System.out.println("CÓDIGO SWIFT " + codigo + ": ");
            System.out.println("=============================");
            String pais = codigo.substring(4,6);
            System.out.println("País: " + pais);
            String localidad = codigo.substring(6, 8);
            if (pais.equals("ES") && localidad.equals("MM")) {
                System.out.println("Localidad: Madrid");
            } else if (pais.equals("RU") && localidad.equals("MM")) {
                System.out.println("Localidad: Moscú");
            }
        }
    }

}
