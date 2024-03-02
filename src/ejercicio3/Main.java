package ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crea un coche automático y otro manual.
        CocheAutomatico cocheAutomatico = new CocheAutomatico("AUT0001");
        CocheManual cocheManual = new CocheManual("MAN0001");

        // o Añade a uno de ellos 2 puertas y al otro 4 puertas.
        cocheAutomatico.setNumPuertas(2);
        cocheManual.setNumPuertas(4);
        //o Arráncalos: pon su velocidad a 20 km/h.
        cocheAutomatico.acelerar(20);
        System.out.println(cocheAutomatico);
        cocheManual.acelerar(20);
        System.out.println(cocheManual);

        // Acelera al coche manual de 10 en 10 km/h hasta llegar a 100 km/h, y muestra la marcha en cada caso.
        for (int i = 0; i <= 7; i++) {
            System.out.println();
            cocheManual.acelerar(10);
            System.out.println(cocheManual);
        }

        // Frena ambos coches en seco.
        System.out.println();
        cocheAutomatico.frenar(100);
        System.out.println(cocheAutomatico);
        cocheManual.frenar(100);
        System.out.println(cocheManual);

    }
}
