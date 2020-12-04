package ec.edu.ups.modelo;

public class LibroImpresoCE extends LibroCE{

	@Override
	public double calcularComision() {
		
		double comision=(this.getPrecio()*0.02)+20;
		return comision;
	}

}
