
public class Persona {
	private String nombre;
	private String rut;
	private String correo;
	private int telefono;
	
	public Persona(String nombre, String rut, String correo, int telefono) {
		this.nombre = nombre;
		this.rut = rut;
		this.correo = correo;
		this.telefono = telefono;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	

}
