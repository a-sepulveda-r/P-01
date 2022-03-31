
public class Empleado extends Persona {
	private int id;
	private String cargo;
	public Empleado(String nombre, String rut, String correo, int telefono, int id, String cargo) {
		super(nombre, rut, correo, telefono);
		this.id = id;
		this.cargo = cargo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
}
