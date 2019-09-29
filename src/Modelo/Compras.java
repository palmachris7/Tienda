package Modelo;

public class Compras {

	private Producto producto;
	private double precio_compra;
	private int cantidad;
	public Compras(Producto producto, double precio_compra, int cantidad) {
		super();
		this.producto = producto;
		this.precio_compra = precio_compra;
		this.cantidad = cantidad;
	}
	public Compras() {
		super();
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
