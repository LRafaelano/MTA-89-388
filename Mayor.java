/*Evaluar el mayor de 3 numeros
autor:Ligia
fecha de creacion:
 */
import java.util.Scanner;
public class Mayor{
    static int a;
    static int b;
    static int c;

   
    public static void main(String args[]){
        
        Scanner entradaDatos= new Scanner(System.in);
        System.out.println("PROGRAMA PARA EVALUAR EL MAYOR DE 3 NUMEROS");
        System.out.println("INGRESE EL PRIMER NUMERO");
        a=Integer.parseInt(entradaDatos.nextLine());
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        b=Integer.parseInt(entradaDatos.nextLine());
        System.out.println("INGRESE EL TERCERO NUMERO");
        c=Integer.parseInt(entradaDatos.nextLine());
        if(a > b && a > c){
            System.out.println("El numero mayor es " + a);
        }
        else 
        if(b > c){
            System.out.println("El numero mayor es " + b);
        }
        else
        {
            System.out.println("El numero mayor es " + c);
        }
    }
}