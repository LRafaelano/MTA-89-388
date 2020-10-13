/*Ejercicio de practica para los arrays */
public class arrays{
    public static void main(String args[]){
        double [] myList = {1,2,3,4,5,6,7,8,9,10};

        //Imprimir todos los elementos del array
        for (int i =0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }
         
        //Sumando todos los elemtos
        double total = 0;
        for(int i = 0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println(total);

        //Elemento mas grande
        double max = myList[0];
        for(int i =0; i < myList.length; i++){
            if(myList[i] > max) 
            {
                max = myList[i];
            }
        }
        System.out.println("Max es "+ max);
        
        //Elemento mas pequeño
        double min = myList[0];
        for(int i = 0; i< myList.length; i++){
            if(myList[i] < min){
                min = myList[i];
            }
        }
        System.out.println("Min es "+ min);

        //Imprimir todos los elementos
        for(double element : myList){
            System.out.println(element);
        }

        
    }
}