/*
ejemplo de proceso repetitivo usando la estructura de
control for
esta estructura es exclusivamente para ejecutar procesos por
lotes
escribir la tabla del 5
*/

public class S04sem02 {
    static int tabla =5;
    public static void main(String args[]){
        for(int inicio =0; inicio <=10; inicio++){
            System.out.println (tabla + " multiplicar por " + inicio
            + "es igual a: "+ (tabla * inicio));
            inicio++;
        }
    }
}