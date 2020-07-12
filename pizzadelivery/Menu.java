/*
controla todas las opciones del menu disponible
*/

package pizzadelivery;

import java.util.Scanner;
public class Menu {
    static Scanner entradaTeclado;

    private int codigoEspecialidad;
    private String nombreEspecialidad;
    private String descripcionEspecialidad;
    private float precioEspecialidad;
    private String tamanoEspecialidad;

    public Menu(int codigoEspecialidad, String nombreEspecialidad, String descripcionEspecialidad,
            float precioEspecialidad, String tamanoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcionEspecialidad = descripcionEspecialidad;
        this.precioEspecialidad = precioEspecialidad;
        this.tamanoEspecialidad = tamanoEspecialidad;
    }

    public int getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(int codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }

    public float getPrecioEspecialidad() {
        return precioEspecialidad;
    }

    public void setPrecioEspecialidad(float precioEspecialidad) {
        this.precioEspecialidad = precioEspecialidad;
    }

    public String getTamanoEspecialidad() {
        return tamanoEspecialidad;
    }

    public void setTamanoEspecialidad(String tamanoEspecialidad) {
        this.tamanoEspecialidad = tamanoEspecialidad;
    }

    public void capturaDatos(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Proceso para captura de datos de un Nuevo Cliente:");
        
        System.out.println("Por favor digite el codigo del cliente: ");
        this.setCodigoEspecialidad(Integer.parseInt(entradaTeclado.nextLine()));

        System.out.println("Por favor digite el nombre del cliente: ");        
        this.setNombreEspecialidad(entradaTeclado.nextLine());

        System.out.println("Por favor digite apellidos del cliente: ");        
        this.setDescripcionEspecialidad(entradaTeclado.nextLine());

        System.out.println("Por favor digite apellidos del cliente: ");        
        this.setPrecioEspecialidad(Float.parseFloat(entradaTeclado.nextLine()));

        System.out.println("Por favor digite telefono del cliente: ");        
        this.setTamanoEspecialidad(entradaTeclado.nextLine());

        //es muy importante cerrar los objetos Scanner una vez que han dejado de usarse
        entradaTeclado.close();

    }
}

