/*Productos: es un objeto producido para saciar la necesidad
de algo
autor:ligia
fecha de creacion
comentarios*/
//package EJERCICIO;
public class productos
{
    //1.propiedades
    String nombreProducto;
    String fecha_venProducto;
    String fecha_prodProducto;
    double precioProducto;
    int codigoProducto;
    public productos(String nombre,String fechav,String fechap,double preci,int cod){
        setNombreProducto(nombre);
        setFecha_VenProductof(fechav);
        setFecha_ProdProducto(fechap);
        setPrecioProducto(preci);
        setCodigoProducto(cod);
    }
    public void setNombreProducto(String nombre){
		this.nombreProducto = nombre;
	}
	
	public void setFecha_VenProductof(String fechav){
		this.fecha_venProducto = fechav;
    }
    public void setFecha_ProdProducto(String fechap){
		this.fecha_prodProducto = fechap;
	}
	
	public void setPrecioProducto(double preci){
		this.precioProducto = preci;
    }
    public void setCodigoProducto(int cod){
		this.codigoProducto = cod;
	}

    public String getNombreProducto(){
		return this.nombreProducto;
	}
	
	public String getFecha_VenProductof(){
		return this.fecha_venProducto;
	}
	
	public String getFecha_ProdProducto(){
		return this.fecha_prodProducto;
	}
	
	public double getPrecioProducto(){
		return this.precioProducto;
    }
    public double getCodigoProducto(){
		return this.codigoProducto;
	}
}