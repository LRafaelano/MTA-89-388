/*Ejercicio para contar hasta el 5 con el uso 
del while*/
public class WhileEjercicio{
    static int num =1;
    static int contador=5;
    public static void main(String args []){
        /*System.out.println("Numeros a contar");
        while(num <= contador){
            System.out.println(num);
            num++;
        }*/
        boolean continuar = true;

        while (continuar ){
            //POR HACER: COMO AUMENTAR LA VARIABLE CON ++
            contador++;
            if(contador < 5){
                System.out.println(num);
            }
            else
            {
                //finalizar la ejecucion del cicli while
                continuar = false;
            }
        }

    }

}