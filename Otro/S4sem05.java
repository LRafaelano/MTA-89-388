/* 
ejercicio para ejecutar el ejemplo de decrementar un numero con
la ampliacion que el usuario debe informar cuando desea
terminar la ejecuccion

*/
import java.util.Scanner;
//import javax.imageio.plugins.tiff.Exit;
public class S4sem05 {
    static int limiteSuperior=25;
    static int seguir =1;
    public static void main(String args []){
       
        System.out.println("programa para contar hasta 1");

        while(seguir > 0){
            Scanner entradaDatos = new Scanner(System.in);

            System.out.println("digite un numero mayor a 1");
            limiteSuperior= Integer.parseInt(entradaDatos.nextLine());
            for (int i= limiteSuperior; i >= 1; i--){
                System.out.println(i);
            }//fin del for

            System.out.println("Para finalizar presione cero(0)");
            Scanner respuesta = new Scanner(System.in);
            int seguir = Integer.parseInt(respuesta.nextLine());
            if(seguir == 0){
                //exit;
            }
        }//fin while
    }//fin de la clase main
}//fin de la clase s4