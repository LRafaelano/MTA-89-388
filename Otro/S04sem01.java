/*Sesion de trabajo julio 1 2020
ejercicio con estructura de control while
logica:
5 x 1 = 5
5 x 2 = 10 */
import java.util.Scanner;
public class S04sem01
{
    static int tabla =5;
    static int contador = 0;
    
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabla de multiplicar usando While");
        System.out.println("Ingrese tabla");
        tabla=sc.nextInt();
        System.out.println("Ingrese fin");
        contador=sc.nextInt();
        while (contador <= 10){
            System.out.println (tabla + " multiplicar por " + contador
            + "es igual a: "+ (tabla * contador));
            contador++;
        }//fin de while
    }
}