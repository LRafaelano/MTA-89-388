package sesion07;
/*
programa que demuestra la invocacion de un metodo cuando es null genera un error
*/
import java.io.*; //importa todas los metodos posibles en la libreria IO
  
class Ejer02Npe 
{ 
    public static void main (String[] args) 
    { 
         
        //inicializamos la variable en null
        String ptr = "gfg"; 
  
        //iniciar un proceso de monitoreo para saber si prt es nulo. 
        //ptr = "gfg";
        try
        { 
            //debe verificarse como se realiza la evaluacion
            if (ptr.equals("gfg")) 
                System.out.println("dato correcto"); 
            else 
                System.out.println("dato equivocado"); 
        } 
        catch(NullPointerException pilaError) 
        { 
            System.out.println("Exception NullPointerException detectado"); 
            pilaError.printStackTrace();
        } //fin del catch de NullPointerException
        catch(Exception pilaError2)
        {
            System.out.println("Ocurrio otro tipo de error inesperado");
            pilaError2.printStackTrace();
        }// fin del catch para cualquier otra Exception
   
        finally{
            if( ptr !="gfg"){
                System.out.println("El programa ha finalizadop");
             }
            //por hacer: mejorar el codigo de manera que finally no se ejecute cuando no hubo ningun error
        }//fin del finally
        
           
        
       
    } 
} 