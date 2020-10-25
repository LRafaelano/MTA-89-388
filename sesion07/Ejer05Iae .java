package sesion07;

import java.util.Scanner;
public class Ejer05Iae {
    public static void main(String[] args) {
        String cont = "y";
        ejecutar(cont);
    }
    static void ejecutar(String cont) {
        Scanner scan = new Scanner(System.in);
        while( cont.equalsIgnoreCase("y")) {
           try {
               System.out.println("Digite un entero: ");
               int datos = scan.nextInt();
               if (datos < 0 || datos > 100)
                  throw new IllegalArgumentException("el valor no debe ser negativo ni mayor a 100");
               System.out.println( datos);
            }
            catch(IllegalArgumentException i) {
               System.out.println("Valor fuera de rango, digite S para continuar");
               cont = scan.next();  
               if(cont.equalsIgnoreCase("S"))
                   ejecutar(cont);
               }
          }
     }
}