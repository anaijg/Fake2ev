package ejercicio3;

public class CocheManual extends Coche{
    // Contiene un atributo privado marcha,
    private int marcha;

    // Cuando se crea un coche no hay ninguna marcha metida, lo que representamos con el valor 0.
    public CocheManual(String matricula) {
        super(matricula);
        this.marcha = 0; // esto es redundante, porque si no pones nada también es 0 (por defecto)
    }

    // con sus correspondientes métodos públicos para recuperar
       public int getMarcha() {
        return this.marcha;
    }

    // y cambiar de marcha.
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    // Contiene un método cambiarMarcha(int velocidad): void, que cambia de marcha según la
    //velocidad introducida:
    public void cambiarMarcha(int velocidad) {
        if (velocidad < 10) {
            marcha = 1;
        } else if (velocidad >= 10 && velocidad <= 30) {
            marcha = 2;
        } else if (velocidad > 30 && velocidad <= 50) {
            marcha = 3;
        } else if (velocidad > 50 && velocidad <= 80) {
            marcha = 4;
        } else {
            marcha = 5;
        }
    }
    @Override
    public void acelerar(int km) {
        this.velocidad += km;
        System.out.println("Acelerando...");
        this.toString();
        // Este método (cambiarMarcha) es invocado cada vez que el coche acelera o frena
        cambiarMarcha(velocidad);
    }

    @Override
    public void frenar(int km) {
        this.velocidad -= km;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
        System.out.println("Frenando...");
        this.toString();
        // Este método (cambiarMarcha) es invocado cada vez que el coche acelera o frena
        cambiarMarcha(this.velocidad);
    }

    @Override
    public String toString() {
        return super.toString() +"\n* Es un coche manual y hemos metido la " + this.marcha + "ª marcha.";
    }
}
