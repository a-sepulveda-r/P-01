import java.util.ArrayList;

public class Pedido {
	private int id;
	private String descripcion;
	private ArrayList<Producto> producto;
	public Pedido(int id, String descripcion, ArrayList<Producto> producto) {
		this.id = id;
		this.descripcion = descripcion;
		this.producto = producto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<Producto> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}
	
	

}
