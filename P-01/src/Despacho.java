
public class Despacho {
	private int idDespacho;
	private Cliente cliente;
	private Empleado empleado;
	private Pedido pedido;
	public Despacho(int idDespacho, Cliente cliente, Empleado empleado, Pedido pedido) {
		this.idDespacho = idDespacho;
		this.cliente = cliente;
		this.empleado = empleado;
		this.pedido = pedido;
	}
	public int getIdDespacho() {
		return idDespacho;
	}
	public void setIdDespacho(int idDespacho) {
		this.idDespacho = idDespacho;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	

}
