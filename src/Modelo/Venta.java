package Modelo;

import java.util.List;

public class Venta {

	private Cliente cliente;
	private Usuario usuario;
	private List<DetalleVenta> detalle;
	public Venta(Cliente cliente, List<DetalleVenta> detalle) {
		super();
		this.cliente = cliente;
		this.detalle = detalle;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<DetalleVenta> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<DetalleVenta> detalle) {
		this.detalle = detalle;
	}
	

}
