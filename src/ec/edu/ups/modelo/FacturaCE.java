package ec.edu.ups.modelo;

public class FacturaCE {
	private int id_factura;
	private double precio_unitario;
	private int cantidad;
	private double total_venta;
	private LibroImpresoCE fisico;
	private LibroDigitalCE digital;
	private ClienteCE cliente;
	
	public FacturaCE() {
		super();
	}

	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}

	public LibroImpresoCE getFisico() {
		return fisico;
	}

	public void setFisico(LibroImpresoCE fisico) {
		this.fisico = fisico;
	}

	public LibroDigitalCE getDigital() {
		return digital;
	}

	public void setDigital(LibroDigitalCE digital) {
		this.digital = digital;
	}
	
	
	
	public ClienteCE getCliente() {
		return cliente;
	}

	public void setCliente(ClienteCE cliente) {
		this.cliente = cliente;
	}

	public void calcularTotal(double punit, int cant) {
		double n=0;
		double total=0;
		if (this.digital==null) {
			n=this.fisico.calcularPrecio();	
			//System.out.println("comision impreso"+n);
			
		} else {
			n=this.digital.calcularPrecio();
			//System.out.println("comision digital"+n);
		}
		
		total=n*cant;
		this.setTotal_venta(total);
		this.cliente.disminuirCredito(this.getTotal_venta());
	}

	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", precio_unitario=" + precio_unitario + ", cantidad=" + cantidad
				+ ", total_venta=" + total_venta + ", fisico=" + fisico + ", digital=" + digital + ", cliente="
				+ cliente + "]";
	}
	
}
