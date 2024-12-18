package pryzoologico;
public class Reptil extends Animal {
public String tipoEscamas;

    public Reptil(String tipoEscamas, String nombre, int edad) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
        if (edad<0){
            System.out.println("La edad debe ser mayor a 0");
            
    }
        
    }
 

public void arrastrarse(){
 System.out.println(getNombre()+" se esta arrastrando con sus escamas de tipo " +tipoEscamas);
}


}