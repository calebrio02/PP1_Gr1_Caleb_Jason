package modelo;

public abstract class Servcios {
	
	TiposClientes Clientes = new TiposClientes();

public void IngresarPensionados() {	
	Clientes.IngresarPensionados();
}
public void IngresarDocentes() {
	Clientes.IngresarDocentes();
}
/*public void IngresarAdministrativos() {
	Clientes.IngresarAdministrativos();
}
public TiposClientes getClientes() {
		return Clientes;
	}*/

public void setClientes(TiposClientes clientes) {
		Clientes = clientes;
	}

}
