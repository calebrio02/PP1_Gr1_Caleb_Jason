package modelo;

import javax.swing.JOptionPane;

public abstract class Servicios {
	
	Administrativos clienteAd = new Administrativos();
	Docentes clienteDo = new Docentes();
	Pensionados clientePe = new Pensionados();



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
