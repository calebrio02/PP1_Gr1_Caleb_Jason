package modelo;

public abstract class Servicios {//CALSE ABSTRACTA 
	///////////////////////////////////////////////////
	Administrativos clienteAd = new Administrativos();//
	Docentes clienteDo = new Docentes();//////////////// 
	Pensionados clientePe = new Pensionados();/////////
////SE CREAN OBJETOS DE TIPO CLIENTE PARA QUE A PARTIR DE AQUI LA JERARQUIA BAJA TENGA ACCESO A ESOS DATOS
	
	private int cod;//VARIABLE NECESARIA PARA ASIGNAR CODIGOS A LOS OBJETOS QUE SERAN AGREGADOS POSTERIORMENTE AL ARREGLO

public int getCod() {
		return cod;
	}


public void setCod(int cod) {
		this.cod = cod;
	}


public Administrativos getClienteAd() {
		return clienteAd;
	}


public void setClienteAd(Administrativos clienteAd) {
		this.clienteAd = clienteAd;
	}


public Docentes getClienteDo() {
		return clienteDo;
	}

public void setClienteDo(Docentes clienteDo) {
		this.clienteDo = clienteDo;
	}


public Pensionados getClientePe() {
		return clientePe;
	}


public void setClientePe(Pensionados clientePe) {
		this.clientePe = clientePe;
	}
public void EstableceDatosAdministrativos() {
	clienteAd.ingresarAdministrativos();
}
public void EstableceDatosDocente() {
	clienteDo.IngresaDocente();
}
public void EstableceDatosPensionado() {
	clientePe.IngresaPensionado();
}
public String MuestraDatosAdministrativos() {
	return clienteAd.RespuestaAdministrativos();
}
public String MuestraDatosDocentes() {
	return clienteDo.RespuestaDocente();
}
public String MuestraDatosPensionados() {
	return clientePe.RespuestaPensionado();
}

public abstract String SoloDNI();//metodo abstracto para mostrar SOLO EL DNI

public abstract void Ingresar();//metodo abstracto para ingresar datos

public abstract String Muestra() ;

public abstract String toString();//METODO ABSTRACTO PARA MOSTRAR CUALQUIER TIPO DE DATO

}
