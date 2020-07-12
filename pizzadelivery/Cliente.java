/*
clase para controlar el perfil del cliente
*/

package pizzadelivery;

import java.util.Scanner;



public class Cliente {

    private int codigoCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private String telMovilCliente;

    public Cliente(int codigoCliente, String nombreCliente, String apellidosCliente, String telMovilCliente) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.telMovilCliente = telMovilCliente;
    }

    //1. OVERLOADING DE CONSTRUCTOR: nuevo constructor para gestionar la captura de datos
    public Cliente(){
        capturaDatos();
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getTelMovilCliente() {
        return telMovilCliente;
    }

    public void setTelMovilCliente(String telMovilCliente) {
        this.telMovilCliente = telMovilCliente;
    }   

    public void capturaDatos(){
        //gestiona el proceso de entrada de datos de un nuevo cliente
        //definir la variable entradaTeclado como variable de metodo
        //puesto que en ninguna otra parte de la clase se va a requerir usarse
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Proceso para captura de datos de un Nuevo Cliente:");
        
        System.out.println("Por favor digite el codigo del cliente: ");
        this.setCodigoCliente(Integer.parseInt(entradaTeclado.nextLine()));

        System.out.println("Por favor digite el nombre del cliente: ");        
        this.setNombreCliente(entradaTeclado.nextLine());

        System.out.println("Por favor digite apellidos del cliente: ");        
        this.setApellidosCliente(entradaTeclado.nextLine());

        System.out.println("Por favor digite telefono del cliente: ");        
        this.setTelMovilCliente(entradaTeclado.nextLine());

        //es muy importante cerrar los objetos Scanner una vez que han dejado de usarse
        entradaTeclado.close();
    }

}//fin de la clase Cliente