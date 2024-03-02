package ejercicio3;

public class CocheAutomatico extends Coche{

    public CocheAutomatico(String matricula) {
        super(matricula);
    }

    // sobreescribe el método de la superclase y añade que es un coche automático.
    @Override
    public String toString() {
        return super.toString() +"\n* Es un coche automático.";
    }

    // acelera incrementando la velocidad con la cantidad indicada por parámetro,
    // muestran “Acelerando...”
    // imprimen por pantalla los datos del coche
    @Override
    public void acelerar(int km) {
        this.velocidad += km;
        System.out.println("Acelerando...");
        this.toString();
    }

    // frena reduciendo la velocidad en la cantidad indicada; en caso de que resultara una velocidad negativa, le asignamos el valor 0.
    // “Frenando...” cada vez que se les invoca.
    // imprimen por pantalla los datos del coche
    @Override
    public void frenar(int km) {
        this.velocidad -= km;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
        System.out.println("Frenando...");
        this.toString();
    }
}
