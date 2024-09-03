
package Logica;

// La clase Perecedero hereda de la clase Productos
public class Perecedero extends Productos {
    
    // Atributos privados adicionales específicos para productos perecederos
    private int FechaCaducidad;
    private double TemperaturaDeAlmacenamiento;
    
     
    // Constructor de la clase Perecedero
    public Perecedero (int IdProducto, String Nombre, double precio, int cantidadEnInventario, int FechaCaducidad, double TemperaturaDeAlmacenamiento){
        // Llama al constructor de la clase base (Productos) para inicializar los atributos heredados
        super(IdProducto, Nombre, precio, cantidadEnInventario);
         // Inicializa los atributos adicionales específicos para productos perecederos
        this.FechaCaducidad = FechaCaducidad;
        this.TemperaturaDeAlmacenamiento = TemperaturaDeAlmacenamiento;
    }

     // Método getter para obtener la fecha de caducidad
    public int getFechaCaducidad() {
        return FechaCaducidad;
    }

    // Método setter para establecer la fecha de caducidad
    public void setFechaCaducidad(int FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    // Método getter para obtener la temperatura de almacenamiento del producto
    public double getTemperaturaDeAlmacenamiento() {
        return TemperaturaDeAlmacenamiento;
    }

    // Método setter para establecer la temperatura de almacenamiento del producto
    public void setTemperaturaDeAlmacenamiento(double TemperaturaDeAlmacenamiento) {
        this.TemperaturaDeAlmacenamiento = TemperaturaDeAlmacenamiento;
    }
    
     // Sobrescribe el método mostrarInformacion() para incluir información específica de los productos perecederos
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        // Añade información específica sobre productos perecederos
        System.out.println("Fecha de caducidad: " + FechaCaducidad);
        System.out.println("Temperatura de almacenamiento: " + TemperaturaDeAlmacenamiento);
    }
    
}
