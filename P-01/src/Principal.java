import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciar clases
		
		Cliente cliente1 = new Cliente("Juan Ramirez","1907-k","juan19@gmail.com",567784,1,"pasaje manolito 78");
		Cliente cliente2 = new Cliente("Maria Hernandez","1707-1","maria17@gmail.com",769784,2,"pasaje manolito 78");
		
		Empleado empleado1 = new Empleado("Alberto Nuñez","1507-1","alberto15@gmail.com",967784,1,"Despachador");
		Empleado empleado2 = new Empleado("Matias Fernandez","1507-1","alberto15@gmail.com",967784,2,"Repartidor");
		
		Proveedor proveedor1 = new Proveedor("GUSTAN","7600-0");
		Proveedor proveedor2 = new Proveedor("GUSTAN","7987-1");
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto(1, "Tomate,", proveedor1));
		productos.add(new Producto(2, "Lechuga,", proveedor1));
		productos.add(new Producto(3, "Cebolla", proveedor2));
		
		String P="";
		for (int i=0; i<productos.size(); i++) {
			P = P + productos.get(i).getNombre();
		}
		
		Pedido pedido1 = new Pedido(1,"EP1",productos);
		
		Despacho despacho1 = new Despacho(1256,cliente2,empleado2,pedido1);
		
		System.out.println("Delivery de frutas saliendo");
		System.out.println("...");
		System.out.println("Id pedido: " + despacho1.getIdDespacho()+         
				           "\n"+"cliente: " + despacho1.getCliente().getNombre()+
				           "\n"+ "Rut: " + despacho1.getCliente().getRut()+
				           "\n"+ "Dirección: " + despacho1.getCliente().getDireccion()+
				           "\n"+ "Correo: "+ despacho1.getCliente().getCorreo()+
				           "\n"+ "Telefono : "+ despacho1.getCliente().getTelefono()+
				           "\n"+"..." +
				           "\n"+"Repartidor: " + despacho1.getEmpleado().getNombre()+
				           "\n"+ "idEmpleado: " + despacho1.getEmpleado().getId()+
				           "\n"+ "Telefono : "+ despacho1.getEmpleado().getTelefono()+
				           "\n"+"..." +"\n"+
				           "DetallePedido: "+ P
				);
			
	}
	

}
