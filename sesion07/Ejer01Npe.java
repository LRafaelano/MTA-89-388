package sesion07;

// clase para generar identificadores unicos. 
import java.util.UUID; 
import java.io.*; 
  
 class GenerarToken 
{ 

	//inicia valores y asigna un identificador nulo
    private static GenerarToken nuevoToken = null; 
    private String codigoToken = null; 
  
    private GenerarToken() 
    { 
      
	/*
	el constructor sera privado para evitar una nueva instancia de la clase anidada
	*/
  
        // generar el id 
        codigoToken = UUID.randomUUID().toString(); 
    } 
  
    public static GenerarToken getInstance() 
    { 
        
        if (nuevoToken == null) 
            nuevoToken = new GenerarToken(); 
        return nuevoToken; 
        //quitar comentario para dispara la excepcion NPE: return null;
    } 
  
    public String getCodigoToken() 
    { 
        return this.codigoToken; 
    } 
} 
// Driver Code 
//import sesion07.*;
public class Ejer01Npe 
{ 
    public static void main(String[] args) 
    { 
        GenerarToken s = GenerarToken.getInstance(); 
        System.out.println(s.getCodigoToken()); 
    } 
} 
  
