import java.util.Scanner;
public class PracticaArrays{
    public static Scanner sc = new Scanner(System.in);
    public static void llenar(double [] sueldos, String []nombres){
     for (int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el nombre del empleado ");
            nombres[i]= sc.nextLine();

            System.out.println("Ingrese el sueldo de" + nombres[i]);
            sueldos[i]= sc.nextDouble();
            if(sueldos[i] < 100 || sueldos[i] > 500){
                System.out.println("El empleado no esta asegurado");
                
            }
            sc.nextLine();
        }
        
    }
}