package modelo;

import javax.swing.JOptionPane;

public class Creditos extends Servicios{
	
	Corriente creditoCorriente = new Corriente();
	Vivienda creditoVivienda = new Vivienda();
	Especial creditoEspecial = new Especial ();
	
double montoCredito, cuotaPagar, interes;
int plazo;

public Creditos() { //esta parte hay que distribuirla de forma diferente ya que todos los creditos tienen un monto especifico
	//no se puede crear un ingresar en el constructor de la misma manera que lo hice en Cliente. hay que pensarla haha
	
	
}


public Corriente getCreditoCorriente() {
	return creditoCorriente;
}



public void setCreditoCorriente(Corriente creditoCorriente) {
	this.creditoCorriente = creditoCorriente;
}



public Vivienda getCreditoVivienda() {
	return creditoVivienda;
}



public void setCreditoVivienda(Vivienda creditoVivienda) {
	this.creditoVivienda = creditoVivienda;
}



public Especial getCreditoEspecial() {
	return creditoEspecial;
}



public void setCreditoEspecial(Especial creditoEspecial) {
	this.creditoEspecial = creditoEspecial;
}



public double getMontoCredito() {
	return montoCredito;
}

public void setMontoCredito(double montoCredito) {
	this.montoCredito = montoCredito;
}

public double getCuotaPagar() {
	return cuotaPagar;
}

public void setCuotaPagar(double cuotaPagar) {
	this.cuotaPagar = cuotaPagar;
}

public double getInteres() {
	return interes;
}

public void setInteres(double interes) {
	this.interes = interes;
}

public int getPlazo() {
	return plazo;
}

public void setPlazo(int plazo) {
	this.plazo = plazo;
}


public void ingresaAdministrativoCreditoCorriente() {
	setMontoCredito(calculoMontoCreditoAdministrativo());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	
}

public void ingresaDocenteCreditoCorriente() {
	setMontoCredito(calculoMontoCreditoDocente());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	
}

public void ingresaPensionadoCreditoCorriente() {
	setMontoCredito(calculoMontoCreditoPensionado());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	
}





//Calculo del monto total y cuota del credito-- ADMINISTRATIVOS 
public double calculoMontoCreditoAdministrativo() {
	double resultado =0;
	
resultado = clienteAd.getSalario()+(clienteAd.getSalario()*0.90);
return resultado;
	
}

public double calculoCoutaAdministrativo() {
	double resultado =0;
	resultado = getMontoCredito()+(getMontoCredito()*getInteres()/100);
	return resultado;
}
///////////////////////////////////////////////////////////////////////



//Calculo del monto total y cuota del credito-- DOCENTES
public double calculoMontoCreditoDocente() {
	double resultado =0;
	
resultado = clienteDo.getSalario()+(clienteDo.getSalario()*0.90);
return resultado;
	
}

public double calculoCoutaPensionados() {
	double resultado =0;
	resultado = getMontoCredito()+(getMontoCredito()*getInteres()/100);
	return resultado;
}
///////////////////////////////////////////////////////////////////////


//Calculo del monto total y cuota del credito-- PENSIONADOS 
public double calculoMontoCreditoPensionado() {
	double resultado =0;
	
resultado = clientePe.getSalario()+(clientePe.getSalario()*0.90);
return resultado;
	
}
///////////////////////////////////////////////////////////////////////


@Override
public String toString() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public String Total() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void Ingresar() {
	// TODO Auto-generated method stub
	
}


@Override
public String SoloNombre() {
	// TODO Auto-generated method stub
	return null;
}





}
