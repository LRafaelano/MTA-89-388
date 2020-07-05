/*Proveedores: Son los responsables de proveer productos a
la empresa
autor:ligia
fecha de creacion
comentarios*/
//package EJERCICIO;
public class proveedores
{
    String nombreProveedor;
    String sectorComercialProveedor;
    String telefonoProveedor;
    String emailProveedor;
    String nIentificacionProveedor;

    public proveedores(String nombre,String sectorComercial,String telefono,String email,String nIdentificacion){
        setNombreProveedor(nombre);
        setSectorComercialProveedor(sectorComercial);
        setTelefonoProveedor(telefono);
        setEmailProvedor(email);
        setNidentificacionProvedor(nIdentificacion);
    }

    public void  setNombreProveedor(String nombre){
        this.nombreProveedor=nombre;
    }
    public void  setSectorComercialProveedor(String sectorComercial){
        this.sectorComercialProveedor=sectorComercial;
    }
    public void  setTelefonoProveedor(String telefono){
        this.telefonoProveedor=telefono;
    }
    public void  setEmailProvedor(String email){
        this.emailProveedor=email;
    }
    public void  setNidentificacionProvedor(String nIdentificacion){
        this.nIentificacionProveedor=nIdentificacion;
    }

    public String getNombreProveedor(){
        return this.nombreProveedor;
    }
    public String getSectorComercialProveedorr(){
        return this.sectorComercialProveedor;
    }
    public String getTelefonoProveedor(){
        return this.telefonoProveedor;
    }
    public String getEmailProvedor(){
        return  this.emailProveedor;
    }
    public String getNidentificacionProvedor(){
        return this.nIentificacionProveedor;
    }

}