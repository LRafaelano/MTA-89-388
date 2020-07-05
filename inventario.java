/* Inventario: utiliza las clases medida, proveedores,lineas y catalogo productos
para administrar operaciones de datos (creacion,lectura,actualizacion y eliminacion) del incventario
autor:ligia 
fecha creacion 
comentarios */
import java.util.Scanner;
//import ejercicio.*;
public class inventario{
	public static void main(final String[] args) {
		// 1.mensaje explicativo
		System.out.println();
		System.out.println("Programa para la gestion del inventario");
		// 2.instancia de la clase Scanner para la captura de datos
		 Scanner entradaDatos = new Scanner(System.in);
		// 3.captura de datos de entrada
		String resp = "si";
		//usar do while
		while (resp.equals("si")) {
			System.out.println("-----------PRODUCTO-----------");
			System.out.println("Agregacion de un NUEVO PRODUCTO");
			System.out.println("Digite codigo del producto");
			 int codigop= Integer.parseInt(entradaDatos.nextLine());

			System.out.println("Digite el nombre del producto");
			 String nombrep=entradaDatos.nextLine();

			System.out.println("Digite la fecha de vencimiento del producto");
			 String fechaven=entradaDatos.nextLine();

			System.out.println("Digite la fecha de produccion del producto");
			 String fechapro=entradaDatos.nextLine();

			System.out.println("Digite el precio del producto");
			 double preciop=entradaDatos.nextDouble();

			 productos pro = new productos(nombrep, fechaven, fechapro, preciop,codigop);
			
			//5.salida de datos Unidad de Medida 
			System.out.println("Los datos han sido registrados");
			System.out.println("Codigo: " + pro.getCodigoProducto());
			System.out.println("Nombre: " + pro.getNombreProducto());
			System.out.println("Fecha de Vencimiento: " + pro.getFecha_VenProductof());
			System.out.println("Fecha de produccion: " + pro.getFecha_ProdProducto());
			System.out.println("Precio : " + pro.getPrecioProducto());
			//finalizacion clases productos
			System.out.println("////////////////////////////////////////");
			System.out.println("-----------UNIDAD DE MEDIDA-----------");
			System.out.println("Agregacion de una nueva unidad de medida");
			System.out.println("Digite el codigo de la unida de medida");

			// nota: necesito dar un salto de carror(enter) o bien hacer una conversion de
			// datos
			// enfoque 1
			// int codigo=entradaDatos.nextInt();
			// 1.entradaDatos.nextLine();
			entradaDatos.nextLine();
			// enfoque2
			 int codigo = Integer.parseInt(entradaDatos.nextLine());

			System.out.println("Digite el nombre de la unidad de medida");
			 String nombre = entradaDatos.nextLine();

			System.out.println("Digite la descripcion de la unidad de medida");
			 String descripcion = entradaDatos.nextLine();

			System.out.println("Digite 1 para estado activo, 0 para inactivo");
			 int estado = entradaDatos.nextInt();

			// 4.creacion de la instacia Unidad de Medida
			 Umedidas um = new Umedidas(codigo, nombre, descripcion, estado);
			
			//5.salida de datos Unidad de Medida 
			System.out.println("Los datos han sido registrados");
			System.out.println("Codigo: " + um.getCodigoUmedida());
			System.out.println("Nombre: " + um.getNombreUmedida());
			System.out.println("Descripcion: " + um.getDescripcionUmedida());
			System.out.print("Estado: " );
			if(um.getEstadoUmedida() == 1){

				System.out.println("Activo");
			}
			//finalizacion clases Umedidas
			entradaDatos.nextLine();
			System.out.println("++++++++++++++++++++++++++++++++");
			System.out.println("-----------PROVEEDOR-----------");
			System.out.println("Agregacion de un NUEVO PROVEEDOR");

			System.out.println("Digite el nombre del proveedor");
			String nombrePro = entradaDatos.nextLine();

			System.out.println("Digite el sector comercial del proveedor");
			String sectorPro = entradaDatos.nextLine();

			System.out.println("Digite el telefono del proveedor");
			String telefonoPro = entradaDatos.nextLine();

			System.out.println("Digite el email del proveedor");
			String emailPro = entradaDatos.nextLine();

			System.out.println("Digite el numero de identificacion del proveedor");
			String nIdentiPro = entradaDatos.nextLine();

			proveedores prov= new proveedores(nombrePro,sectorPro,telefonoPro,emailPro,nIdentiPro);

			System.out.println("Los datos han sido registrados");
			System.out.println("Nombre: " + prov.getNombreProveedor());
			System.out.println("Sector Comercial: " + prov.getSectorComercialProveedorr());
			System.out.println("Telefono: " + prov.getTelefonoProveedor());
			System.out.println("Email : " + prov.getEmailProvedor());
			System.out.println("Numero de identificacion: " + prov.getNidentificacionProvedor());
			//finalizacion clases proveedores
			System.out.println("++++++++++++++++++++++++++++++++");
			System.out.println("-----------LINEAS-----------");
			System.out.println("Agregacion de una nueva linea de productos");

			System.out.println("Digite el codigo de la linea");
			codigo = Integer.parseInt(entradaDatos.nextLine());

			System.out.println("Digite el nombre de la linea");
			nombre = entradaDatos.nextLine();

			System.out.println("Digite la descripcion de la linea");
			descripcion = entradaDatos.nextLine();

			System.out.println("Digite 1 para estado activo, 0 para inactivo");
			estado = entradaDatos.nextInt();
			

			lineas nlinea= new lineas (codigo,nombre,descripcion,estado);
			System.out.println("Los datos han sido registrados");
			System.out.println("Codigo: " + nlinea.getCodigoLinea());
			System.out.println("Nombre: " + nlinea.getNombreLinea());
			System.out.println("Descripcion: " + nlinea.getDescripcionLinea());
			System.out.print("Estado: " );
			if(nlinea.getEstadoLinea() == 1){

				System.out.println("Activo");
			}

			System.out.println("*********************************** ");
			entradaDatos.nextLine();
			System.out.println("¿Desea ingresar más informacion?");
			System.out.println("si");
			System.out.println("no");
			resp=entradaDatos.nextLine();
			System.out.println("*********************************** ");
			System.out.println(" ");
		}
			
		
	}
}