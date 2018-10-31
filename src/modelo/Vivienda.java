package modelo;

import javax.swing.JOptionPane;

public class Vivienda extends Creditos  {
String direccionPropiedad;
double tamano, peritaje;
String tipoCliente;


public String getTipoCliente() {
	return tipoCliente;
}

public void setTipoCliente(String tipoCliente) {
	this.tipoCliente = tipoCliente;
}

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
	
  setDireccionPropiedad(JOptionPane.showInputDialog("Ingrese la direccion de la propiedad"));
  setTamano(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamano de la propiedad")));
  setPeritaje(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peritaje de la propiedad (valor de propiedad)")));
}



public void EscogeIngresaCliente() {
	

	
	String elCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
	
	if(elCliente.equalsIgnoreCase("Docente")) {
		setTipoCliente("Docente");
		ingresaDocenteCreditoVivienda();;
	}else if(elCliente.equalsIgnoreCase("Pensionado")) {
		setTipoCliente("Pensionado"); 
		ingresaPensionadoCreditoVivienda();;
	}else if(elCliente.equalsIgnoreCase("Administrativo")) {
		setTipoCliente("Administrativo");
		ingresaAdministrativoCreditoVivienda();
	}
	

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

public String muestraDatosAdministrativoVivienda() {
	String mensaje = "";
	mensaje += MuestraDatosAdministrativos() + "Monto del Credito: " + "\n"
	+ "Interes: " + getInteres() + "\n"
	+ "Plazo: " + getPlazo() + "\n"
	+ "Cuota a pagar: " + getCuotaPagar() + "\n"
	+ "Direccion de la propiedad: " + getDireccionPropiedad()+ "\n"
	+ "Tamano de la propiedad: " + getTamano() + "\n" 
	+ "Peritaje: " + getPeritaje();
			
	return mensaje;
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

public String muestraDatosDocenteVivienda() {
	String mensaje = "";
	mensaje += MuestraDatosDocentes() + "Monto del Credito: " + "\n"
	+ "Interes: " + getInteres() + "\n"
	+ "Plazo: " + getPlazo() + "\n"
	+ "Cuota a pagar: " + getCuotaPagar() + "\n"
	+ "Direccion de la propiedad: " + getDireccionPropiedad()+ "\n"
	+ "Tamano de la propiedad: " + getTamano() + "\n" 
	+ "Peritaje: " + getPeritaje();
			
	return mensaje;
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

public String muestraDatosPensionadovivienda() {
	String mensaje = "";
	mensaje += MuestraDatosPensionados()+ "Monto del Credito: " + "\n"
	+ "Interes: " + getInteres() + "\n"
	+ "Plazo: " + getPlazo() + "\n"
	+ "Cuota a pagar: " + getCuotaPagar() + "\n"
	+ "Direccion de la propiedad: " + getDireccionPropiedad()+ "\n"
	+ "Tamano de la propiedad: " + getTamano() + "\n" 
	+ "Peritaje: " + getPeritaje();
			
	return mensaje;
}


public double calculoCuotaVivienda() {
	double resultado=0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100)+(getMontoCredito()*10/100))/getPlazo();
	return resultado;
}
public String muestraDni() {
	String mensaje = "";
	
	if(getTipoCliente().equalsIgnoreCase("Administrativo")) {
		mensaje = clienteAd.getDni();
	}else if(getTipoCliente().equalsIgnoreCase("Docente")) {
		mensaje = clienteDo.getDni();
	}else if(getTipoCliente().equalsIgnoreCase("Pensionado")) {
		mensaje = clientePe.getDni();
	}
	return mensaje;
}



public String muestraCualquiera() {
	
	String mensaje = "";
	if(getTipoCliente().equalsIgnoreCase("Administrativo")) {
		mensaje = muestraDatosAdministrativoVivienda();
	}else if(getTipoCliente().equalsIgnoreCase("Docente")) {
		mensaje = muestraDatosDocenteVivienda();
	}else if(getTipoCliente().equalsIgnoreCase("Pensionado")) {
		mensaje = muestraDatosPensionadovivienda();
	}
	
	return mensaje;
}

@Override
public String SoloDNI() {
	// TODO Auto-generated method stub
	return muestraDni();
}

@Override
public void Ingresar() {
	EscogeIngresaCliente();
	// TODO Auto-generated method stub
	
}

@Override
public String Muestra() {
	// TODO Auto-generated method stub
	return muestraCualquiera();
}
}