package modelo;

import javax.swing.JOptionPane;

public abstract class Servicios {
	
	
	Creditos creditos = new Creditos();
	PlanesAhorro planes = new PlanesAhorro();
	Administrativos clienteAd = new Administrativos();
	Docentes clienteDo = new Docentes();
	Pensionados clientePe = new Pensionados();


	public Creditos getCreditos() {
		return creditos;
	}


	public void setCreditos(Creditos creditos) {
		this.creditos = creditos;
	}


	public PlanesAhorro getPlanes() {
		return planes;
	}


	public void setPlanes(PlanesAhorro planes) {
		this.planes = planes;
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




}
