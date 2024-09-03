
package Logica;

public class Productos {

    private int IdProducto;
    private String Nombre;
    private double precio;
    private int cantidadEnInventario;

    //constructor de la clase Productos
    public Productos(int IdProducto, String Nombre, double precio, int cantidadEnInventario) {
        this.IdProducto = IdProducto;
        this.Nombre = Nombre;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

     // Método getter para obtener el ID del producto
    public int getIdProducto() {
        return IdProducto;
    }

    
    // Método setter para establecer el ID del producto
    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    // Método getter para obtener el nombre del producto
    public String getNombre() {
        return Nombre;
    }

    // Método setter para establecer el nombre del producto
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    // Método getter para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Método setter para establecer el precio del producto
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método getter para obtener la cantidad en inventario
    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    // Método setter para establecer la cantidad en inventario
    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }
    
    // Método para mostrar la información del producto
    public void mostrarInformacion (){
        System.out.println("ID del producto: " + IdProducto);
        System.out.println("Nombre del producto: " + Nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad del producto en inventario: " + cantidadEnInventario);
    }
}
