package ejercicio3;

public abstract class Vehiculo { // pensada para que otras clases hereden de ella, por lo que no se puede instanciar.
    private String matricula; // (visible solamente desde la misma clase)
    int velocidad; // (visible solamente desde clases que estén en el mismo paquete).

    public Vehiculo(String matricula) { // El método que sirve para crear vehículos recibe solamente la matrícula como parámetro, la velocidad se inicializa a 0.
        this.matricula = matricula;
        this.velocidad = 0; // esto es redundante, porque si no pones nada también es 0 (por defecto)
    }

    public String getMatricula() { // Debe incluir un método público para recuperar el valor que contenga la matrícula.
        return this.matricula;
    }

    @Override
    public String toString() { // devuelve un String con la matrícula y la velocidad del vehículo, con formato: “El vehículo con matrícula X va a X km/h”. (Sustituye las X por los valores de los atributos.
        return "El vehículo con matricula " + matricula + " va a " + velocidad + "km/h";
    }

    // métodos abstractos: no se desarrollan aquí, los tiene que desarrollar la primera subclase no abstracta
    public abstract void acelerar(int km);
    public abstract void frenar(int km);
}
