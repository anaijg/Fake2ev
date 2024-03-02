package ejercicio3;

public abstract class Coche extends Vehiculo{ // clase abstracta
    // una variable para almacenar el número de puertas, sólo accesible desde la misma clase
    private  int numPuertas;

    // cada vez que se crea un vehículo se indica mostrando su matrícula por pantalla.
    public Coche(String matricula) {
        super(matricula);
        System.out.println("Se ha creado el vehículo con matrícula: " + matricula);
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    // un método para recuperar el número de puertas
    public int getNumPuertas() {
        return numPuertas;
    }

   // y un método toString(), que sobreescribe el método de la superclase y añade el número de puertas
   //del coche. Ejemplo: “El vehículo con matrícula X va a X km/h. Tiene X puertas”.
    @Override
    public String toString() {
        return super.toString() + "\n* Tiene " + numPuertas + " puertas.";
    }
}
