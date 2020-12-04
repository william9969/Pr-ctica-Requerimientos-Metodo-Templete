package ec.edu.ups.interfaz;

import java.util.ArrayList;
import java.util.Scanner;

import ec.edu.ups.modelo.*;

public class ComercioElectronicoTest {
	static LibroDigitalCE libroDigital;
	static LibroDigitalCE libroDigital1;
	static LibroDigitalCE libroDigital2;
	static LibroImpresoCE libroImpreso;
	static LibroImpresoCE libroImpreso1;
	static LibroImpresoCE libroImpreso2;
	
	static ClienteCE cliente;
	static ClienteCE cliente1;
	static ClienteCE cliente2;
	static ClienteCE cliente3;
	
	static FacturaCE factura;
	static FacturaCE factura1;
	static FacturaCE factura2;
	static FacturaCE factura3;
	
	static RegistroCompraCE registro;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("*******Iniciando Comercio Electronico******");
		System.out.println("Agregando Libros");
		agregarLibros();
		System.out.println("Agregando Clientes");
		agregarCliente();
		System.out.println("Agregando Facturas");
		System.out.println("Registrando Compras");
		generarCompra();
		
		int x = 0;
		
		
		while (x < 5)
        {
			System.out.println("*******Sistema de Comercio Electronico Iniciado******");
			System.out.println("**Escoja la opcion**");
			System.out.println("1. Listar Libros Digitales");
			System.out.println("2. Listar Libros Impresos");
			System.out.println("3. Listar Clientes");
			System.out.println("4. Listar Compras");
			System.out.println("5. Salir");
			x = sc.nextInt();
			switch (x) {
				case 1:
					System.out.println("---------------------------------------------------");
					System.out.println("***** Primer Libro");
					System.out.println(libroDigital.toString());
					System.out.println("---------------------------------------------------");
					System.out.println("***** Segundo Libro");
					System.out.println(libroDigital1.toString());
					System.out.println("---------------------------------------------------");
					System.out.println("***** Tercer Libro");
					System.out.println(libroDigital2.toString());
					break;
				case 2:
					System.out.println("---------------------------------------------------");
					System.out.println("***** Primer Libro");
					System.out.println(libroImpreso.toString());
					System.out.println("---------------------------------------------------");
					System.out.println("***** Segundo Libro");
					System.out.println(libroImpreso1.toString());
					System.out.println("---------------------------------------------------");
					System.out.println("***** Tercer Libro");
					System.out.println(libroImpreso2.toString());
					break;
				case 3:
					System.out.println("---------------------------------------------------");
					System.out.println("***** Primer Cliente");
					System.out.println(cliente.toString());
					System.out.println("---------------------------------------------------");
					System.out.println("***** Segundo Cliente");
					System.out.println(cliente1.toString());
					System.out.println("---------------------------------------------------");
					System.out.println("***** Tercer Cliente");
					System.out.println(cliente2.toString());
					System.out.println("---------------------------------------------------");
					System.out.println("***** Cuarto Cliente");
					System.out.println(cliente3.toString());
					break;
				case 4:
					System.out.println("---------------------------------------------------");
					System.out.println("Primera Compra \n"+cliente.recuperaCompras(cliente,registro));
					System.out.println("---------------------------------------------------");
					System.out.println("Segunda Compra \n"+cliente.recuperaCompras(cliente1,registro));
					System.out.println("----------------------------------------------------");
					System.out.println("Tercera Compra \n"+cliente.recuperaCompras(cliente2,registro));
					System.out.println("----------------------------------------------------");
					System.out.println("Cuarta Compra \n"+cliente.recuperaCompras(cliente3,registro));
					break;
				case 5:
						System.exit(0);
					break;
				default:
					System.out.println("No es un dato correcto");
			}
			
        }
		
			
		

	}
	
	public static void agregarLibros() {
		libroDigital= new LibroDigitalCE();
		libroDigital.setId(1);
		libroDigital.setAutor("Mauro Pulla");
		libroDigital.setEdicion("1ra edicion");
		libroDigital.setTitulo("Programacion I");
		libroDigital.setPrecio(25);
		
		libroDigital1= new LibroDigitalCE();
		libroDigital1.setId(2);
		libroDigital1.setAutor("Juan Manuel");
		libroDigital1.setEdicion("2da edicion");
		libroDigital1.setTitulo("Programacion II");
		libroDigital1.setPrecio(18);
		
		libroDigital2= new LibroDigitalCE();
		libroDigital2.setId(3);
		libroDigital2.setAutor("Jose Miguel");
		libroDigital2.setEdicion("3ra edicion");
		libroDigital2.setTitulo("Programacion III");
		libroDigital2.setPrecio(15);
		/////////////////////////////////////////////////////////
		libroImpreso= new LibroImpresoCE();
		libroImpreso.setId(1);
		libroImpreso.setAutor("Mario Juarez");
		libroImpreso.setEdicion("1ra edicion");
		libroImpreso.setTitulo("Base Datos I");
		libroImpreso.setPrecio(29);
		
		
		libroImpreso1= new LibroImpresoCE();
		libroImpreso1.setId(2);
		libroImpreso1.setAutor("Maria Fernandez");
		libroImpreso1.setEdicion("2da edicion");
		libroImpreso1.setTitulo("Base Datos II");
		libroImpreso1.setPrecio(20);
		
		libroImpreso2 = new LibroImpresoCE();
		libroImpreso2.setId(3);
		libroImpreso2.setAutor("Jose Manuel");
		libroImpreso2.setEdicion("3ra edicion");
		libroImpreso2.setTitulo("Base Datos III");
		libroImpreso2.setPrecio(31);
		
	}
	public static void agregarCliente() {
		cliente = new ClienteCE("Issac","Chavez","0106541789","0992541775", 4000.00);
		cliente1 = new ClienteCE("Jessica","Guncay","0102214589","0994755201", 3000.80);
		cliente2 = new ClienteCE("William","Sinchi","0106002108","0980217186", 2000.00);
		cliente3 = new ClienteCE("Jorge","Yela","0104478512","0955471236", 5000.00);
		
	}
	
	
	public static void generarCompra() {
		 	factura= new FacturaCE();
		 	factura.setId_factura(1);
		 	factura.setPrecio_unitario(libroDigital.getPrecio());
		 	factura.setCantidad(3);
		 	factura.setDigital(libroDigital);
		 	factura.setCliente(cliente);
		 	factura.calcularTotal(factura.getPrecio_unitario(), factura.getCantidad());
		 	cliente.disminuirCredito(libroDigital.getPrecio());
			
		 	factura1= new FacturaCE();
		 	factura1.setId_factura(2);
		 	factura1.setPrecio_unitario(libroImpreso.getPrecio());
		 	factura1.setCantidad(4);
		 	factura1.setFisico(libroImpreso);
		 	factura1.setCliente(cliente1);
		 	factura1.calcularTotal(factura1.getPrecio_unitario(), factura1.getCantidad());
		 	cliente1.disminuirCredito(libroImpreso.getPrecio());
		
		 	factura3= new FacturaCE();
		 	factura3.setId_factura(4);
		 	factura3.setPrecio_unitario(libroDigital2.getPrecio());
		 	factura3.setCantidad(1);
		 	factura3.setDigital(libroDigital2);
		 	factura3.setCliente(cliente3);
		 	factura3.calcularTotal(factura3.getPrecio_unitario(), factura3.getCantidad());
		 	cliente3.disminuirCredito(libroDigital2.getPrecio());
		 	
		 	factura2= new FacturaCE();
		 	factura2.setId_factura(3);
		 	factura2.setPrecio_unitario(libroImpreso2.getPrecio());
		 	factura2.setCantidad(8);
		 	factura2.setFisico(libroImpreso2);
		 	factura2.setCliente(cliente2);
		 	factura2.calcularTotal(factura2.getPrecio_unitario(), factura2.getCantidad());
		 	cliente2.disminuirCredito(libroImpreso2.getPrecio());
			
		 	registro= new RegistroCompraCE();
		 	registro.guardarCompra(factura);
		 	registro.guardarCompra(factura1);
		 	registro.guardarCompra(factura2);
		 	registro.guardarCompra(factura3);
	}
	
	

}
