package modelo;

import javax.swing.JOptionPane;

public class Corriente extends Creditos {
	
	
double montoPCredito, hipoteca;

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
}