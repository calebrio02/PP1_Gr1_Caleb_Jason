package modelo;

import javax.swing.JOptionPane;

public class Corriente extends Creditos{
	
	
double montoPCredito, hipoteca;
String tipoCliente;



public Corriente() {
	
}

public double getMontoPCredito() {
	return montoPCredito;
}

public void setMontoPCredito(double montoPCredito) {
	this.montoPCredito = montoPCredito;
}

public double getHipoteca() {
	return hipoteca;
}

public void setHipoteca(double hipoteca) {
	this.hipoteca = hipoteca;
}

public void setTipoCliente(String tipoCliente) {
	this.tipoCliente = tipoCliente;
}



public String getTipoCliente() {
	return tipoCliente;
}



public void EscogeIngresaCliente() {
	

	
	String elCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
	
	if(elCliente.equalsIgnoreCase("Docente")) {
		setTipoCliente("Docente");
		ingresaDocenteCreditoCorriente();
	}else if(elCliente.equalsIgnoreCase("Pensionado")) {
		setTipoCliente("Pensionado"); 
		ingresaPensionadoCreditoCorriente();
	}else if(elCliente.equalsIgnoreCase("Administrativo")) {
		setTipoCliente("Administrativo");
		ingresaAdministrativoCreditoCorriente();
	}
	

}

//INGRESA DE LOS TRES TIPOS DE CLIENTES PARA CREDITO CORRIENTE//
public void ingresaAdministrativoCreditoCorriente() {//Le hace falta lo que compete a hipoteca
	
	EstableceDatosAdministrativos();
	setMontoCredito(calculoMontoCreditoAdministrativoCorriente());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	setCuotaPagar(calculoCoutaCorriente());
}
public String muestraDatosAdministrativosCorriente() {
	String mensaje = "";
	mensaje += MuestraDatosAdministrativos() + "Monto del Credito: " + "\n"
	+ "Interes: " + getInteres() + "\n"
	+ "Plazo: " + getPlazo() + "\n"
	+ "Cuota a pagar: " + getCuotaPagar();
			
	return mensaje;
}
public void ingresaDocenteCreditoCorriente() {
	
	EstableceDatosDocente();
	setMontoCredito(calculoMontoCreditoDocenteCorriente());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	setCuotaPagar(calculoCoutaCorriente());
}

public String muestraDatosDocentesCorriente() {
	String mensaje = "";
	mensaje += MuestraDatosDocentes()+ "Monto del Credito: " + "\n"
	+ "Interes: " + getInteres() + "\n"
	+ "Plazo: " + getPlazo() + "\n"
	+ "Cuota a pagar: " + getCuotaPagar();
			
	return mensaje;
}

public void ingresaPensionadoCreditoCorriente() {
	
	EstableceDatosPensionado();
	setMontoCredito(calculoMontoCreditoPensionadoCorriente());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	setCuotaPagar(calculoCoutaCorriente());
}

public String muestraDatosPensionadosCorriente() {
	String mensaje = "";
	mensaje += MuestraDatosPensionados() + "Monto del Credito: " + "\n"
	+ "Interes: " + getInteres() + "\n"
	+ "Plazo: " + getPlazo() + "\n"
	+ "Cuota a pagar: " + getCuotaPagar();
			
	return mensaje;
}

///////////////////////////////////////////////////////////////////////


//Calculo del monto total  del credito CORRIENTE-- ADMINISTRATIVOS 
public double calculoMontoCreditoAdministrativoCorriente() {
	double resultado =0;
	
resultado = clienteAd.getSalario()+(clienteAd.getSalario()*0.90);
return resultado;
	
}

///////////////////////////////////////////////////////////////////////



//Calculo del monto total CORRIENTE-- DOCENTES
public double calculoMontoCreditoDocenteCorriente() {
	double resultado =0;
	
resultado = clienteDo.getSalario()+(clienteDo.getSalario()*0.90);
return resultado;
	
}

///////////////////////////////////////////////////////////////////////


//Calculo del monto total del credito CORRIENTE-- PENSIONADOS 
public double calculoMontoCreditoPensionadoCorriente() {
	double resultado =0;
	
resultado = clientePe.getSalario()+(clientePe.getSalario()*0.90);
return resultado;
	
}
///////////////////////////////////////////////////////////////////////

//CALCULO DE LA CUOTA DEL CREDITO CORRIENTE-FUNCIONA PARA TODOS LOS TIPOS DE CLIENTES EN CREDITO CORRIENTE

public double calculoCoutaCorriente() {
	double resultado =0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100))/getPlazo();
	return resultado;
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
		mensaje = muestraDatosAdministrativosCorriente();
	}else if(getTipoCliente().equalsIgnoreCase("Docente")) {
		mensaje = muestraDatosDocentesCorriente();
	}else if(getTipoCliente().equalsIgnoreCase("Pensionado")) {
		mensaje = muestraDatosPensionadosCorriente();
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