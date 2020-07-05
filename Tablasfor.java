import java.util.Scanner;
public class Tablasfor {
    static int a=0;
    static int b=0;
    public static void main(String args[]){
        Scanner entradaDatos= new Scanner(System.in);
        System.out.println("Programa para mostrar las tablas de multiplicar del 1 al 10");
        System.out.println("¿Hasta que tabla desea multiplicar?");
        a=Integer.parseInt(entradaDatos.nextLine());
        System.out.println("¿Hasta que multiplicador desea multiplicar?");
        b=Integer.parseInt(entradaDatos.nextLine());
        for(int multiplicando = 1; multiplicando <=a; multiplicando++){
            System.out.println("-----------------------------");
            System.out.println("MOSTRANDO TABLA DEL: "+multiplicando);            
            System.out.println("-----------------------------");            
            for(int multiplicador = 1; multiplicador <=b; multiplicador++){
                System.out.println(multiplicando + " X " + multiplicador + " = " 
                + (multiplicando * multiplicador));
            }//fin del for que controla los multiplicadores
            System.out.println("-----------------------------");
            System.out.println("FIN DE LA TABLA DEL: "+multiplicando);            
            System.out.println("-----------------------------");                        
            System.out.println();
        }//fin del for que controla los multiplicandos
    }//fin del metodo main

    
}