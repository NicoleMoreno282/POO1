
package Logica;

// La clase NoPerecedero hereda de la clase Productos
public class NoPerecedero extends Productos {
     // Atributo privado que representa la garantía del producto en meses
    private int garantia;
    
     // Constructor de la clase NoPerecedero
    public NoPerecedero (int IdProducto, String Nombre, double precio, int cantidadEnInventario, int garantia){
        // Llama al constructor de la clase base (Productos) para inicializar los atributos heredados
        super(IdProducto, Nombre, precio, cantidadEnInventario);
        // Inicializa los atributos adicionales específicos para productos No perecederos
        this.garantia = garantia;
    }

    // Método getter para obtener el valor de la garantía
    public int getGarantia() {
        return garantia;
    }

    // Método setter para establecer el valor de la garantía
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    // Sobrescribe el método mostrarInformacion() para incluir la información sobre la garantía
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        // Imprime la información adicional específica para NoPerecedero
        System.out.println("La garantia es de " + getGarantia() + " meses.");
    }
}
