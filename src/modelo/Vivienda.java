package modelo;

import javax.swing.JOptionPane;

public class Vivienda extends Creditos  {
String direccionPropiedad;
double tamano, peritaje;



public String getDireccionPropiedad() {
	return direccionPropiedad;
}

public void setDireccionPropiedad(String direccionPropiedad) {
	this.direccionPropiedad = direccionPropiedad;
}

public double getTamano() {
	return tamano;
}

public void setTamano(double tamano) {
	this.tamano = tamano;
}

public double getPeritaje() {
	return peritaje;
}

public void setPeritaje(double peritaje) {
	this.peritaje = peritaje;
}

public void estableceVivienda() {
	

}




//INGRESA DE LOS TIPOS DE CLIENTES PARA CREDITO VIVIENDA//
public void ingresaAdministrativoCreditoVivienda() {
	EstableceDatosAdministrativos();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(de 20 000 000 a 81 000 000 )")));	
		if(getMontoCredito()<20000000||getMontoCredito()>81000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 20 000 000 a 81 000 000");
		}
	}while(getMontoCredito()<20000000||getMontoCredito()>81000000);
	setInteres(16);
	do {
		setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el plazo(Debe estar entre 144 y 360 meses)")));
			if(getPlazo()<144||getPlazo()>360) {
				JOptionPane.showMessageDialog(null, "El plazo debe estar entre 144 y 360 meses");
			}
	}while(getPlazo()<144||getPlazo()>360);
	setCuotaPagar(calculoCuotaVivienda());
	estableceVivienda();
}


public void ingresaDocenteCreditoVivienda() {
	EstableceDatosDocente();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(de 20 000 000 a 81 000 000 )")));	
		if(getMontoCredito()<20000000||getMontoCredito()>81000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 20 000 000 a 81 000 000");
		}
	}while(getMontoCredito()<20000000||getMontoCredito()>81000000);
	setInteres(16);
	do {
		setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el plazo(Debe estar entre 144 y 360 meses)")));
			if(getPlazo()<144||getPlazo()>360) {
				JOptionPane.showMessageDialog(null, "El plazo debe estar entre 144 y 360 meses");
			}
	}while(getPlazo()<144||getPlazo()>360);
	setCuotaPagar(calculoCuotaVivienda());
	estableceVivienda();
}


public void ingresaPensionadoCreditoVivienda() {
	EstableceDatosPensionado();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(de 20 000 000 a 81 000 000 ) para ")));	
		if(getMontoCredito()<20000000||getMontoCredito()>81000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 20 000 000 a 81 000 000");
		}
	}while(getMontoCredito()<20000000||getMontoCredito()>81000000);
	setInteres(16);
	do {
		setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el plazo(Debe estar entre 144 y 360 meses)")));
			if(getPlazo()<144||getPlazo()>360) {
				JOptionPane.showMessageDialog(null, "El plazo debe estar entre 144 y 360 meses");
			}
	}while(getPlazo()<144||getPlazo()>360);
	setCuotaPagar(calculoCuotaVivienda());
	estableceVivienda();
}
public double calculoCuotaVivienda() {
	double resultado=0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100)+(getMontoCredito()*10/100))/getPlazo();
	return resultado;
}
}