package Modelo;

public class DetalleVenta {
	private Producto producto;
	private double precio_venta;
	private int cantidad;
	public DetalleVenta(Producto producto, double precio_venta, int cantidad) {
		super();
		this.producto = producto;
		this.precio_venta = precio_venta;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
