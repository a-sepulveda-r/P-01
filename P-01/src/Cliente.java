
public class Cliente extends Persona {
	private int id;
	private String direccion;
	public Cliente(String nombre, String rut, String correo, int telefono, int id, String direccion) {
		super(nombre, rut, correo, telefono);
		this.id = id;
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	


	

}
