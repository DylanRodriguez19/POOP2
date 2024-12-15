package pryanimales;
public class Mamifero extends proAnimales {
    
String tipoPelaje;

public Mamifero(String tipoPelaje, String nombre, int edad) {
    
super(nombre, edad);
this.tipoPelaje = tipoPelaje;

}
public void amamantarCrias(){
System.out.println(nombre +" esta amamantado crias");

}

}