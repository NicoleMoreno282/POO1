
package Principal;

import Logica.GestorInventario;
import Logica.Perecedero;
import Logica.NoPerecedero;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    
    public static void main(String[] args) {
         // Se crea una instancia de GestorInventario para manejar la lógica del inventario
        GestorInventario gestor = new GestorInventario();
        Scanner in = new Scanner(System.in);
        
        // Bucle infinito para mostrar el menú hasta que el usuario decida salir
        while (true){
            try{
                 // Se muestra el menú de opciones al usuario
            System.out.println("\nMenu de los productos: ");
            System.out.println("1. Agregar Producto Perecedero");
            System.out.println("2. Agregar Producto No Perecedero");
            System.out.println("3. Modificar productos por ID");
            System.out.println("4. Eliminar producto por ID");
            System.out.println("5. Buscar producto por ID");
            System.out.println("6. Mostrar inventario");
            System.out.println("7. Salir.");
            System.out.println("Seleccione una opcion: ");
            int opcion = in.nextInt();  // El usuario ingresa una opción
  
            
             // Se evalúa la opción seleccionada mediante un switch
        switch(opcion){
            case 1:
                 // Agregar un producto perecedero
                System.out.print("Ingrese ID del producto Perecedero: ");
                int IdProducto = in.nextInt();
                in.nextLine();
                System.out.print("Ingrese el nombre del producto perecedero: ");
                String Nombre = in.next();
                System.out.print("Ingrese el precio del producto perecedero: ");
                double precio = in.nextDouble();
                System.out.print("Ingrese la cantidad en el inventario del producto perecedero: ");
                int cantidadEnInventario = in.nextInt();
                System.out.print("Ingrese fecha de caducidad del producto perecedero: ");
                int FechaCaducidad = in.nextInt();
                System.out.print("Ingrese la temperatura de almacenamiento del producto perecedero: ");
                double TemperaturaDeAlmacenamiento = in.nextDouble();
                gestor.agregarProducto(new Perecedero (IdProducto, Nombre, precio, cantidadEnInventario, FechaCaducidad, TemperaturaDeAlmacenamiento));
                System.out.println("¡Producto perecedero agregado!");
                break;
                
            case 2:
                 // Agregar un producto no perecedero
               System.out.print("Ingrese ID del producto No Perecedero: ");
                IdProducto = in.nextInt();
                in.nextLine();
                System.out.print("Ingrese el nombre del producto No perecedero: ");
                Nombre = in.next();
                System.out.print("Ingrese el precio del producto No perecedero: ");
                precio = in.nextDouble();
                System.out.print("Ingrese la cantidad en el inventario del producto No perecedero: ");
                cantidadEnInventario = in.nextInt();
                System.out.print("Ingrese los meses de garantia del producto No Perecedero: ");
                int garantia = in.nextInt();
                gestor.agregarProducto(new NoPerecedero (IdProducto, Nombre, precio, cantidadEnInventario,garantia));
                System.out.println("¡Producto No Perecedero agregado!");
                break; 
                
            case 3:
                  // Modificar un producto existente por ID
                gestor.ModificarProducto();
                break;
                
            case 4:
                // Eliminar un producto por ID
                System.out.print("Ingrese el ID del producto que desea eliminar: ");
                IdProducto = in.nextInt();
                gestor.eliminarProducto(IdProducto);
                break;
                
            case 5:
                 // Buscar un producto por ID y mostrar su información
                System.out.print("Ingrese el ID del producto que desea buscar: ");
                IdProducto = in.nextInt();
                gestor.buscarProducto(IdProducto);
                gestor.mostrarInventario();
                break;
                
            case 6:
                // Mostrar todo el inventario
                System.out.println("Inventario actual");
                gestor.mostrarInventario();
                break;
                
            case 7: 
                 // Salir del programa
                System.out.println("Sliendo del programa..");
                in.close();  // Cierra el escáner
                System.exit(0); // Termina el programa
                break;
                
            default:
                 // Opción no válida
                System.out.println("Opcion no valida. ¡Intente de nuevo.! ");
                break;
           }
         // Manejo de excepción para entradas inválidas
       }catch(InputMismatchException e){
           in.next(); // Consume la entrada inválida
       }
   }
 }
}
