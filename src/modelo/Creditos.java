package modelo;

import javax.swing.JOptionPane;

public class Creditos {
	
	Corriente creditoCorriente = new Corriente();
	Vivienda creditoVivienda = new Vivienda();
	Especial creditoEspecial = new Especial ();
	
double montoCredito, cuotaPagar, interes;
int plazo;

public Creditos() { //esta parte hay que distribuirla de forma diferente ya que todos los creditos tienen un monto especifico
	//no se puede crear un ingresar en el constructor de la misma manera que lo hice en Cliente. hay que pensarla haha
	setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto del credito")));
	
	
}

public void escogerTipoCredito() {
	String tipoCredito = (JOptionPane.showInputDialog(null, "Selecciona la categoria de docente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Corriente", "Vivienda", "Especial"}, "Selecciona")).toString() ;
	
	if(tipoCredito.equalsIgnoreCase("Corriente")) {
	
	}
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


}
