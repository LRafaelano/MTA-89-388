/* 
ampliacion del ejercicio 3 para que el usuario digite
el limite superior y que el programa se detenga hasta que el 
usuario digite 0
*/
import java.util.Scanner;
public class S04sem04 {
    static int limiteSuperior=25;
    public static void main(String args []){
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("programa para contar hasta 1");
        System.out.println("digite un numero mayor a 1");
        limiteSuperior= Integer.parseInt(entradaDatos.nextLine());
        for (int i= limiteSuperior; i >= 1; i--){
            System.out.println(i);
        }
    }
}