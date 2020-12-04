package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

public class RegistroCompraCE {

	private List<FacturaCE> facturalist;

	public RegistroCompraCE() {
		this.facturalist= new ArrayList<FacturaCE>();
		
		// TODO Auto-generated constructor stub
	}

	public void guardarCompra(FacturaCE f) {
		this.facturalist.add(f);
	}
	
	
	public List<FacturaCE> getFacturalist() {
		return facturalist;
	}

	public void setFacturalist(List<FacturaCE> facturalist) {
		this.facturalist = facturalist;
	}

	@Override
	public String toString() {
		return "RegistroCompra [facturalist=" + facturalist + "]";
	}
}
