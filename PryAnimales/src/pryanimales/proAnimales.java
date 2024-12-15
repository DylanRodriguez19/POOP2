package pryanimales;
public class proAnimales {
    
String nombre;
int edad;

public proAnimales(String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;

}

public void comer(){
System.out.println("El "+ nombre+ "esta comiendo");
}

public void dormir(){
System.out.println("El"+nombre+"esta durmiendo");

}

}