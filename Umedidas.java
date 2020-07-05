/*Unidad de Medida: ctalogo para registrar las distintas
unidades de medida en las cuales son comercializados los productos
autor:ligia
fecha de creacion
comentarios*/
//package EJERCICIO;
public class Umedidas
{
	//1.propiedades
	int codigoUmedida;//
	String nombreUmedida;
	String descripcionUmedida;
	int estadoUmedida;
	
	//2.metodo constructor
	public Umedidas(int codigo,String nombre,String descripcion,int estado){
		setCodigoUmedida(codigo);
		setNombreUmedida(nombre);
		setDescripcionUmedida(descripcion);
		setEstadoUmedida(estado);
	}//fin del constructor
	
	//3.metodos setters
	public void setCodigoUmedida(int codigo){
		this.codigoUmedida = codigo;
	}
	
	public void setNombreUmedida(String nombre){
		this.nombreUmedida = nombre;
	}
	
	public void setDescripcionUmedida(String descripcion){
		this.descripcionUmedida = descripcion;
	}
	
	public void setEstadoUmedida(int estado){
		this.estadoUmedida = estado;
	}
	
	//4.metodos getters
	public int getCodigoUmedida(){
		return this.codigoUmedida;
	}
	
	public String getNombreUmedida(){
		return this.nombreUmedida;
	}
	
	public String getDescripcionUmedida(){
		return this.descripcionUmedida;
	}
	
	public int getEstadoUmedida(){
		return this.estadoUmedida;
	}

	
	
	
}