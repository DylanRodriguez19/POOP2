package pryzoologico;
public class Animal {
 public String nombre;
 int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    } 

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
 public void comer(){

 System.out.println(getNombre()+" esta comiendo.");
}
 public void dormir(){

 System.out.println(getNombre()+" esta durmiendo.");
 }
}