package pryzoologico;
public class Mamifero extends Animal {
public String tipoPelaje;

    public Mamifero(String tipoPelaje, String nombre, int edad) {
        super(nombre, edad);
        this.tipoPelaje = tipoPelaje;
        if (edad<=0){
            System.out.println("La edad debe ser mayor a 0");
    }
    }
public void amamantarCrias(){
System.out.println(getNombre()+" tiene un pelaje "+tipoPelaje+" y esta amamantando a sus crias.");

}
}
