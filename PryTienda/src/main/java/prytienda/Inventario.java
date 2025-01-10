package prytienda;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    
    List<Producto> listaProductos = new ArrayList<Producto>();    

    public void agregarProducto(Producto prod) {
        if (prod.getCantidad() < 0) {
            System.out.println("La cantidad no puede ser negativa, entonces refleja 0");
            prod.setCantidad(0);
        }

        if (prod.getPrecio() < 0) {
            System.out.println("El precio no puede ser negativo,entonces refleja 0");
            prod.setPrecio(0); 
        }

        listaProductos.add(prod);
    }  

    public void mostrarProducto() {
        for (Producto prod : listaProductos) {
            System.out.println(prod);
        } 
    }

    public Producto buscarProducto(String nombre) {
        for (Producto prod : listaProductos) {
            if (prod.getNombre().equalsIgnoreCase(nombre)) {
                return prod;
            }
        }
        return null;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Producto producto : listaProductos) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        return total;
    } 
    
    public void eliminarProducto(String nombre) {
        Producto producto = buscarProducto(nombre);
        
        if (producto != null) {
            listaProductos.remove(producto);
            System.out.println("*Producto eliminado*");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
