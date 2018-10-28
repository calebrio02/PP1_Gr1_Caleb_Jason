package modelo;

public abstract class Servcios {
	
	TiposClientes Clientes = new TiposClientes();

	
public TiposClientes getClientes() {
		return Clientes;
	}

public void setClientes(TiposClientes clientes) {
		Clientes = clientes;
	}
	


}
