
package Logica;

import Logica.Productos; // Importa la clase Productos
import java.util.ArrayList;  // Importa la clase ArrayList para manejar listas dinámicas
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos desde la consola


public class GestorInventario {
    // Atributo privado que almacena la lista de productos en el inventario
    private ArrayList<Productos>producto;
    
     // Constructor de la clase GestorInventario que inicializa la lista de productos
    public GestorInventario(){
        producto = new ArrayList<>();
    }
    
     // Método para agregar un producto a la lista de inventario
    public void agregarProducto(Productos produc){
        producto.add(produc);  // Agrega el producto pasado como argumento a la lista
    }
    
    // Método para modificar un producto en el inventario basado en su ID
    public void ModificarProducto (){
        // Se crea un objeto Scanner para capturar la entrada del usuario
         Scanner in = new Scanner(System.in);
         System.out.println("Ingrese el ID del producto que desea modificar ");
         int IdProducto = in.nextInt(); // Captura el ID del producto a modificar
         Productos producto = buscarProducto(IdProducto);  // Busca el producto en la lista

        if (producto != null) { // Si el producto existe
            System.out.println("Producto encontrado. Ingrese los datos nuevos datos. "
                    + "\nNuevo nombre: "); // Captura el nuevo nombre del producto
            String nuevoNombre = in.nextLine(); // Asigna el nuevo nombre al producto
            producto.setNombre(nuevoNombre);
            in.nextLine();
            System.out.println("Nuevo precio: "); // Captura el nuevo precio del producto
            double nuevoPrecio = in.nextDouble();
            producto.setPrecio(nuevoPrecio); // Asigna el nuevo precio al producto
            System.out.println("Nueva cantidad"); // Captura la nueva cantidad en inventario
            int nuevaCantidad = in.nextInt();
            producto.setCantidadEnInventario(nuevaCantidad);  // Asigna la nueva cantidad al producto
        } else {
            System.out.println("Producto no encontrado, intente de nuevo"); // Mensaje si el producto no fue encontrado
        }
    }
    
    // Método para eliminar un producto de la lista basado en su ID
    public void eliminarProducto (int IdProducto){
        Productos produc = buscarProducto(IdProducto); // Busca el producto en la lista
        if (produc !=null ){
            producto.remove(produc); // Elimina el producto de la lista
            System.out.println("Producto eliminado correctamente.");
        }else{
            System.out.println("El producto con ID " + IdProducto + " NO se encontro en el inventario. ");
        }
    }
    
     // Método para buscar un producto en la lista basado en su ID
    public Productos buscarProducto (int IdProducto){
         // Recorre la lista de productos
        for(Productos producto:producto){
            // Compara el ID del producto actual con el ID buscado
            if(producto.getIdProducto()== IdProducto){
                return producto; // Retorna el producto si se encuentra
            }
        }
        return null;  // Retorna null si no se encuentra el producto
    }
    
     // Método para mostrar la información de todos los productos en el inventario
    public void mostrarInventario(){
         // Recorre la lista de productos
        for(Productos producto:producto){ //Recorre la lista de productos
            producto.mostrarInformacion(); // Llama al método mostrarInformacion de cada producto
            System.out.println("");
        }
    }
}
