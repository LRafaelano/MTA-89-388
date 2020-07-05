/*
Realizar la tabla del 2
*/

public class Tabla2 {
    static int tabla =2;
    public static void main(String args[]){
        System.out.println ("TABLA DEL "+tabla );
        for(int i =0; i <=10; i++){
            System.out.println (tabla + " * " + i + " = "+ (tabla * i));
            //i++; salta de 2 en 2
        }
    }
}