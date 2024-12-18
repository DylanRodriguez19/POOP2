package pryzoologico;

public class Ave extends Animal {
    public double envergaduraAlas;

    public Ave(double envergaduraAlas, String nombre, int edad) {
        super(nombre, edad);
        
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0.");
        }
        
        this.envergaduraAlas = envergaduraAlas;
    }

    public void volar() {
        System.out.println(getNombre() + " está volando con una envergadura de " + envergaduraAlas + " metros.");
    }
}
