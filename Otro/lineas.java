/*Limeas: catalogo para registrar las distintas lineas, en las cuales los
produtos son ordenados
autor:ligia
fecha de creacion:5/7/2020
comentarios*/
public class lineas
{
	//1.propiedades
	int codigoLinea;//
	String nombreLinea;
	String descripcionLinea;
	int estadoLinea;
	
	//2.metodo constructor
	public lineas(int codigo,String nombre,String descripcion,int estado){
		setCodigoLinea(codigo);
		setNombreLinea(nombre);
		setDescripcionLinea(descripcion);
		setEstadoLinea(estado);
	}//fin del constructor
    
    //sobrecarga de constructor 
    public lineas(String nombre){
        setNombreLinea(nombre);
    }
	//3.metodos setters
	public void setCodigoLinea(int codigo){
		this.codigoLinea = codigo;
	}
	
	public void setNombreLinea(String nombre){
		this.nombreLinea = nombre;
	}
	
	public void setDescripcionLinea(String descripcion){
		this.descripcionLinea = descripcion;
	}
	
	public void setEstadoLinea(int estado){
		this.estadoLinea = estado;
	}
	
	//4.metodos getters
	public int getCodigoLinea(){
		return this.codigoLinea;
	}
	
	public String getNombreLinea(){
		return this.nombreLinea;
	}
	
	public String getDescripcionLinea(){
		return this.descripcionLinea;
	}
	
	public int getEstadoLinea(){
		return this.estadoLinea;
	}

	
	
	
}